import java.util.Scanner;

public class Screener {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = in.nextInt();
        System.out.println(age);
    }
}