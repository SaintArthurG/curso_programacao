import java.util.concurrent.ArrayBlockingQueue;

public class Formulas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        //Raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 " + "= " + C);

        //Potencia
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5, 2);
        System.out.println("\n" + x + "Elevado a " + y + " = " + A);
        System.out.println(x + " Elevado ao quadrado e" + " = " + B);
        System.out.println("5" + " Elevado ao quadrado e:  " + " = " + C);

        //Valor absoluto
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("\nValor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);




    }
}
