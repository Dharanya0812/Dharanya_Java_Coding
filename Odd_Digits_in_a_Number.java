import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean foundOdd = false;
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (digit % 2 != 0) {  
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(digit);
                first = false;
                foundOdd = true;
            }
        }
        if (!foundOdd) {
            System.out.print("-1");
        }
    }
}
