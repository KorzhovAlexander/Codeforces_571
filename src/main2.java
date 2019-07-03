import java.math.BigInteger;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte a = Byte.parseByte(in.nextLine(),2);
        byte b = Byte.parseByte(in.nextLine(),2);

        int c = (a+b);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(new BigInteger(String.valueOf(a)).bitCount());
        System.out.println(new BigInteger(String.valueOf(b)).bitCount());
    }
}
