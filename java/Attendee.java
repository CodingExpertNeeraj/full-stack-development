public class Attendee {
    String name, city;
    Double programmingExperience;

    // Default Constructor
    public Attendee() {
        System.out.println("A new Attendee is getting created!!");
    }

    // Constructor with parameters
    public Attendee(String name, String city, Double programmingExperience) {
        this.name = name;
        this.city = city;
        this.programmingExperience = programmingExperience;
    }

    public void display() {
        System.out.println("Hi, this is " + this.name + ", I live in " + this.city + " and I have "
                + this.programmingExperience + " years of programming experience!!");
    }

    public static void main(String[] args) {
        Attendee myAttendee1 = new Attendee("Neeraj", "Doba", 0.5);
        myAttendee1.display();

        Attendee myAttendee2 = new Attendee("Saurabh", "Doba", 0.5);
        myAttendee2.display();
    }
}