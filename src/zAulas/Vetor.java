package zAulas;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double soma = 0;
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
            soma += vect[i];
        }
        double media = soma / n;
        System.out.println(media);
        sc.close();
    }

}
