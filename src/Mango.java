public class Mango extends Owoc {
    @Override

    public String smak() {
        return "Słodki.";
    }
    @Override
    public void umyj() {
        System.out.println("Myję pod kranem.");
    }

    @Override
    public void zjedz() {
        System.out.println("Smacznego!!!");
    }
}
