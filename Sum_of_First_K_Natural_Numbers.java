import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int sum=n1*(n1+1)/2;
        System.out.println(sum);
    }
}