package n1exercice2;

public class TreballadorOnline extends Treballador {

    private final double TREBALLADORONLINE = 40;
    private int extra = 150;

    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public double calcularSou(int horesTreballades) {
        double sou = 0d;
        sou = this.getPreuHora() * horesTreballades + TREBALLADORONLINE;

        return sou;
    }

    @Deprecated public void calcularSouOld() {
        System.out.println("This method is deprecated");
    }

}
