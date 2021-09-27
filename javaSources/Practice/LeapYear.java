import java.util.Scanner;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0){
        System.out.println("it is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
