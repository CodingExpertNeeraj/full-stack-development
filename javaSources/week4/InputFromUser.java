import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner neerajInput = new Scanner(System.in);
        int choice = neerajInput.nextInt();
        System.out.println("My Choice is => " + choice);
        
        Scanner saurabhInput = new Scanner(System.in);
        String name = saurabhInput.nextLine();
        System.out.println("My Choice is => " + name);
    }
}
