import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       House dom = new House(40, "Bialy", 10);
       System.out.println("Dom ma: " + dom.getHeight() + " metrow.");
       System.out.println("Dom jest koloru: " + dom.getColor());
       System.out.println("Dom ma: " + dom.getNumberOfRomms() + " pokoi.");

       Integer[] intArray = {6, 2, 4, 1 ,5};
       Sortowanie.sortDescending(intArray);
       System.out.println("Posortowana tablica: " + Arrays.toString(intArray));

    }
}