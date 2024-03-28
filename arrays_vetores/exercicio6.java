package arrays_vetores;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;

        int vetor[] = new int[n];
        int vetor2[] = new int[n];
        int soma[] = new int[n];

        System.out.println("Valores do vetor A: ");
        for(int i = 0; i < n; i++){
            System.out.println("Digite: ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("Valores do vetor B: ");
        for(int i = 0; i < n; i++){
            System.out.println("Digite: ");
            vetor2[i] = sc.nextInt();

        }
        System.out.printf("Somas: ");
        for(int i = 0; i < vetor2.length; i++){
            soma[i] += vetor[i] + vetor2[i];
            System.out.println("\n" + soma[i]);

        }


        sc.close();

    }
}
