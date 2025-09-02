public class Main {
    public static void main(String[] args) {
        int a = 13; //추의 무게
        double b = 0.165; //달에서의 무게 비율
        double result = a * b;
        String b1 = String.format("%.6f", b);
        String result1 = String.format("%.6f", result);
        System.out.print(a + " * " + b1 + " = " + result1);
    }
}