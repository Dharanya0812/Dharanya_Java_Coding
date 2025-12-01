import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        if (n1 == 0 || n2 == 0) {
             System.out.println(-1);
              return;
            }
        while(n2!=0)
        {
            int temp=n1%n2;
            n1=n2;
            n2=temp;
        }
        System.out.println(n1);
    }
}
