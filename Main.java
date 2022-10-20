public class Main {

    public static void main(String[] args) {
        Konto konto = new Konto();
        konto.setKontostand(13000);
//        System.out.println(konto);
        konto.aktuellerKontostand();

        Konto giroKonto = new Girokonto();
        giroKonto.setKontostand(12000);
//        System.out.println(giroKonto);
        giroKonto.aktuellerKontostand();

        Konto k1 = new Konto();
        k1.setKontostand(20);
        Konto k2 = new Konto();
        k2.setKontostand(10);

        k1.ueberweisen(k2, 3);
//        System.out.println("k1.kontostand = " + k1.getKontostand()); // 17
//        System.out.println("k2.kontostand = " + k2.getKontostand()); // 13

        Bank bank = new Bank();
        konto.setKontonummer(1);
        bank.addKonto(konto);
        giroKonto.setKontonummer(2);
        bank.addKonto(giroKonto);
        k1.setKontonummer(3);
        bank.addKonto(k1);
        k2.setKontonummer(4);
        bank.addKonto(k2);

        Konto sk = new Sparbuch();
        sk.setKontonummer(5);
        bank.addKonto(sk);

        System.out.println(bank.detailbericht());
    }
}

/*

Implementieren Sie in Java eine Klasse Bank, eine Klasse Konto.

Ein Konto besteht aus einem Kontostand sowie einen eingeräumten Kreditrahmen.
Es wird durch eine Kontonummer identifiziert und hat einen Vor- und Nachnamen
eines Bankkunden.

Es gibt zwei Arten von Konto, Girokonten und Sparbücher.

Girokonto hat zusätzlich zum Kreditrahmen
** einen Dispositionskredit von 3.000 Euro.
** Dieser wird eingerichtet, wenn der Kontostand einmalig den
Wert von 10.000 Euro erreicht wird.

Sparbücher haben zusätzlich einen Zinssatz, der
** über den Konstruktor festgelegt werden kann.

Stellen Sie folgende Methoden zur Verfügung:
1. Einen Konstruktor zum Initialisieren eines neuen (leeren) Kontos.
2. Eine Methode, die die Kontoinformationen als String-Objekt zurückliefert.
3. Eine Methode zum Einzahlen eines bestimmten Geldbetrages auf ein Konto.
4. Eine Methode zum Abheben eines bestimmten Geldbetrages von einem Konto.
5. Eine Methode, die den aktuellen Kontostand als Wert liefert.
Für das Girokonto wird der aktuelle Dispositionskredit ausgegeben.
Für das Sparbuch wird der Kontostand zum Jahresende ausgegeben, inkl. der Zinsen.
6. Eine Methode zum Überweisen eines bestimmten Geldbetrages
    von einem Konto auf ein anderes.

Die Klasse Bank soll folgende Methoden zur Verfügung stellen:
1. void addKonto(Konto k) zum Hinzufügen eines Kontos.
Ein Konto darf nicht mehrmals hinzugefügt werden.
2. String uebersicht() zur Ausgabe aller Kontodaten mit Kontostand
3. String detailbericht() zur Ausgabe aller Kontodaten
    mit Kontostand,
    Dispokredit (Girokonto)
    und Zinsen. (Sparbuch)

Schreiben Sie weiterhin ein Programm zum Testen der Klasse. Es sollen alle drei Kontotypen
benutzt werden. Dabei sollen sowohl alle Methoden aufgerufen werden als auch alle möglichen
Fehlerfälle getestet werden.
 */