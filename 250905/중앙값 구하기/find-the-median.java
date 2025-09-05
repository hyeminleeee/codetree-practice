import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int mid;

        if(a >= b) {//a>=b
            if(b >= c) {//a>=b>=c
                mid=b;
            } else if(c >= a) {//c>=a>=b
                mid=a;
            } else {//a>=c>=b
                mid=c;
            }
        } else {//a<b
            if(c >= b) {//a<b<=c
                mid=b;
            } else if(c<=a) {//c<=a<b
                mid=a;
            } else {
                mid=c;
            }
        }
        System.out.println(mid);
    }
}