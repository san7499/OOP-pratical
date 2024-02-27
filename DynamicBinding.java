import java.util.Scanner;

abstract class Shape {
    protected double dimension1;
    protected double dimension2;

    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension 1: ");
        dimension1 = scanner.nextDouble();
        System.out.print("Enter dimension 2: ");
        dimension2 = scanner.nextDouble();
    }

    public abstract double computeArea();
}

class Triangle extends Shape {
    @Override
    public double computeArea() {
        // Area of triangle = 0.5 * base * height
        return 0.5 * dimension1 * dimension2;
    }
}

class Rectangle extends Shape {
    @Override
    public double computeArea() {
        // Area of rectangle = length * width
        return dimension1 * dimension2;
    }
}

public class DynamicBinding{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose shape
        System.out.println("Choose shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Shape shape;
        if (choice == 1) {
            shape = new Triangle();
        } else if (choice == 2) {
            shape = new Rectangle();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        // Input dimensions and compute area
        shape.inputDimensions();
        double area = shape.computeArea();
        System.out.println("Area: " + area);

        scanner.close();
    }
}
