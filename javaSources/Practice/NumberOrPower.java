import java.util.Scanner;

public class NumberOrPower {
    public static void main(String[] args) {
        int x ,y;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Number");
        x = ob.nextInt();
        System.out.println("Enter power");
        y = ob.nextInt();
        System.out.println(x^y);
    }
    
}
