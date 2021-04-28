import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double numberDouble = number;
        float numberFloat = (float)numberDouble;
        long numberLong = (long)numberFloat;
        int numberInt = (int)numberLong;
        short numberShort = (short)numberInt;
        byte numberByte = (byte)numberShort;
        System.out.println("Double = "+numberDouble+"\nFloat = "+numberFloat+"\nLong = "+numberLong+"\nInt = "+numberInt+"\nShort = "+numberShort+"\nByte = "+numberByte);
    }
}
