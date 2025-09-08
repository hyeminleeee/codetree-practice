import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a, b;
        a=sc.nextInt();
        b=sc.nextInt();

        while(true){
            System.out.print(a + " ");
            if(a % 2 != 0){
                a*=2;
            } else {
                a+=3;
            }

            if(a > b){
                break;
            }

        }
    }
}
