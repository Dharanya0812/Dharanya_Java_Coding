import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int diff=n1-n2;
        if(diff%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
}