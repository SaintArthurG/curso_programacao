package zAulas;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.next() == uma palavra sem espaço
        // sc.nextInt() == um numero inteiro
        // sc.nextDouble() == um nummero flutuante
        // sc.next().charAt(0); == um caracter
        // sc.nextLine() == até a quebra de linha
        char genero = sc.next().charAt(0);
        sc.nextLine();
        System.out.println(genero);
        String linha = sc.nextLine();
        System.out.println(linha);

        sc.close();
    }
}
