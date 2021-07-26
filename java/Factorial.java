import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));

        LinkedList<Integer> myLL = new LinkedList<>();

        myLL.add(10);
        myLL.add(20);
        myLL.add(50);

        // while (myLL.iterator().hasNext()) {
        // System.out.println(myLL.toString());
        // }

        char[] myChars = new char[5];
        myChars[0] = 'c';
        myChars[1] = 'h';
        System.out.println(myChars);

        ArrayList<Integer> myAL = new ArrayList<>();
        myAL.add(10);
        myAL.add(20);
        myAL.add(30);

        System.out.println(myAL);
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}