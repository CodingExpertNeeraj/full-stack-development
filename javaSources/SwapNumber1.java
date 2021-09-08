public class SwapNumber1 {
    public static void main(String[] args) {     
        
        int x = 10;
        int y = 20;

       // In this program  we will know how to swap tow numbers without using third var .

        x = x + y;
        y = x - y;
        x = x - y;

            System.out.println("x:"+x);
            System.out.println("y:"+y);
    }
}
