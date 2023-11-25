package zAulas;

import java.util.Scanner;

public class ExpressoesLogicas {
    public static void main(String[] args) {
        //&& == E
        //|| == OU
        //! == NÃO
        Scanner sc = new Scanner(System.in);
        int nmr = sc.nextInt();
        System.out.print("O nummero " + nmr + " é um ");
        if(nmr < 0) System.out.println("numero negativo");
        else System.out.println("numero positivo");


    }
}
