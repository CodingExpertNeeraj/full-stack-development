public class PujaOrganization {
    // OOPs => OBJECT ORIENTED PROGRAMMING

    // Variables declarations
    String[] goodsRequired = new String[20], foodMenu = new String[4];;
    int visitorCount;
    String dateOfPuja, chiefGuest;
    boolean isPriestAvailable, isPrasadOffered;

    // Constructor
    public PujaOrganization(String dateOfPuja, int visitorCount) {
        this.dateOfPuja = dateOfPuja;
        this.visitorCount = visitorCount;
    }

    public void pujaInvite() {
        System.out.println("Namaste, we are organizing Puja on " + dateOfPuja + " and we are expecting " + visitorCount
                + " shraddalu.");
        System.out.println("Mr. " + chiefGuest + " will be our Chief Guest!!");
    }

    // Getter setter Method
    public void setChieftGuest(String chiefGuest) {
        this.chiefGuest = chiefGuest;
    }

    public String getChiefGuest() {
        return this.chiefGuest;
    }

    // static public void pujaInvite(boolean defaultInfo) {
    // System.out.println("Namaste, we are organizing Puja on " + dateOfPuja + " and
    // we are expecting " + visitorCount
    // + " shraddalu.");
    // }
}