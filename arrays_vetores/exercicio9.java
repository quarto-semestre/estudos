package arrays_vetores;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int maisVelha = 0;
        String nome = null;

        String nomes[] = new String[n];
        int idades[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "° pessoa: ");
            nomes[i] = sc.nextLine();
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        for(int i = 0; i < n; i++){
            if(idades[i] > maisVelha){
                nome = nomes[i];
                maisVelha = idades[i];
            }
        }

        System.out.println("Mais velha: " + nome );



    }
}
