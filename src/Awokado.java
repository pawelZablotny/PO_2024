public class Awokado extends Warzywo {
    @Override
    public String smak() {
        return "Delikatny.";
    }

    @Override
    public void umyj() {
        System.out.println("Lekko opłukać.");
    }

    @Override
    public void zjedz() {
        System.out.println("Smacznego!!!");
    }
}
