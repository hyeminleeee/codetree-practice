import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a, cnt3=0, cnt5=0;

        //3의 배수 갯수
        for(int i=0; i < 10; i++){
            a=sc.nextInt();
            
            if(arr[i] % 3 ==0){
                cnt3++;
            }
            if(arr[i] % 5 == 0){
                cnt5++;
            }
        }

        //5의 배수 갯수
        for(int i=0; i < 10; i++){
        }   
        System.out.print(cnt3 + " " + cnt5);

    }
}