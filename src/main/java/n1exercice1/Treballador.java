package n1exercice1;

public class Treballador {

    private String nom = "";
    private String cognom = "";
    private int preuHora = 0;

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getPreuHora() {
        return preuHora;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setPreuHora(int preuHora) {
        this.preuHora = preuHora;
    }

    public double calcularSou(int horesTreballades) {
        double sou = 0d;
        sou = preuHora * horesTreballades;

        return sou;
    }

}
