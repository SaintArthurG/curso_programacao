package zztudao.applications;


import zztudao.entities.Aluguel;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AluguelTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluguel[] alugueis = new Aluguel[10];
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            alugueis[room] = new Aluguel(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (alugueis[i] != null) {
                System.out.println(i + ": " + alugueis[i]);
            }
        }

        sc.close();
    }
}
