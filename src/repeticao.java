import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int fatorial = 1;
//        for (int i = 1; i <= n; i++) {
//            fatorial = fatorial * i;
//        }
//        System.out.println(fatorial);

        //Ler um número inteiro N e calcular todos os seus divisores.
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0){
//                System.out.println(i);
//            }
//        }
        // Celcius para farhenheitz
        char resp;
        do {
            double n = sc.nextInt();
            double F = 9 * n / 5 + 32;
            System.out.println(F);
            System.out.println("A temperatura de celcius para farhenteitz é de: " + F + "º Farhenheitz");
            System.out.println("Deseja repetir: (s/n)");
            resp = sc.next().charAt(0);

        } while (resp == 's');



        sc.close();
    }
}
