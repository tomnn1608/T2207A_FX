package exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListCustomer list = new ListCustomer();
        HashMap<String, Customer> hsm = new HashMap<>();
        int select = 0;
        do {
            System.out.println(".new");
            System.out.println("1. Add new customer");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            select = sc.nextInt();
            switch (select) {
                case 1:
                      list.AddCustomer();
                    break;

                case 2:
                    list.findCustomer();
                    break;

                case 3:
                    list.display();
                    break;

            }
        } while (select != 0);
    }
}


