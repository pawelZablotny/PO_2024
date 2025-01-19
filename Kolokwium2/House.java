public class House extends Building {
    private int numberOfRomms;

    public House(double height, String color, int numberOfRomms) {
        super(height, color);
        this.numberOfRomms = numberOfRomms;
    }

    public int getNumberOfRomms()
    {
        return numberOfRomms;
    }
}
