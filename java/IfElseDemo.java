import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class IfElseDemo {
     public static void main(String[] args) {
         Scanner in = new scanner(System.in);
        System.out.println("please enter your age");
        int age = in.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote!");
        }
        else if(age>=60){
            System.out.println("You are a sinior citizen!");
        }
        else {
            System.out.println("you are not a eligible voter!");
        }
    }
}
