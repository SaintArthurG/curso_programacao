package util;

import java.util.Scanner;

public class CurrencyConverter {
    public static final double IOF = 6;
    public static double dolarInReal;

    public static double bought(double quantity ){
        double p = quantity * dolarInReal;
        double total = p * IOF / 100;
        return total + p;
    }




}
