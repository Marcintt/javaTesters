package Zajecia2;

public class Main {

    public static void main(String[] args) {
        //Zadanie1_lekcja2();
        //Zadanie2_lekja2();
        //Zadanie3_lekcja2();
        Zadanie1cz2_lekcja2();
        //System.out.println("Hello World!");
    }

    public static void Zadanie1_lekcja2() {
        //Napisz program, który za pomocą konstrukcji switch sprawdza, jaki jest dzień tygodnia (dzień tygodnia deklarujemy
        // jako zmienną int, 1-poniedziałek, 2-wtorek itd.). Jeżeli liczba jest spoza zakresu, program powinien wypisać
        // informacje o błędnym numerze dnia tygodnia.
        int dzien_tygodnia = 2;
        switch (dzien_tygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("Podaj cyfre z zakresu 1 - 7");
        }
    }

    public static void Zadanie2_lekja2() {
        //Zadeklaruj zmienną typu String, która zawierać będzie nazwę miesiąca (np. miesiąc = „LUTY”). Następnie, przy
        // użyciu switch’a wypisz użytkownikowi jaką mamy porę roku. Należy uwzględnić możliwość podania miesiąca który
        // nie istnieje (stosowny komunikat na konsoli).
        String miesiac = "Lipiec";
        switch (miesiac) {
            case "Grudzien":
            case "Styczen":
            case "Luty":
                System.out.println("Zima");
                break;
            case "Marzec":
            case "Kwiecien":
            case "Maj":
                System.out.println("Wiosna");
                break;
            case "Czerwiec":
            case "Lipiec":
            case "Sierpien":
                System.out.println("Lato");
                break;
            case "Wrzesien":
            case "Pazdziernik":
            case "Listopad":
                System.out.println("Jesien");
            default:
                System.out.println("Podaj nazwe miesiaca");
        }
    }

    public static void Zadanie3_lekcja2() {
        // Zadeklaruj trzy zmienne, dwie liczbowe oraz jedną znakową (char), a następnie przy pomocy switch’a
        // napisz prosty kalkulator wypisujący działanie oraz wynik na konsole (na liczbach działamy, a char to symbol
        // działania: +, -, itd.).
        int liczba1 = 5;
        int liczba2 = 0;
        char znak = '+';

        switch (znak) {
            case '+':
                System.out.println("Dodawanie: " + liczba1 + "+" + liczba2 + "=" + (liczba1 + liczba2));
                break;

            case '-':
                System.out.println("Odejmowanie: " + liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
                break;

            case '*':
                System.out.println("Mnozenie: " + liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
                break;

            case '/':
                System.out.println("Dzielenie: " + liczba1 + "/" + liczba2 + "=" + (liczba1 / liczba2));
                break;

        }

    }
    public static void Zadanie1cz2_lekcja2(){
        // Zadeklaruj trzy-elementową tablicę intów, uzupełnij ją dowolnymi wartościami, a następnie wypisz te wartości na konsole.

        int[] tablica = new int[3];
        int[] tablica1 = {10, 20, 30};
        System.out.println(tablica1);
    }
}


