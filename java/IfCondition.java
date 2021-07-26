
public class IfCondition {
    public static void main(String[] args) {
        String name = "saurabh", profession = "developer";

        Integer a = 10, b = 12;

        if ((name == "neeraj") && (profession == "developer")) {
            System.out.println("Yeahhhh");

            System.out.println(a & b);

        }

        System.out.println(sum(10));
    }

    public static int sum(int maxCount) {
        int sum = 0;
        for (int i = 0; i < maxCount; i++)
            sum += i;
        return sum;
    }
}