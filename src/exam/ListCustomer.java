package exam;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListCustomer {
    private HashMap<String, Customer> listCus = new HashMap<>();

    public void AddCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        Customer customer = new Customer(name, email, phone);
        listCus.put(name, customer);
        System.out.println("Customer added successfully.");
    }

    public void findCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc.nextLine();
        Customer customer = listCus.get(name);
        if (customer != null) {
            System.out.println("name: " + customer.getName());
            System.out.println("email: " + customer.getEmail());
            System.out.println("phone: " + customer.getPhone());
        } else {
            System.out.println("not found");
        }
    }

    public void display() {
        System.out.println("\tCRM");
        System.out.println("Name\tPhone number");
        for (Map.Entry<String, Customer> hms : listCus.entrySet()) {
            Customer customer = hms.getValue();
            System.out.println(customer.getName() + "\t\t" + customer.getPhone());
        }
    }
}
