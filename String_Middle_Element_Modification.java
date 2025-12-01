import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int len=s.length();
        int oddmid=len/2;
        int evenmid=oddmid-1;
        for(int i=0;i<len;i++)
        {
            if(len%2!=0){
            if(i==oddmid)
            {
                System.out.print("*");
            }
            else{
                System.out.print(s.charAt(i));
            }
            }
            else{
            if(i==evenmid||i==oddmid)
            {
                System.out.print("*");
            }
            else{
                System.out.print(s.charAt(i));
            }
            }
            
        }
    }
}
