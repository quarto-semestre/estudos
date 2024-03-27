package arrays_vetores;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha de 1 a 10: ");
        int x = sc.nextInt();
        int vetor[] = new int[x];

        for(int i = 0; i < x; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("NUmeros negativos: ");
        for(int i = 0; i < x;i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }




        sc.close();

    }
}
