import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;

        for(i =1; i<=n; i++){
            sum+=i;                
            if(sum >= n)
                break;
        }
        System.out.print(i);
    }
}