package arrays_vetores;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        double soma = 0;


        double vetor[] = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();

        }


        // Forma de somar os valores de dentro de um vetor: 4
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        double media = soma / n;


        System.out.println(soma);
        System.out.println(media);

    }
}
