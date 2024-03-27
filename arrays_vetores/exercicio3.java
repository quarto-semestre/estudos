package arrays_vetores;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        double soma = 0;
        double media = 0;
        double menores = 0;

        String nomes[] = new String[n];
        int idades[] = new int[n];
        double alturas[] = new double[n];


        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "° Pessoa");
            nomes[i] = sc.nextLine();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
            sc.nextLine();
        }

        for(int i = 0; i < alturas.length; i++){
            soma += alturas[i];


            if(idades[i] < 16){
                menores++;
            }
        }



        double percentualMenores = (menores / n) * 100;
        media = soma / n;

        System.out.printf("Altura média: %.2f",media);
        System.out.println(" % de pessoas com menos de 16:" + percentualMenores);


        for(int i = 0; i<n; i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

    }
}
