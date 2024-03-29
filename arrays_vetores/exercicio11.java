package arrays_vetores;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d° pessoa: ", (i + 1));

            alturas[i] = sc.nextDouble();

            System.out.printf("Genero da %d° pessoa: ", (i + 1));
            genero[i] = sc.next().charAt(0);

            System.out.println(" ");

            sc.nextLine();

        }

        /***
         * Aqui para comparar os valores, antes declarei
         * 2 variaveis, maiorAlt e menorAlt.
         * Assim, o loop for irá comparar cada elemento
         * com ele mesmo! */
        double maiorAlt = alturas[0];
        double menorAlt = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maiorAlt) {
                maiorAlt = alturas[i];
            }

            if(alturas[i] < menorAlt){
                menorAlt = alturas[i];
            }
        }
        System.out.printf("Maior altura: %.2f", maiorAlt);
        System.out.printf("\nMenor Altura: %.2f", menorAlt);



        double total = 0;
        double qnt = 0;
        double media;
        for(int i = 0; i < alturas.length;i++ ){
            if (genero[i] == 'f') {
                total += alturas[i];
                qnt += 1;
            }
        }

        media = total / qnt;
        System.out.printf("%nMedia altura mulheres: %.2f",media);

        int homens = 0;
        for(int i = 0; i < n; i++){
            if(genero[i] == 'm'){
                homens += 1;
            }
        }

        System.out.printf("Numero homens: %d", homens);



        sc.close();
    }
}
