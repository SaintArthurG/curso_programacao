package application;

import entities.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle x;
        x = new Rectangle();

        System.out.println("Insira a largura: ");
        x.largura = sc.nextDouble();
        System.out.println("Insira a altura: ");
        x.altura = sc.nextDouble();

        double areaX = x.area();
        double perimeterX = x.perietro();
        double diagonalX = x.diagonal();

        System.out.println("Area: " + areaX);
        System.out.println("Perimeter: " + perimeterX);
        System.out.println("Diagonal: " + diagonalX);

        sc.close();
    }




}
