package application;

import entities.SomaVetor;

import java.util.Scanner;

public class SomaVetorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SomaVetor sv = new SomaVetor();


        System.out.println("Quantos numeros você vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
            sv.sum(vect[i]);
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.println("VALORES: " + vect[i]);
        }
        System.out.println(sv.getValue());
        double media = sv.getValue() / vect.length;
        System.out.println(media);

        sc.close();
    }
}
