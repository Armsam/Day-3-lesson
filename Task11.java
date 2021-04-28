import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println("Int + Int = "+(number+number));
        System.out.println("String + Int = "+(text+number));
    }
}
