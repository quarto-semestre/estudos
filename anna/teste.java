package anna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class teste {
    public static void main(String[] args) {
        try {
            URL obj = new URL("https://www.google.com/");
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            obj.openStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);

            in.close();

        } catch (IOException e) {
            System.out.println("Erro de leitura, a url fornecida não corresponde. ");
        }
    }
}
