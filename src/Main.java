import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
        Zadanie1Cz2();
        Zadanie2Cz2();

        //System.out.println("Hello World!");
    }

    public static void Zadanie1() {
        //1. W ramach testów zadeklaruj po jednej zmiennej typów: boolean, char, int, long, float, dobule, String,
        // oraz wypisz je na konsolę.
        boolean zmiennaBoolean = true;
        char pojedynczyZnak = 'w';
        int liczba = 123;
        long duzaLiczba = 1234;
        float innaLiczba = 12345.5f;
        double najwiekszaLiczba = 123456.5;
        String newString = "example";
        System.out.println("Zadanie 1");
        System.out.println(pojedynczyZnak);
        System.out.println(liczba);
        System.out.println(duzaLiczba);
        System.out.println(innaLiczba);
        System.out.println(najwiekszaLiczba);
        System.out.println(newString);
        System.out.println("");
    }

    public static void Zadanie2(){
        //2. Zadeklaruj dwie zmienne liczbowe, oraz wypisz na ekran wyniki kilku podstawowych działań które można na nich wykonać (+, -, *, /, %).

        int liczba1 = 12;
        int liczba2 = 5;
        int dodawanie = liczba1 + liczba2;
        int odejmowanie = liczba1 - liczba2;
        double mnozenie = liczba1 * liczba2;
        double dzielenie = liczba1 / liczba2;
        double modulo = liczba1 % liczba2;
        System.out.println("Zadanie 2");
        System.out.println("Działania:");
        System.out.println(dodawanie);
        System.out.println(odejmowanie);
        System.out.println(mnozenie);
        System.out.println(dzielenie);
        System.out.println(modulo);
        System.out.println("");
    }
    public static void Zadanie3(){
        //Napisz program służący do konwersji wartości temperatury podanej w stopniach Celsjusza na stopnie w
        // skali Fahrenheita oraz odwrotnie (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0). Dane które
        // mamy skonwertować umieszczamy na początku programu w zmiennych (np. double stopnieC, oraz double stopnieF).

        double stopnieC = 100;
        double stopnieF = 212;

        double konwersjaZFDoC = 1.8 * stopnieC +32.0;
        double konwersjazCDoF = (stopnieF - 32.0)/1.8;
        System.out.println("Zadanie 3");
        System.out.println("stopnie faranfaita = " + konwersjaZFDoC);
        System.out.println("stopnie Celcjusza = " + konwersjazCDoF);
        System.out.println("");

    }

    public static void Zadanie4(){
        int liczba = 4434;
        String str1 = Integer.toString(liczba);
        String[] parts = str1.split("");
        System.out.println("Zadanie 4");
        System.out.println(Arrays.toString(parts));
        String a_str = parts[0];
        String b_str = parts[1];
        String c_str = parts[2];
        String d_str = parts[3];

        int a_int = Integer.parseInt(a_str);
        int b_int = Integer.parseInt(b_str);
        int c_int = Integer.parseInt(c_str);
        int d_int = Integer.parseInt(d_str);
        //int suma = a_int + b_int + c_int + d_int;
        //double srednia = (a_int + b_int + c_int + d_int)/4.0f;
        System.out.println("suma = " + (a_int + b_int + c_int + d_int));
        System.out.println("Srednia = " + ((a_int + b_int + c_int + d_int)/4.0f));
        System.out.println("");

    }

    public static void Zadanie1Cz2(){
        int a = 20;
        int b = 5;
        int c = 12;

        //int tablica[] = new int[3];
        int[] tablica = new int[]{a,b,c};
        System.out.println(Arrays.toString(tablica));
        Arrays.sort(tablica);
        System.out.println("Zadanie 1 czesc 2");
        System.out.println(Arrays.toString(tablica));
        System.out.println("min = " + tablica[0]);
        System.out.println("max = " + tablica[2]);
        System.out.println("");
    }

    public static void Zadanie2Cz2(){
        double wzrost = 1.75;
        double waga = 50;
        double wspolczynnik = waga / (wzrost*wzrost);
        System.out.println("Zadanie 2 czesc 2");
        System.out.println(wspolczynnik);

        if (wspolczynnik < 18.5) {
            System.out.println("Niedowaga");
        }
        else if ((wspolczynnik >= 18.5) && (wspolczynnik <= 24.9)){
            System.out.println("Waga prawidłowa");
        }
        else{
            System.out.println("Nadwaga");
        }
        System.out.println("");
    }
}


