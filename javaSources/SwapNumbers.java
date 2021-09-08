public class SwapNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

       // Now i want to when i run this program , it should be show the int a value in int b and int b value in int a.
      // how we will do?
      // first we will have to create a another var .
      int c = a;
      a=b;
      b = c;

      System.out.println(a); 
      System.out.println(b);


    }
}
