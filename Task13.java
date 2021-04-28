import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number+number2;
        number = sum-number;
        number2 = sum-number2;
        System.out.println("First = "+number+"\nSecond = "+number2);
    }
}
