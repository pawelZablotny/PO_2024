import java.util.Arrays;



public class Kolokwium1 {

    //Zadanie 1
    public static int[] ciagArytmecztycznyRodzajuM (int n, int m, int a1, int r){
        int [] ciag = new int[n];
        ciag [0] = a1;
        for (int i=1; i<n; i++){
            ciag[i] = ciag[i-1] + r;
        }

        return ciag;
    }
    //Zadanie 2
    public static boolean czyCiagArytmetyczny(int[] tab) {
        int r = tab[1] - tab[0];
        for (int i = 1; i < tab.length - 1; i++) {
            if (tab[i + 1] - tab[i] != r) {

                return false;
            }

        }
        return true;
    }

    //Zadanie 3

    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m) {
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] - tab[i - 1] != m) {
                return false;

            }
        }
        return true;
    }

    //Zadanie 4
    public static int[] podciag(int[] tab) {

        int maxDlugosc = 1;
        int aktualnaDlugosc = 1;
        int startIndex = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[i - 1]) {
                aktualnaDlugosc++;
                if (aktualnaDlugosc > maxDlugosc) {
                    maxDlugosc = aktualnaDlugosc;
                    startIndex = i - aktualnaDlugosc + 1;
                }
            } else {aktualnaDlugosc = 1;}
        }

        return Arrays.copyOfRange(tab, startIndex, startIndex + maxDlugosc);
    }

    //Zadanie 5

    public static int podciag(int[] tab, int r) {

        int maxDlugosc = 1, aktualnaDlugosc =1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[i - 1]) {
                aktualnaDlugosc++;
                maxDlugosc = Math.max(maxDlugosc, aktualnaDlugosc);
            } else {aktualnaDlugosc = 1;}

        }
        return maxDlugosc;

    }



    //Zadanie 6

//    public static int sekwencjaCollatza(int n, int c){
//        while ( c != 1) {
//            System.out.print(c + " ");
//            if (c % 2 == 0) {
//                c = c / 2;
//            } else {
//                c = 3 * c + 1;
//            }
//        }
//        System.out.println(c);
//        return c;
//    }

    //Zadanie 7

//    public static int minMaxSekwencjaCollatza(int n, int c){
//
//    }

    public static void main(String[] args) {

        //Zadanie 1
        int [] ciag1 = ciagArytmecztycznyRodzajuM(8, 0, 2, 4);
        System.out.println("Ciąg o podanych parametrach to: " + Arrays.toString(ciag1));

        //Zadanie 2
//        int[] ciag2 = {3, 6, 9, 12};
        int[] ciag2 = {3, 6, 9, 11};
        System.out.println("Czy ciąg jest arytmetyczny? " + czyCiagArytmetyczny(ciag2));

        //Zadanie 3
//        int[] ciag3 ={2, 4, 6, 8};
        int[] ciag3 ={2, 4, 6, 7};
        System.out.println("Czy ciąg ma roznice M? " + czyCiagArytmetycznyRodzajuM(ciag3, 2));

        //Zadanie 4

//        int[] ciag4 = {1, 2, 0, 3 ,5 ,1, 4};
        int[] ciag4 = {1, 2, 0, 3 ,5 ,1, 4};
        int[] najwiekszyRosnacy = podciag(ciag4);
        System.out.println("Największy ciąg rosnący: " + Arrays.toString(najwiekszyRosnacy));

        //Zadanie 5
        int[] ciag5 = {1, 2, 0, 3 ,5 ,1, 4};
        System.out.println("Najdluzszy podciąg rosnący o 1: " + podciag(ciag5, 1));

//        //Zadanie 6
//        System.out.println("Sekwencja Collztza: " + sekwencjaCollatza(10, 1));

        //Zadanie 7
    }
}