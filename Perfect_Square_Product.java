import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int pro=n1*n2;
        int r=(int)Math.sqrt(pro);
        if(r*r==pro)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
