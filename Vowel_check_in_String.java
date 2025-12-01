import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String vow="aeiouAEIOU";
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<vow.length();j++)
            {
                if(str.charAt(i)==vow.charAt(j))
                {
                    flag=1;
                }
                   
            }
        }
        if(flag==1)
        { 
            System.out.println("yes");
        }
        else{
        System.out.println("no");
        }
    }
}
