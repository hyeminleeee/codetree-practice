import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        
        for(int i=0; i < n; i++){
            ary[i]=sc.nextInt();
        }

        for(int i=n-1; i>=0;i--){
            if(ary[i] % 2 ==0) {
                System.out.print(ary[i] + " ");
            }
        }


        
    }
}