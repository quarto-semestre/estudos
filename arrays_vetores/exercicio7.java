package arrays_vetores;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        double to = 0;
        double vetor[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            to += vetor[i];
        }

        double media = to / n;
        System.out.printf("Média: %.3f \n", media);


        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}
