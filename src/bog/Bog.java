package bog;

public class Bog {
    String ISBNNummer,titelog, udgivelsesår;

    public Bog(String ISBNNummer, String titelog, String udgivelsesår) {
        this.ISBNNummer = ISBNNummer;
        this.titelog = titelog;
        this.udgivelsesår = udgivelsesår;
    }

    public String getISBNNummer() {
        return ISBNNummer;
    }

    public void setISBNNummer(String ISBNNummer) {
        this.ISBNNummer = ISBNNummer;
    }

    public String getTitelog() {
        return titelog;
    }

    public void setTitelog(String titelog) {
        this.titelog = titelog;
    }

    public String getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(String udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    public boolean sameISBN(Bog bog){
        return this.ISBNNummer.equals(bog.ISBNNummer);
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBNNummer='" + ISBNNummer + '\'' +
                ", titelog='" + titelog + '\'' +
                ", udgivelsesår='" + udgivelsesår + '\'' +
                '}';
    }
}
