package n1exercice1;

public class TreballadorOnline extends Treballador {

    private final double TREBALLADORONLINE = 0;

    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        double sou = 0d;
        sou = this.getPreuHora() * horesTreballades + TREBALLADORONLINE;

        return sou;
    }

}
