import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        String text=sc.next();

        String str1=text.substring(0,1)+"a";
        String str2=text.substring(2,text.length()-2);
        String str3="a"+text.charAt(text.length()-1);
        
        System.out.println(str1+str2+str3);
    }
}