import java.util.Scanner;

public class Zestaw2 {

    // Zadanie 1: Określ jaki będzie typ danej wyniku operacji
    public static void typOperacji() {
        System.out.println("// Zadanie 1: Określ jaki będzie typ danej wyniku operacji:");
        System.out.println("1. 23.0 + 76 = double");
        System.out.println("2. 41 * 2.0 + 3 = double");
        System.out.println("3. 5 - 33 = int");
        System.out.println("4. 109 % 3 = int");
        System.out.println("5. 50 / 2 = int");
        System.out.println("6. 4 | 2 = int");
        System.out.println("7. 3 ^ 5 = int");
        System.out.println("8. 7 & 9 = int");
    }

    // Zadanie 2: Oblicz wynik działania, a następnie zrzutuj na int
    public static void obliczZrzutuj() {
        System.out.println("\n// Zadanie 2: Oblicz wynik działania, a następnie zrzutuj na int:");
        System.out.println("1. (int) (Math.sqrt(7) - 1 + 33 % 2) = " + (int) (Math.sqrt(7) - 1 + 33 % 2));
        int rokUrodzenia = 1995, dzienUrodzenia = 15, miesiacUrodzenia = 7;
        System.out.println("2. (rokUrodzenia / (dzienUrodzenia * miesiacUrodzenia)) = " +
                (int) (rokUrodzenia / (dzienUrodzenia * miesiacUrodzenia)));
        System.out.println("3. (int) (3 + Math.sqrt(3)) = " + (int) (3 + Math.sqrt(3)));
        System.out.println("4. (int) (Math.sqrt(5) / Math.pow(2, 3) + 1) = " +
                (int) (Math.sqrt(5) / Math.pow(2, 3) + 1));
        System.out.println("5. a % b % c = wynik, dobierz a, b, c samodzielnie");
        System.out.println("6. nazwisko % imie + 1 = wynik, użyj własnych danych");
        System.out.println("7. Math.pow(Math.sqrt(2), 4) = " + Math.pow(Math.sqrt(2), 4));
    }

    // Zadanie 3: Napisz program, który będzie pobierał dwa słowa od użytkownika i wypisywał je na ekranie
    public static void pobierzDwaSlowa(Scanner scanner) {
        System.out.println("\n// Zadanie 3: Pobierz dwa słowa od użytkownika i wypisz je:");
        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = scanner.next();
        System.out.print("Podaj drugie słowo: ");
        String slowo2 = scanner.next();
        System.out.println("Wprowadzone słowa to: " + slowo1 + " " + slowo2);
    }

    // Zadanie 4: Pobierz dwie liczby od użytkownika i wypisz ich sumę, różnicę, iloczyn i iloraz
    public static void obliczOperacjeNaLiczbach(Scanner scanner) {
        System.out.println("\n// Zadanie 4: Pobierz dwie liczby od użytkownika i wykonaj operacje arytmetyczne:");
        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        if (b != 0) {
            System.out.println("Iloraz: " + (a / b));
        } else {
            System.out.println("Iloraz: Dzielenie przez zero!");
        }
    }

    // Zadanie 5: Pobierz liczbę x i wykonaj różne operacje
    public static void obliczOperacjeNaX(Scanner scanner) {
        System.out.println("\n// Zadanie 5: Pobierz liczbę x i wykonaj różne operacje:");
        System.out.print("Podaj liczbę x: ");
        int x = scanner.nextInt();
        System.out.println("1. Powiększona o 140: " + (x + 140));
        System.out.println("2. Pomniejszona o 31: " + (x - 31));
        System.out.println("3. Powiększona 7 razy: " + (x * 7));
        System.out.println("4. Pomniejszona 13 razy: " + (x / 13));
        System.out.println("5. Modulo 7: " + (x % 7));
        System.out.println("6. Część całkowita z dzielenia przez 4: " + (x / 4));
        System.out.println("7. Podniesiona do potęgi 45: " + Math.pow(x, 45));
        System.out.println("8. Iloraz bitowy z 67: " + (x & 67));
        System.out.println("9. Suma bitowa z 59: " + (x | 59));
        System.out.println("10. XOR z 23: " + (x ^ 23));
        System.out.println("11. Przesunięta o 5 bitów w lewo: " + (x << 5));
        System.out.println("12. Przesunięta o 6 bitów w prawo: " + (x >> 6));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        typOperacji();

        // Zadanie 2
        obliczZrzutuj();

        // Zadanie 3
        pobierzDwaSlowa(scanner);

        // Zadanie 4
        obliczOperacjeNaLiczbach(scanner);

        // Zadanie 5
        obliczOperacjeNaX(scanner);

        scanner.close();
    }
}