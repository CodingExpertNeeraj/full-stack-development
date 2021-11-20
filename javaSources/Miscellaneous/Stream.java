import java.util.ArrayList;
import java.util.Arrays;

public class Stream {
    
    public static void main(String[] args) {
        /**
         * create stream using of () methods.
         */
        Stream<String> stream = stream.of("a" , "b" , "c");
        /**
         * create stream using Array.
         */
        String[] StringArr = new String[] {"J","A","V","A"};
        Stream String  arrToStream = Arrays.stream(StringArr);

        /**
         * Create stream using collection list.
         */
        ArrayList String list = new ArrayList();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        Stream stream1 = list.stream();
    }
    System.out.println(stream1);
}
  