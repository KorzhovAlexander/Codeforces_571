import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people=in.nextInt();
        if (people<=in.nextInt() && people<=in.nextInt()){
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    }
}
