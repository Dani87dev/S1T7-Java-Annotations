package n1exercice1;

public class TreballadorPresencial extends Treballador {

    private static int benzina;

    public TreballadorPresencial(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    public static int getBenzina() {
        return benzina;
    }

    public static void setBenzina(int benzina) {
        TreballadorPresencial.benzina = benzina;
    }

    @Override
    public double calcularSou(int horesTreballades) {
        double sou = 0d;
        sou = this.getPreuHora() * horesTreballades + benzina;

        return sou;
    }


}
