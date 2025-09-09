import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=0;

        for(int i=n; i<=m; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count+=1;
                }
            }
            if(count == 3){
                x+=1;
            }
        }
        System.out.print(x);
    }
}
