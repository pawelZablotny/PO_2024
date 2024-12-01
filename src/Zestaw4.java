import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Zestaw4{

    // Zadanie 1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return array;
    }

    // Zadanie 2
    public static void wypiszTablice(int[] tab, int n, int m) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (index < tab.length) {
                    System.out.printf("%4d", tab[index]);
                } else {
                    System.out.printf("%4s", ""); // Puste miejsce, jeśli tablica jest krótsza
                }
                index++;
            }
            System.out.println();
        }
    }

    // Zadanie 3
    public static int ileNieparzystych(int[] tab) {
        int count = 0;
        for (int num : tab) {
            if (num % 2 != 0) count++;
        }
        return count;
    }

    public static int ileParzystych(int[] tab) {
        int count = 0;
        for (int num : tab) {
            if (num % 2 == 0) count++;
        }
        return count;
    }

    public static int ileDodatnich(int[] tab) {
        int count = 0;
        for (int num : tab) {
            if (num > 0) count++;
        }
        return count;
    }

    public static int ileUjemnych(int[] tab) {
        int count = 0;
        for (int num : tab) {
            if (num < 0) count++;
        }
        return count;
    }

    public static int ileZerowych(int[] tab) {
        int count = 0;
        for (int num : tab) {
            if (num == 0) count++;
        }
        return count;
    }

    public static int ileMaxymalnych(int[] tab) {
        int max = Arrays.stream(tab).max().orElse(Integer.MIN_VALUE);
        int count = 0;
        for (int num : tab) {
            if (num == max) count++;
        }
        return count;
    }

    public static int ileMinimalnych(int[] tab) {
        int min = Arrays.stream(tab).min().orElse(Integer.MAX_VALUE);
        int count = 0;
        for (int num : tab) {
            if (num == min) count++;
        }
        return count;
    }

    public static int ileUnikalnych(int[] tab) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : tab) {
            uniqueElements.add(num);
        }
        return uniqueElements.size();
    }

    // Zadanie 4
    public static int sumaDodatnich(int[] tab) {
        int sum = 0;
        for (int num : tab) {
            if (num > 0) sum += num;
        }
        return sum;
    }

    public static int sumaUjemnych(int[] tab) {
        int sum = 0;
        for (int num : tab) {
            if (num < 0) sum += num;
        }
        return sum;
    }

    public static double sumaOdwrotnosci(int[] tab) {
        double sum = 0.0;
        for (int num : tab) {
            if (num != 0) sum += 1.0 / num;
        }
        return sum;
    }

    public static double sredniaArytmetyczna(int[] tab) {
        int sum = 0;
        for (int num : tab) sum += num;
        return tab.length > 0 ? (double) sum / tab.length : 0;
    }

    public static double sredniaGeometryczna(int[] tab) {
        double product = 1.0;
        int count = 0;
        for (int num : tab) {
            if (num > 0) {
                product *= num;
                count++;
            }
        }
        return count > 0 ? Math.pow(product, 1.0 / count) : 0;
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double sum = 0.0;
        int count = 0;
        for (int num : tab) {
            if (num != 0) {
                sum += 1.0 / num;
                count++;
            }
        }
        return count > 0 ? count / sum : 0;
    }

    // Zadanie 5
    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = a * tab[i] + b;
        }
        return result;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = a * tab[i] * tab[i] + b * tab[i] + c;
        }
        return result;
    }

    public static double[] funkcjaWykladnicza(int[] tab, int a) {
        double[] result = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = Math.pow(a, tab[i]);
        }
        return result;
    }

    public static int[] funkcjaSignum(int[] tab) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = Integer.compare(tab[i], 0);
        }
        return result;
    }

    // Zadanie 6
    public static int najdluzszyCiagDodatnich(int[] tab) {
        int maxLength = 0, currentLength = 0;
        for (int num : tab) {
            if (num > 0) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }
//    public static int najdluzszyCiagDodatnich(int[] tab) {
//        int maxLength = 0, currentLength = 0;
//
//        for (int i = 0; i < tab.length; i++) { // Klasyczna pętla
//            if (tab[i] > 0) { // Dostęp do elementu tablicy za pomocą indeksu
//                currentLength++;
//                maxLength = Math.max(maxLength, currentLength);
//            } else {
//                currentLength = 0;
//            }
//        }
//
//        return maxLength;
//    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        int maxLength = 0, currentLength = 0;
        for (int num : tab) {
            if (num < 0) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }

    public static void odwrocTablice(int[] tab) {
        int left = 0, right = tab.length - 1;
        while (left < right) {
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;
            left++;
            right--;
        }
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
        while (indeksStart < indeksStop) {
            int temp = tab[indeksStart];
            tab[indeksStart] = tab[indeksStop];
            tab[indeksStop] = temp;
            indeksStart++;
            indeksStop--;
        }
    }

    // Zadanie 7
    public static double[] generujZakres(int n, int minWartosc, int maxWartosc) {
        double[] array = new double[n];
        double step = (double)(maxWartosc - minWartosc) / (n - 1);

        for (int i = 0; i < n; i++) {
            array[i] = minWartosc + i * step;
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  int n, minWartosc, maxWartosc, a, b, c;
        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9};


//        // Zadanie 1: Generuj tablicę
//        System.out.print("Podaj liczbę elementów tablicy (n): ");
//        int n = scanner.nextInt();
//        System.out.print("Podaj minimalną wartość elementu: ");
//        int minWartosc = scanner.nextInt();
//        System.out.print("Podaj maksymalną wartość elementu: ");
//        int maxWartosc = scanner.nextInt();
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//        System.out.println("Wygenerowana tablica: " + Arrays.toString(tablica));
//
//        // Zadanie 2: Wypisz tablicę w formie macierzy
//        System.out.print("Podaj liczbę wierszy (n) do wyświetlenia tablicy: ");
//        int rows = scanner.nextInt();
//        System.out.print("Podaj liczbę kolumn (m) do wyświetlenia tablicy: ");
//        int cols = scanner.nextInt();
//        wypiszTablice(tablica, rows, cols);
//
//        // Zadanie 3: Funkcje zliczające
//        System.out.println("Ilość nieparzystych: " + ileNieparzystych(tablica));
//        System.out.println("Ilość parzystych: " + ileParzystych(tablica));
//        System.out.println("Ilość dodatnich: " + ileDodatnich(tablica));
//        System.out.println("Ilość ujemnych: " + ileUjemnych(tablica));
//        System.out.println("Ilość zerowych: " + ileZerowych(tablica));
//        System.out.println("Ilość maksymalnych: " + ileMaxymalnych(tablica));
//        System.out.println("Ilość minimalnych: " + ileMinimalnych(tablica));
//        System.out.println("Ilość unikalnych: " + ileUnikalnych(tablica));
//
//        // Zadanie 4: Funkcje obliczające sumy i średnie
//        System.out.println("Suma dodatnich: " + sumaDodatnich(tablica));
//        System.out.println("Suma ujemnych: " + sumaUjemnych(tablica));
//        System.out.println("Suma odwrotności: " + sumaOdwrotnosci(tablica));
//        System.out.println("Średnia arytmetyczna: " + sredniaArytmetyczna(tablica));
//        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tablica));
//        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tablica));
//
        // Zadanie 5: Funkcje matematyczne na elementach tablicy
        System.out.print("Podaj współczynnik a dla funkcji liniowej: ");
        int a = scanner.nextInt();
        System.out.print("Podaj współczynnik b dla funkcji liniowej: ");
        int b = scanner.nextInt();
        System.out.println("Wynik funkcji liniowej ax + b: " + Arrays.toString(funkcjaLiniowa(tablica, a, b)));

        System.out.print("Podaj współczynniki a, b, c dla funkcji kwadratowej: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Wynik funkcji kwadratowej ax^2 + bx + c: " + Arrays.toString(funkcjaKwadratowa(tablica, a, b, c)));

        System.out.print("Podaj podstawę a dla funkcji wykładniczej a^x: ");
        a = scanner.nextInt();
        System.out.println("Wynik funkcji wykładniczej a^x: " + Arrays.toString(funkcjaWykladnicza(tablica, a)));

        System.out.println("Wynik funkcji signum: " + Arrays.toString(funkcjaSignum(tablica)));

        // Zadanie 6: Operacje na tablicy
        System.out.println("Najdłuższy ciąg dodatnich: " + najdluzszyCiagDodatnich(tablica));
        System.out.println("Najdłuższy ciąg ujemnych: " + najdluzszyCiagUjemnych(tablica));

        odwrocTablice(tablica);
        System.out.println("Tablica po odwróceniu: " + Arrays.toString(tablica));

        System.out.print("Podaj indeks początkowy dla częściowego odwrócenia tablicy: ");
        int indeksStart = scanner.nextInt();
        System.out.print("Podaj indeks końcowy dla częściowego odwrócenia tablicy: ");
        int indeksStop = scanner.nextInt();
        odwrocTablice(tablica, indeksStart, indeksStop);
        System.out.println("Tablica po częściowym odwróceniu: " + Arrays.toString(tablica));
//
//        //Zadanie 7: Generowanie tablicy o równych odstępach
//        System.out.print("Podaj liczbę elementów do generowania (n): ");
//        n = scanner.nextInt();
//        System.out.print("Podaj minimalną wartość: ");
//        minWartosc = scanner.nextInt();
//        System.out.print("Podaj maksymalną wartość: ");
//        maxWartosc = scanner.nextInt();
//        double[] zakresTablica = generujZakres(n, minWartosc, maxWartosc);
//        System.out.println("Tablica o równych odstępach: " + Arrays.toString(zakresTablica));

        scanner.close();
    }
}