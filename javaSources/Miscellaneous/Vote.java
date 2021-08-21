import java. util.Scanner;
public class Vote{


    public static void main(String[] args) {
      

        Scanner myScanner = new Scanner (System.in);
        System.out.println("pls enter the age");
        int c = myScanner.nextInt();
        if(c >= 18 ){
            System.out.println("you are eligible to vote ");
        }
        else if(c < 18){

            System.out.println("you are not eligible to vote");
        }
    }
}
