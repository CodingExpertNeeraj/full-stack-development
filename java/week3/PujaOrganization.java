public class PujaOrganization {
    // OOPs => OBJECT ORIENTED PROGRAMMING

    // Variables declarations
    String[] goodsRequired = new String[20], chiefGuest = new String[5], foodMenu = new String[4];;
    int visitorCount;
    String dateOfPuja;
    boolean isPriestAvailable, isPrasadOffered;

    // Constructor
    public PujaOrganization(String dateOfPuja, int visitorCount) {
        this.dateOfPuja = dateOfPuja;
        this.visitorCount = visitorCount;
    }

    public void pujaInvite() {
        System.out.println("Namaste, we are organizing Puja on " + dateOfPuja + " and we are expecting " + visitorCount
                + " shraddalu.");
    }
}