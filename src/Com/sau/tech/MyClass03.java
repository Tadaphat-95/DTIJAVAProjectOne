package Com.sau.tech;

import java.util.Scanner;

public class MyClass03 {
    public static void main(String[] args) {
        String empname;
        double empSalary , tax10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input employee name: ");
        empname = sc.next();
        System.out.print("Input employee salary: ");
        empSalary = sc.nextDouble();

        System.out.println("----------------------");
        tax10 = empSalary * 10 / 100;

        System.out.println("Your name: " + empname);
        System.out.println("Your salary: " + empSalary);
        System.out.println("Tax pay: " + tax10 + "Baht");

    }
}
