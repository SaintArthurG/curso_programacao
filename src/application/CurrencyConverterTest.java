package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price in real: ");
        CurrencyConverter.dolarInReal = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double pagarReais = CurrencyConverter.bought(sc.nextDouble());
        System.out.println("Aount to be paid in reais = " + pagarReais);
        sc.close();
    }

}
