import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> konten;

    Bank() {
        konten = new ArrayList<>();
    }

    void addKonto(Konto k) {
        boolean b = true;
        for (Konto iKonto : konten) {
            if (iKonto.getKontonummer() == k.getKontonummer()) {
                b = false;
                break;
            }
        }
        if (b) {
            konten.add(k);
        }
    }

    String uebersicht() {
        String str = "";
        for (int i = 0; i < this.konten.size(); i++) {
            str += konten.get(i).toString() + "\n";
        }
        return str;
    }

    String detailbericht() {
        String str = "Bank{\n";
        for (Konto iKonto : konten) {
            str += iKonto.toString() + ",\n";
        }
        str += "}";
        return str;
    }

    @Override
    public String toString() {
        String str = "Bank{\n";
        for (Konto iKonto : konten) {
            str += iKonto.toString() + ",\n";
        }
        str += "}";
        return str;
    }

    //region getter setter
    public ArrayList<Konto> getKonten() {
        return konten;
    }

    public void setKonten(ArrayList<Konto> konten) {
        this.konten = konten;
    }
    //endregion
}
