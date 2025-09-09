import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int re=sc.nextInt();

        //3번 입력 - 반복
        for(int i=0; i<re; i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int sum=0;
            for(int j=n; j<=m; j++){
                if(j % 2 == 0){
                    sum+=j;
                }
            }
            System.out.println(sum);

        }
    }
}
