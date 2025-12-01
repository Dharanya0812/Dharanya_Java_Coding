import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2){
            System.out.println("-1");
            return;
        }
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num<first){
               second=first;
               first=num;
            }
            else if(first<num && num<second){
                second=num;
            }
        }
        if(second == Integer.MAX_VALUE)
        { 
            System.out.println(-1); 
            
        } else {
            System.out.println(second); 
            
        } 
        
    }
}