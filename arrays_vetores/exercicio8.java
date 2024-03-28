package arrays_vetores;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;

        int soma = 0;
        int qnt = 0;

        int vetor[] = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                qnt ++;
            }
        }

       if(qnt ==0 ){
           System.out.println("Nenhum numero par");
       }else{
           int media = soma / qnt;
           System.out.println("\n Media dos pares: " + media);

       }

        sc.close();

    }
}

