package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Date moment = new Date();
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        String bithDate = sc.nextLine();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Client client = new Client(name, email, sdf.parse(bithDate));
        Order order = new Order(moment, OrderStatus.valueOf(status), client);
        System.out.print("How many items to this order?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            Product2 product2 = new Product2(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product2);
            order.addItem(orderItem);
        }
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
