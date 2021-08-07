public class Palindrome {
    public static void name(Strig args[])
     {
        int No. = 121;
        int temp = No.
    }
}
//----------------------------------------
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the Integer for checking: ");

        int number = scannerObject.nextInt();

        System.out.println("User input following number " + number);

        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {

        char[] myDigits = String.valueOf(number).toCharArray();

        // String.valueOf(number) => "123"

        // String.valueOf(number).toCharArray() => ['1','2','3']

        for (int i = 0; i < myDigits.length / 2; i++) {
            if (myDigits[i] != myDigits[myDigits.length - 1 - i]) {
                retu…import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the Integer for checking: ");

        int number = scannerObject.nextInt();

        System.out.println("User input following number " + number);

        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {

        char[] myDigits = String.valueOf(number).toCharArray();

        // String.valueOf(number) => "123"

        // String.valueOf(number).toCharArray() => ['1','2','3']

        for (int i = 0; i < myDigits.length / 2; i++) {
            if (myDigits[i] != myDigits[myDigits.length - 1 - i]) {
                retu…