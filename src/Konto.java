public class Konto {
    private double kontostand;
    private double kriditrahmen;
    private int kontonummer;
    private String vorname;
    private String nachname;

    public Konto() {
    }

    public Konto(double kontostand, double kriditrahmen,
                 int kontonummer, String vorname, String nachname) {
        this.kontostand = kontostand;
        this.kriditrahmen = kriditrahmen;
        this.kontonummer = kontonummer;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public void abheben(double betrag) {
        kontostand -= betrag;
    }

    public double aktuellerKontostand() {
        System.out.println("Konto: aktueller Kontostand");
        return kontostand;
    }

    public void ueberweisen(Konto k2, double betrag) {
        this.kontostand -= betrag;
        k2.setKontostand(k2.getKontostand() + betrag);
    }

    //region toString
    @Override
    public String toString() {
        return "Konto{" +
                "kontostand=" + kontostand +
                ", kriditrahmen=" + kriditrahmen +
                ", kontonummer=" + kontonummer +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
    //endregion

    //region getters & setters
    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKriditrahmen() {
        return kriditrahmen;
    }

    public void setKriditrahmen(double kriditrahmen) {
        this.kriditrahmen = kriditrahmen;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    //endregion
}
