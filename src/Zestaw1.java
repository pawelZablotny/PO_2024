public class Zestaw1 {

    // Zadanie 1
    public static void zadanie1() {
        System.out.println("Twoje Imię");
    }

    // Zadanie 2
    public static void zadanie2() {
        String name = "Twoje Imię";
        System.out.println("Długość imienia: " + name.length());
    }

    // Zadanie 3
    public static void zadanie3() {
        String result = "Ala" + " " + "ma" + " " + "kota";
        System.out.println(result);
    }


    // Zadanie 5
    public static void zadanie5() {
        String sentence = "Ala ma kota";
        String modifiedSentence = sentence.replace('a', 'e');
        System.out.println(modifiedSentence);
    }

    // Zadanie 6
    public static void zadanie6() {
        String sentence = "Ala ma kota";
        String modifiedSentence = sentence.equals(sentence.toUpperCase()) ? sentence.toLowerCase() : sentence.toUpperCase();
        System.out.println(modifiedSentence);
    }

    //
    public static void zadanie7() {
        System.out.println("ASCII dla 'A': " + (int) 'A');
        System.out.println("ASCII dla '!': " + (int) '!');
        System.out.println("ASCII dla '@': " + (int) '@');
        System.out.println("ASCII dla '>': " + (int) '>');
        System.out.println("ASCII dla '~': " + (int) '~');
        System.out.println("ASCII dla '\\n': " + (int) '\n');
        System.out.println("ASCII dla '\\b': " + (int) '\b');
    }

    // Zadanie 8
    public static void zadanie8() {
        System.out.println("Małe litery: 97 - 122");
        System.out.println("Wielkie litery: 65 - 90");
        System.out.println("Cyfry: 48 - 57");
    }

    // Zadanie 9
    public static void zadanie9() {
        String sentence = "Grzesiek nie wiedział dlaczego … jest tak drapieżnym … mimo, że jego … na to nie wskazuje.";
        sentence = sentence.replace("…", "dlaczego");
        System.out.println(sentence);
    }

    // Zadanie 10
    public static void zadanie10() {
        String sentence = "… to najlepsza książka napisana przez …";
        sentence = sentence.replace("…", "Harry Potter").replace("…", "J.K. Rowling");
        System.out.println(sentence);
    }

    // Zadanie 11
    public static void zadanie11() {
        for (int i = 0; i < 5; i++) {
            System.out.print("wodrze ");
        }
    }

    // Zadanie 12
    public static void zadanie12() {
        String sentence = "Dzisiaj jest (05-10-2024) godzina(15:30:00)";
        System.out.println(sentence);
    }

    // Zadanie 13
    public static void zadanie13() {
        System.out.println("Znak dla 54: " + (char) 54);
        System.out.println("Znak dla 103: " + (char) 103);
        System.out.println("Znak dla 241: " + (char) 241);
        System.out.println("Znak dla 67: " + (char) 67);
        System.out.println("Znak dla 9999: Niepoprawny kod ASCII");
        System.out.println("Znak dla długości imienia: " + (char) "Pawel".length());
        System.out.println("Znak dla numeru albumu: " + (char) 129948);
    }

    public static void main(String[] args) {

        zadanie1();
        zadanie2();
        zadanie3();

        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();
        zadanie9();
        zadanie10();
        zadanie11();
        zadanie12();
        zadanie13();
    }
}