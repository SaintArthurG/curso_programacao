package application;


import entities.Triangle;

import java.util.Scanner;

public class problema {
    //Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
    //válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
    //possui a maior área.
    //A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
    //seguinte (fórmula de Heron):
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        double max = Triangle.max(areaX, areaY);
        Triangle.large(max);

        sc.close();
    }

}


