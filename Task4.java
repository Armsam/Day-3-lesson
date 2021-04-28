import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        float PI = 3.14159f;
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = PI*radius*radius;
        double perimeter = 2*PI*radius;
        System.out.println("Area = "+area+"\nPerimeter = "+perimeter);
    }
}
