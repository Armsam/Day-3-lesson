import java.io.IOException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = name.length();
        int sum = 0;
        for(int i = 0;i<name.length();i++){
            int valueOfChar = name.charAt(i);
            sum += valueOfChar;
        }
        System.out.println(sum/count);



    }
}
