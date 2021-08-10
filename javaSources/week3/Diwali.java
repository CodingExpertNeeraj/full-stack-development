public class Diwali {
    public static void main(String[] args) {
        PujaOrganization myPuja = new PujaOrganization("15/11/2021", 100);
        myPuja.setChieftGuest("Tiwari Ji");

        myPuja.pujaInvite();

        // PujaOrganization.pujaInvite(true);
    }

}