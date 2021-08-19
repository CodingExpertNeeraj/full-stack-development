import java.util.Scanner;

import java. util.Scanner;
public class Time{
    public static void main(String[] args) {
        int x = 4;
        int y = 6;

        Scanner myScanner = new Scanner (System.in);
        System.out.println("pls enter the time");
        x = myScanner.nextInt();
        if(x > 3 ){
            System.out.println("Good evening sir");
        }
        else{
            System.out.println("Good afternoon sir");
        }
    }
}