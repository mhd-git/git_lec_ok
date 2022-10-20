// Sparbuch ist ein Konto
public class Sparbuch extends Konto {
    private double zinssatz;

    public Sparbuch(){}

    public Sparbuch(double kontostand, double kriditrahmen,
                    int kontonummer, String vorname, String nachname, double zinssatz) {
        super(kontostand, kriditrahmen, kontonummer, vorname, nachname);
        this.zinssatz = zinssatz;
    }

    @Override
    public double aktuellerKontostand() {
        System.out.println("Sparbuch: Kontostand zum Jahresende inkl. der Zinsen = "
                + (getKontostand() + zinssatz));
        return getKontostand();
    }


    @Override
    public String toString() {
        return "Sparbuch{" +
                "kontostand=" + getKontostand() +
                ", kriditrahmen=" + getKriditrahmen() +
                ", kontonummer=" + getKontonummer() +
                ", vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", zinssatz=" + zinssatz +
                '}';
    }

    //region getter & setter
    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }
    //endregion
}
