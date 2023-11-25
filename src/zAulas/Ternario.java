package zAulas;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        double valorComDesconto = preco - desconto;
        System.out.println(desconto);
        System.out.println("O valor com desconto é de: " + valorComDesconto);
        sc.close();
    }
}
