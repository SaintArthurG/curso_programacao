package zztudao.applications;

import zAulas.Scan;
import zztudao.entities.Alturas;

import java.util.Scanner;

public class AlturasTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Alturas[] pessoas = new Alturas[n];
        double sum = 0;
        double j = 0;
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.println("Dados da "+ (i+1) + "ªPessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double lenght = sc.nextDouble();
            pessoas[i] = new Alturas(name, age, lenght);
        }

        double soma = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].getLenght();
        }
        double mediaAlturas = soma / pessoas.length;
        System.out.println("Altura media: " + mediaAlturas);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pessoas[i].getAge() < 16){
                count = count + 1;
            }
        }
        double percent = count * 100.0 / n;
        System.out.println("Pessoas com menos de 16 anos é %" + percent);

        sc.close();
    }
}
