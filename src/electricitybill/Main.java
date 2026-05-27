package electricitybill;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID:");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Meter Number:");
        String meter = sc.nextLine();

        System.out.println("Enter Units Consumed:");
        int units = sc.nextInt();

        Customer c = new Customer(id, name, meter, units);

        ElectricityManagement obj = new ElectricityManagement();

        obj.insert(c);

        sc.close();
    }
}