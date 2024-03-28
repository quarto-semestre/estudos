package arrays_vetores;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        String aprovados = null;
        double media = 6;


        String nomes[] = new String[n];
        double semestre1[] = new double[n];
        double semestre2[] = new double[n];
        double soma[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome, primeira e segunda nota do " + (i + 1) + "° aluno: ");
            nomes[i] = sc.nextLine();
            semestre1[i] = sc.nextDouble();
            semestre2[i] = sc.nextDouble();

            sc.nextLine();


        }


        System.out.println("Aprovados: ");
        for (int i = 0; i < n; i++) {
            soma[i] = (semestre1[i] + semestre2[i]) /2;
        }

        for(int i = 0; i < soma.length;i++){
            if(soma[i] >= media){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
