import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int[] a=new int[n];
        for(int i=0; i < n; i++){
            a[i]=sc.nextInt();
            System.out.print(a[i]*a[i] + " ");
        }

    }
}