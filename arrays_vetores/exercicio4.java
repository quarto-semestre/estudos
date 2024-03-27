package arrays_vetores;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;

        double vetor[] = new double[n];

        for(int i = 0; i<n;i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posMaior = 0;


        // Não entendi direito ainda

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + posMaior);
    }
}
