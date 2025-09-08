import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a, cnt3=0, cnt5=0;

        for(int i=0; i < 10; i++){
            a=sc.nextInt();
            
            if(a % 3 ==0){
                cnt3++;
            }
            if(a % 5 == 0){
                cnt5++;
            }
        }
  
        System.out.print(cnt3 + " " + cnt5);
    }
}