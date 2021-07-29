public class BreakContinue {
    public static void main(String[] args) {

        System.out.println("Without Break");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Found an even number => " + i);
            }
        }

        System.out.println("Demoing Break");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Found an even number => " + i);
                break;
            }
        }
        System.out.println("After the Break");

        System.out.println("Demoing Continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Found an even number => " + i);
                continue;
            }
        }
        System.out.println("After the Continue");
    }
} 