public class DoWhile {
    public static void main(String[] args) {
        int counter = 3;

        // // If Condition check
        // if (counter > 20)
        // System.out.println("Value of Counter is " + counter);

        // // For Loop
        // System.out.println("Counter value BEFORE For Loop is " + counter);
        // System.out.println("For Loop");
        // for (counter = 1; counter < 4; counter++) {
        // System.out.println("Value of Counter is " + counter);
        // }
        // System.out.println("Counter value AFTER For Loop is " + counter);

        // // While Loop
        // System.out.println("While Loop");
        // System.out.println("------------------");
        // while (counter > 0) {
        // System.out.println("Value of Counter is " + counter);
        // counter--;
        // }
        // System.out.println("------------------");

        // Do while Loop
        System.out.println("Do While Loop");
        System.out.println("------------------");
        do {
            counter--;
            System.out.println("Value of Counter is " + counter);
        } while (counter > 0);
        System.out.println("------------------");
    }

}