import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double farenhait = scanner.nextDouble();
        double celsius = (farenhait-32)*5/9;
        System.out.println("Double Celsius = "+celsius);
        float celsiusFloat = (float)celsius;
        System.out.println("Float celsius = "+celsiusFloat);
        int celsiusInt = (int)celsius;
        System.out.println("Int celsius = "+celsiusInt);
    }
}
