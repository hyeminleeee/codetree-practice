import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        char str=sc.next().charAt(0);
        int cnt=0;
        String[] arr={"apple", "banana", "grape", "blueberry", "orange"};

        for(int i=0; i<5; i++) {
            if(arr[i].charAt(2) == str || arr[i].charAt(3) == str){
                cnt++;
                System.out.println(arr[i]);
            }
        }

        System.out.print(cnt);
    }
}