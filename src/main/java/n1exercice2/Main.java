package n1exercice2;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Worker worker1 = new Worker("Dani", "Vila", 0);
        WorkerOnline worker2 = new WorkerOnline("Marc", "Suau", 0);
        WorkerOnPlace worker3 = new WorkerOnPlace("Laia", "Vilaseca", 0);

        worker2.calculateSalaryOld();
        worker3.oldMethod();

    }
}
