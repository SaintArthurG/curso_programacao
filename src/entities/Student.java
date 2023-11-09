package entities;

public class Student {
    public String name;
    public double a;
    public double b;
    public double c;

    public double notaFinal() {
        return a + b + c;
    }

    public double faltaNota() {
        double p = 60;
        return p - notaFinal();
    }

    public void result() {
        if (notaFinal() > 60) {
            System.out.println("FINAL GRADE: " + notaFinal());
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE: " + notaFinal());
            System.out.println("FAILED");
            System.out.println("MISSING " + faltaNota() + " POINTS");
        }
    }

}
