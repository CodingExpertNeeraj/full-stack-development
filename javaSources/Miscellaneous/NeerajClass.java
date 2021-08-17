 public class NeerajClass {
    public static void main(String[] args) {

        Static myObject = new Static();
        System.out.println("Let me check the value of counter => " + myObject.counter);
        System.out.println("Let me check the value of counter (METHOD) => " + myObject.returnCounter());

        Static myObject2 = new Static(100);
        System.out.println("Let me check the value of counter => " + myObject2.counter);
        System.out.println("Let me check the value of counter (METHOD) => " + myObject2.returnCounter());

        // System.out.println("Let me check the value of counter => " + Static.counter1);
        // System.out.println("Let me check the value of counter => " + Static.returnCounter1());       
    }
    
}class NeerajClass {
    
}
