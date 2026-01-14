package n1exercice2;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {



        Treballador worker1 = new Treballador("Dani", "Vila", 0);
        TreballadorOnline worker2 = new TreballadorOnline("Marc", "Suau", 0);
        TreballadorPresencial worker3 = new TreballadorPresencial("Laia", "Vilaseca", 0);

        worker2.calcularSouOld();
        worker3.oldMethod();

    }
}
