import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        boolean found=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==K){
                count++;
                found=true;
            }
        }
        if(found){
        System.out.println(count);
        }
        else if(!found){
            System.out.println("-1");
        }
        
    }
}