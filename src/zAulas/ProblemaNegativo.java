package zAulas;

import java.util.Scanner;

public class ProblemaNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextInt();
        }
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();
    }


}
