public class PujaArrangement {

    public static void main(String[] args) {

        // System.out.println("Without Break");
        // for (int i = 0; i < 10; i++) {
        // if (i % 2 == 0) {
        // System.out.println("Found an even number => " + i);
        // }
        // }

        System.out.println("Puja is started");
        for (int i = 1; i <= 200; i++) {
            if (i == 100) {
                System.out.println("MAXIMUM CAPACITY REACHED");
                break;
            }
        }
        System.out.println("Puja is finished.");

        System.out.println("Puja is started");
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Ten people have come for Puja..");
                continue;
            }
        }
        System.out.println("Puja is finished.");
    }

}