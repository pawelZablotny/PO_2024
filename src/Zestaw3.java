import java.util.Scanner;

public class Zestaw3{

    // Zadanie 1
    public static void trojkiPitagorejskie(int n) {
        System.out.println("Pythagorean triples up to " + n + ":");
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);
                if (c <= n && c * c == cSquared) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }

    // Zadanie 2
    public static void funKwaRozwiazania(int n) {
        System.out.println("Quadratic coefficients with real solutions up to " + n + ":");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int discriminant = b * b - 4 * a * c;
                    if (discriminant >= 0) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }

    //Zadanie 3
    public static void funKwaDelta(int n) {
        System.out.println("Quadratic coefficients with discriminant as perfect square up to " + n + ":");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int discriminant = b * b - 4 * a * c;
                    int sqrtDelta = (int) Math.sqrt(discriminant);
                    if (discriminant >= 0 && sqrtDelta * sqrtDelta == discriminant) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }

    // Zadanie 4
    public static void liczbyPierwsze(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Zadanie 5
    public static void liczbyPodzielne(int m, int n) {
        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;

        System.out.println(m + "-digit numbers divisible by " + n + ":");
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Zadanire 6
    public static void piramida(int n, int variant) {
        if (variant == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) System.out.print(" ");
                for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
                System.out.println();
            }
        } else if (variant == 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) System.out.print("*");
                System.out.println();
            }
        }
    }

    // Zadanie 7
    public static long silnia(int n) {
        if (n <= 1) return 1;
        return n * silnia(n - 1);
    }

    // Zadanie 8
    public static long silniaPodwojna(int n) {
        if (n <= 1) return 1;
        return n * silniaPodwojna(n - 2);
    }

    // Zadanie 9
    public static long silnia(int m, int n) {
        if (n <= 1) return 1;
        return n * silnia(m, n - m);
    }

    // Zadanie 10
    public static long dwumianNewtona(int n, int k) {
        if (k == 0 || k == n) return 1;
        return dwumianNewtona(n - 1, k - 1) + dwumianNewtona(n - 1, k);
    }

    // Zadanie 11
    public static void ciagFibonacciego(int n) {
        int a = 0, b = 1;
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // Zadanie 12
    public static int sumaNaturalnych(int n) {
        return n * (n + 1) / 2;
    }

    public static int sumaParzystych(int n) {
        return n * (n + 1);
    }

    public static int sumaNieparzystych(int n) {
        return n * n;
    }

    public static int sumaKwaNaturalnych(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static int sumaSzeNaturalnych(int n) {
        int sumN = sumaNaturalnych(n);
        return sumN * sumN;
    }

    public static double sumaOdwNaturalnych(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // Zadanie 13
    public static boolean czyPalindrom(String wyraz) {
        int left = 0, right = wyraz.length() - 1;
        while (left < right) {
            if (wyraz.charAt(left) != wyraz.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Zadanie14
    public static void trojkatPascala (int n) {
        for (int wiersz = 0; wiersz < n; wiersz++) {
            int value = 1;
            for (int i = 0; i <= wiersz; i++){
                System.out.print(value + " ");
                if (i < wiersz){
                    value = value * (wiersz - i) / (i + 1);
                }
            }
            System.out.println();
        }

    }

    //Zadanie 15
    public static boolean czyPalindrom(int p) {
        int liczba = p;
        int odwrocona = 0;

        while (p > 0) {
            int liczb = p % 10;
            odwrocona = odwrocona * 10 + liczb;
            p /= 10;
        }

        return liczba == odwrocona;
    }

    // Zadanie 16
    public static boolean czyDoskonala(int n) {
        int sumaDzielnikow = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumaDzielnikow += i;
            }
        }
        return sumaDzielnikow == n;
    }

    // Zadanie 17
    public static boolean czyPierwsza(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Zadanie 18
    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Zadanie 19
    public static int[] wczytajTablice(int n, Scanner scanner) {
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    // Zadanie 20
    public static void podzbiory(int[] tablica) {
        int liczbaPodzbiorow = (int) Math.pow(2, tablica.length);

        for (int i = 0; i < liczbaPodzbiorow; i++) {
            System.out.print("{ ");
            for (int j = 0; j < tablica.length; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(tablica[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.print("Podaj liczbę dla trójek pitagorejskich (Zadanie 1): ");
        int n = scanner.nextInt();
        trojkiPitagorejskie(n);

        // Zadanie 2
        System.out.print("Podaj liczbę dla współczynników funkcji kwadratowej z rzeczywistymi rozwiązaniami (Zadanie 2): ");
        n = scanner.nextInt();
        funKwaRozwiazania(n);

        // Zadanie 3
        System.out.print("Podaj liczbę dla współczynników funkcji kwadratowej z delty będącej kwadratem liczby naturalnej (Zadanie 3): ");
        n = scanner.nextInt();
        funKwaDelta(n);

        // Zadanie 4
        System.out.print("Podaj liczbę dla liczb pierwszych do n (Zadanie 4): ");
        n = scanner.nextInt();
        liczbyPierwsze(n);

        // Zadanie 5
        System.out.print("Podaj liczbę cyfr (m) (Zadanie 5): ");
        int m = scanner.nextInt();
        System.out.print("Podaj dzielnik (n) (Zadanie 5): ");
        n = scanner.nextInt();
        liczbyPodzielne(m, n);

        // Zadanie 6
        System.out.print("Podaj wysokość piramidy (n) (Zadanie 6): ");
        n = scanner.nextInt();
        System.out.print("Podaj wariant (1 lub 2) (Zadanie 6): ");
        int variant = scanner.nextInt();
        piramida(n, variant);

        // Zadanie 7
        System.out.print("Podaj liczbę dla silni (Zadanie 7): ");
        n = scanner.nextInt();
        System.out.println("Silnia: " + silnia(n));

        // Zadanie 8
        System.out.print("Podaj liczbę dla silni podwójnej (Zadanie 8): ");
        n = scanner.nextInt();
        System.out.println("Silnia podwójna: " + silniaPodwojna(n));

        // Zadanie 9
        System.out.print("Podaj krok silni (m) (Zadanie 9): ");
        m = scanner.nextInt();
        System.out.print("Podaj liczbę (n) dla m-tej silni (Zadanie 9): ");
        n = scanner.nextInt();
        System.out.println("m-ta silnia: " + silnia(m, n));

        // Zadanie 10
        System.out.print("Podaj n dla dwumianu Newtona (Zadanie 10): ");
        int nBinom = scanner.nextInt();
        System.out.print("Podaj k dla dwumianu Newtona (Zadanie 10): ");
        int kBinom = scanner.nextInt();
        System.out.println("Dwumian Newtona: " + dwumianNewtona(nBinom, kBinom));

        // Zadanie 11
        System.out.print("Podaj liczbę wyrazów ciągu Fibonacciego (n) (Zadanie 11): ");
        n = scanner.nextInt();
        ciagFibonacciego(n);

        // Zadanie 12
        System.out.print("Podaj liczbę dla obliczeń sumy (n) (Zadanie 12): ");
        n = scanner.nextInt();
        System.out.println("Suma pierwszych n liczb naturalnych: " + sumaNaturalnych(n));
        System.out.println("Suma pierwszych n liczb parzystych: " + sumaParzystych(n));
        System.out.println("Suma pierwszych n liczb nieparzystych: " + sumaNieparzystych(n));
        System.out.println("Suma kwadratów pierwszych n liczb naturalnych: " + sumaKwaNaturalnych(n));
        System.out.println("Suma sześcianów pierwszych n liczb naturalnych: " + sumaSzeNaturalnych(n));
        System.out.println("Suma odwrotności pierwszych n liczb naturalnych: " + sumaOdwNaturalnych(n));

        // Zadanie 13
        System.out.print("Podaj słowo, aby sprawdzić, czy jest palindromem (Zadanie 13): ");
        scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println("Czy palindrom? " + czyPalindrom(word));


//        //Zadanie 14
//        int n = 5;
//        trojkatPascala(n);
//
//        //Zadanie 15
//        int p = 12321;
//
//        if (czyPalindrom(p)) {
//            System.out.println(p + " jest palindromem.");
//        } else {
//            System.out.println(p + " nie jest palindromem.");
//        }

        // Zadanie 16
        System.out.print("Podaj liczbę, aby sprawdzić, czy jest doskonała (Zadanie 16): ");

        System.out.println("Czy liczba jest doskonała? " + czyDoskonala(n));

        // Zadanie 17
        System.out.print("Podaj liczbę, aby sprawdzić, czy jest pierwsza (Zadanie 17): ");
        n = scanner.nextInt();
        System.out.println("Czy liczba jest pierwsza? " + czyPierwsza(n));

        // Zadanie 18
        System.out.print("Podaj pierwszą liczbę (a) dla NWD (Zadanie 18): ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę (b) dla NWD (Zadanie 18): ");
        int b = scanner.nextInt();
        System.out.println("Największy wspólny dzielnik: " + NWD(a, b));

        // Zadanie 19
        System.out.print("Podaj liczbę elementów tablicy (n) (Zadanie 19): ");
        n = scanner.nextInt();
        int[] tablica = wczytajTablice(n, scanner);

        System.out.println("Elementy tablicy:");
        for (int num : tablica) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Zadanie 20
        System.out.println("Podzbiory tablicy (Zadanie 20):");
        podzbiory(tablica);

    }

}