public public class Static {
    
    // Variables Declaration
    public int counter;
    static int counter1 = 10;

    // Default Constructor
    Static()
    {
        this.counter = 5;
        System.out.println("Object is instantiated by DEFAULT!!");
    }

    // Parameterized Constructor
    Static(int value) {
        this.counter = value;
        System.out.println("Object is instantiated BY values Supplied by me!!");
    }

    // Methods Declaration
    public static void main(String[] args) {

    }

    // Static method
    public static int returnCounter1()
    {
        return counter1;
    }

    // Instance Method
    public int returnCounter() {
        return counter;
    }
    
}class Static {
    
}
