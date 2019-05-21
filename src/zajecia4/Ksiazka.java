package zajecia4;

//Napisz klasę Książka, która będzie zawierała atrybuty: tytuł, autor, ilość stron, ilość przeczytanych stron.
// Klasa powinna udostępniać metody: coToZaKsiazka – wypisującą informacje o książce, czytaj – przyjmującą
// parametr określający ilość stron do przeczytania (należy sprawdzić czy książka nie została już przeczytana) oraz
// czyPrzeczytana – zwracająca informacje czy dana książka została już przeczytana. Przetestuj działanie swojej klasy
// w prostej metodzie main.
//

public class Ksiazka {
    private String tytul;
    private String autor;
    private int iloscStron;
    private int iloscPrzeczytanychStron;

    public Ksiazka(){
        tytul = "Krzyzacy";
        autor = "Sienkiewicz";
        iloscStron = 253;
        iloscPrzeczytanychStron = 2;

    }

    public Ksiazka(String tytul, String autor, int iloscStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.iloscStron = iloscStron;
    }

    public void coToZaKsiazka(){
        System.out.println("Ksiazka:  " + tytul + " autora " + autor);
    }

    void czytaj(){
        this.iloscStron = iloscStron;
        this.iloscPrzeczytanychStron = iloscPrzeczytanychStron;
        int ileDoPrzeczytania = iloscStron - iloscPrzeczytanychStron;
        System.out.println("Zostało do przeczytania:" + ileDoPrzeczytania + "stron");
    }

    public void czyPrzeczytana(){
        if (iloscPrzeczytanychStron < iloscStron){
            System.out.println("Ksiazka nie została przeczytana");
        }
    }
}
