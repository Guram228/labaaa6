package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x ");
        int x = scanner.nextInt();
        System.out.print("Enter y ");
        int y = scanner.nextInt();
        System.out.print("Enter z ");
        int z = scanner.nextInt();
        Formula frm = new Formula(x,y,z);
        frm.displayInfo();
    }
}
class Formula {
    float x;
    float y;
    float z;

    Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayInfo() {
        double vector = Math.sqrt(Math.pow(x, 18) + Math.pow(y, 18) + Math.pow(z, 18));
        System.out.println(vector);
    }
}