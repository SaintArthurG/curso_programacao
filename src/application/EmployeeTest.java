package application;

import entities.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee a = new Employee();
        System.out.println("Insira o nome do funcionario: ");
        a.name = sc.nextLine();
        System.out.println("Insira o salario bruto: ");
        a.grossSalary = sc.nextDouble();
        System.out.println("Insira o imposto sobre o salario: ");
        a.tax = sc.nextDouble();

        System.out.println("Name: " + a.name);
        System.out.println("Gross salary: " + a.grossSalary);
        System.out.println("Tax: " + a.tax);

        System.out.println("Employee: " + a.name + ", $" + a.NetSalary());

        System.out.println("Which percentage to incrase salary?");
        a.increaseSalary(sc.nextInt());
        System.out.println("Update data: " + a.name + ", $" + a.NetSalary());

        sc.close();
    }
}
