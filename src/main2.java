import java.math.BigInteger;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        int i = (int)Math.ceil((float)a.length()/b.length());
        int rez=0;
            while (i!=0){
                rez+=getRez(a,b);
                a=removeCharAt(a);
                i--;
            }
        System.out.println(new BigInteger(Integer.toBinaryString(rez),2).bitCount());
    }

    private static String removeCharAt(String s) {
        return s.substring(0, 0) + s.substring(1);
    }

    private static int getRez(String a, String b) {
        return (Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}
