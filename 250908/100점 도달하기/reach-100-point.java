import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        
        for(int n=sc.nextInt();n<=100;n++){
            if(n>=90){
                System.out.print("A ");
            } else if(n>=80){
                System.out.print("B ");
            } else if(n>=70){
                System.out.print("C ");
            } else if(n>=60){
                System.out.print("D ");
            } else {
                System.out.print("F ");
            }
        }
    }
}