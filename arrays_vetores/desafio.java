package arrays_vetores;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        boolean[] quartos = new boolean[n];

        System.out.println("Quantos quartos serão alugados? ");
        int qnt = sc.nextInt();

        String[] nomes = new String[n];
        String[] emails = new String[n];
        double[] aluguel = new double[n];


        for (int i = 0; i < qnt; i++) {
            sc.nextLine();
            System.out.println((i + 1) + ". Seu nome: ");
            nomes[i] = sc.nextLine();
            System.out.println("Email: ");
            emails[i] = sc.nextLine();
            System.out.println("Aluguel: ");
            aluguel[i] = sc.nextDouble();
            quartos[i] = true;
        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] == true) {
                System.out.println("= = = " + (i + 1) + "° Quarto = = = ");
                System.out.println(quartos[i]);
                System.out.println(nomes[i]);
                System.out.println(emails[i]);
                System.out.println(aluguel[i]);
            } else {
                System.out.println("= = = " + (i + 1) + "° Quarto vazio" + " = = = ");
            }
        }

    }
}
