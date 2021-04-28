import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        byte numberByte = (byte)number;
        short shortNumber = numberByte;
        int numberInt = numberShort;
        long numberLong = numberInt;
        float numberFlot = numberLong;
        double numebrDouble = numberFlot;
        System.out.println("Byte number = "+numberByte + "\nShort number = " + numberShort + "\nInt number = "+ numberInt + "\nLong number = " + numberLong + "\nFloat number = " + numberFlot + "\nDobule numbre = "+numebrDouble);
    }
}
