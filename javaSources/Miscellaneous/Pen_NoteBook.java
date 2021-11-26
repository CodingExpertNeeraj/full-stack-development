import java.util.Scanner;
public class Pen_NoteBook {
    public static void main(String[] args) {
        // conditional statments
        Scanner sc = new Scanner(System.in);
        // pen = 10  Notebook = 40

        int cash = sc.nextInt();
        if(cash < 10){
         System.out.println("cannot by anything");
         System.out.println("get more cash");
        }

        else if(cash > 10 && cash < 50){
            System.out.println("can get 1 thing");
        }

        else{
            System.out.println("can get both");
        }
    }
}
