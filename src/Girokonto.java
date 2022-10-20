public class Girokonto extends Konto { // Girokonto ist ein Konto
    private double dispositionskredit;

    public Girokonto(double kontostand, double kriditrahmen,
                     int kontonummer, String vorname, String nachname) {
        super(kontostand, kriditrahmen, kontonummer, vorname, nachname);
        if (kontostand >= 10000) {
            dispositionskredit = 3000;
        } else {
            dispositionskredit = 0;
        }
    }

    public Girokonto() {
        if (getKontostand() >= 10000) {
            dispositionskredit = 3000;
        } else {
            dispositionskredit = 0;
        }
    }

    @Override
    public double aktuellerKontostand() {
        System.out.println("Girokonto: aktueller Dispositionskredit = " + dispositionskredit);
        return getKontostand();
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "kontostand=" + getKontostand() +
                ", kriditrahmen=" + getKriditrahmen() +
                ", kontonummer=" + getKontonummer() +
                ", vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", dispositionskredit=" + dispositionskredit +
                '}';
    }

    //region getter & setter
    public double getDispositionskredit() {
        return dispositionskredit;
    }

    public void setDispositionskredit(double dispositionskredit) {
        this.dispositionskredit = dispositionskredit;
    }
    //endregion
}
