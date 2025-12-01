import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int inp=sc.nextInt();
       if(inp%13==0){
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
       
    }
}
