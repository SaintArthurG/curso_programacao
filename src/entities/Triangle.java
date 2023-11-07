package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void large(double value) {
        System.out.printf("Large area: %.4f", value);
    }

    public static double max(double a, double b) {
        double aux;
        if (a > b) {
            aux = a;
        } else {
            aux = b;
        }
        return aux;
    }
}

