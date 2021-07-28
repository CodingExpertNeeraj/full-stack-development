import java.util.Scanner;

public class Screener {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("Please enter your name => " + name);

        int age = in.nextInt();
        System.out.println("Please enter your age => " + age);

        // Checks are started from here..
        System.out.println("Let see if you are a adult, are you? => " + isAdult(age));

        in.close();
    }

    public static Boolean isAdult(int age) {
        // if (age > 18)
        // return true;
        // else
        // return false;

        // return (age > 18) ? "ADULT" : "CHILD";

        return (age > 18) ? true : false;
    }

}