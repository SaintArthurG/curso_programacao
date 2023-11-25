package application;

import entities.ProductVetor;

import java.util.Scanner;

public class ProductVetorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductVetor[] vect = new ProductVetor[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();;
            double price = sc.nextDouble();
            vect[i] = new ProductVetor(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.println(avg);


        sc.close();
    }
}
