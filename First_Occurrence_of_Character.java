import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sd = sc.next();
        Character ch=sc.next().charAt(0);
        int position=-1;
        boolean found=false;
        for(int i=0;i<sd.length();i++)
        {
            if(sd.charAt(i)==ch)
            {
                position=i+1;
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(position);
        }
        else{
            System.out.println("-1");
        }
    }
}