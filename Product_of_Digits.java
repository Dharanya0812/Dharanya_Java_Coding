import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp=sc.nextInt();
        int prod=1;
        while(inp>0){
            int digit=inp%10;
            prod*=digit;
            inp/=10;
        }
        System.out.println(prod);
    }
}