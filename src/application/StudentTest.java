package application;

import entities.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Nome do estudante: ");
        student1.name = sc.nextLine();
        System.out.println("Insira as três notas do trimestre:");
        student1.a = sc.nextDouble();
        student1.b = sc.nextDouble();
        student1.c = sc.nextDouble();

        student1.notaFinal();
        student1.result();

        sc.close();
    }
}
