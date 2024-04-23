package arrays_vetores;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] quartos = new int[n];

        int pessoas = sc.nextInt();

        for(int i = 0; i< pessoas; i++){
            
            quartos[i] = sc.nextInt();
        }

    }
}
