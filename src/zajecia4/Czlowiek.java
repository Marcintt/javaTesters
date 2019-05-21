package zajecia4;

public class Czlowiek {
    //Napisz klasę Człowiek, która będzie zawierała dwa atrybuty: imię, nazwisko, oraz jedną metodę przedstawSię, która
    //wypisze na konsole napis postaci „Nazywam się imię i nazwisko”. Przetestuj działanie swojej klasy w prostej metodzie main.
    private String imie;
    private String nazwisko;


    public Czlowiek(){
        imie = "Marcin";
        nazwisko = "Wikarski";
    }

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie(){
        System.out.println("Witam, jestem " + imie +' ' + nazwisko );
    }
}
