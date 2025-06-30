package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Method for area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method for area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method for area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userChoice = 0; // From 1 to 3 only
        // Reqs for Circle
        double radius = 0.00;
        // Reqs for Triangle
        double base = 0.00;
        double height = 0.00;
        // Reqs for Rectangle
        double length = 0.00;
        double width = 0.00;

        // area
        double area = 0.00;

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        userChoice = myObj.nextInt();

        if (userChoice < 1 || userChoice > 3){
            System.out.println("Enter valid number.");
        }


        switch(userChoice){
            case 1:
                System.out.print("Enter the radius: ");
                radius = myObj.nextDouble();
                area = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f", area);
                break;
            case 2:
                System.out.print("Enter the base: ");
                base = myObj.nextDouble();
                System.out.print("Enter the height: ");
                height = myObj.nextDouble();
                area = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f", area);
                break;
            case 3:
                System.out.print("Enter the length: ");
                length = myObj.nextDouble();
                System.out.print("Enter the width: ");
                width = myObj.nextDouble();
                area = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f", area);
                break;
        }
    }
}