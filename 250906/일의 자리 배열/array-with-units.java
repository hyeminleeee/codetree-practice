import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int[] arr2=new int[2];

        for(int i=0; i < 2;i++){
            arr2[i]=sc.nextInt();
            arr[i]=arr2[i];
        }

        System.out.print(arr[0]+" "+arr[1]+ " ");

        for(int i=2;i<10;i++){
            if(arr[i-2]+arr[i-1] < 10) {
                arr[i]=arr[i-2]+arr[i-1];
                System.out.print(arr[i]+" ");
            } else {
                arr[i]=(arr[i-2]+arr[i-1])%10;
                System.out.print(arr[i] + " ");
            }
        }

    }
}