package zAulas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        list.add(2, "Marco");
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        list.remove("Marco");
        for (String x :
                list) {
            System.out.println(x);
        }
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
