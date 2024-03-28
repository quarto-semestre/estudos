package arrays_vetores;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;
        int qntPar = 0;

        int vetor[] = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("Numero pares: ");
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] % 2 == 0){

                System.out.println(vetor[i]);
                qntPar +=1;
            }
        }

        System.out.println("Quantidade pares: "+ qntPar);


        sc.close();

    }
}
