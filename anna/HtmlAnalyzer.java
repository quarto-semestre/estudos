package anna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HtmlAnalyzer {

    public static void main(String[] args) {
        System.out.println("Forneca uma URL: ");
        Scanner sc = new Scanner(System.in);
        String link = sc.nextLine();

        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                String deepestText = null;
                String deepestTag = null;
                int maxDepth = 0;
                int currentDepth = 0;
                boolean malformedHTML = false;

                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (line.isEmpty() || line.startsWith("<") || line.startsWith(">")) {
                        continue;
                    }

                    if (line.contains("</")) {
                        currentDepth--;
                    }

                    if (line.contains("<")) {
                        if (!line.contains("</")) {
                            currentDepth++;
                        }
                        if (line.endsWith("/>")) {
                            continue;
                        }
                    }

                    if (currentDepth > maxDepth) {
                        maxDepth = currentDepth;
                        deepestText = line;
                        deepestTag = getTagName(line);
                    }

                    if (currentDepth < 0) {
                        malformedHTML = true;
                        break;
                    }
                }

                if (malformedHTML) {
                    System.out.println("malformed HTML");
                } else if (deepestText != null) {
                    System.out.println("Trecho de texto mais profundo: " + deepestText);
                    System.out.println("Tag mais profunda: <" + deepestTag + ">");
                } else {
                    System.out.println("Não foi encontrado nenhum trecho de texto.");
                }

                reader.close();
            } else {
                System.out.println("Erro de conexão: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Erro ao processar a URL: " + e.getMessage());
        }
    }

    private static String getTagName(String line) {
        int startIndex = line.indexOf('<') + 1;
        int endIndex = line.indexOf('>');
        if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
            return line.substring(startIndex, endIndex);
        }
        return "";
    }
}
