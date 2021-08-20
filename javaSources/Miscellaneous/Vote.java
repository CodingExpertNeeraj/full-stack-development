import java. util.Scanner;
public class Vote{


    public static void main(String[] args) {
        int c = 18;

        Scanner myScanner = new Scanner (System.in);
        System.out.println("pls enter the age");
        c = myScanner.nextInt();
        if(c >= 18 ){
            System.out.println("you are iligible to vote ");
        }
        else if(c < 18){

            System.out.println("you are not iligible to vote");
        }
    }
}
