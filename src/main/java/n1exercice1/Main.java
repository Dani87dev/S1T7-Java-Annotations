package n1exercice1;

public class Main {

    public static void main(String[] args) {



        Worker worker1 = new Worker("Dani", "Vila", 0);
        WorkerOnline worker2 = new WorkerOnline("Marc", "Suau", 0);
        WorkerOnPlace worker3 = new WorkerOnPlace("Laia", "Vilaseca", 0);

        worker1.setPreuHora(25);
        worker2.setPreuHora(25);
        worker3.setPreuHora(25);

        System.out.println(worker1.calculateSalary(10));
        System.out.println(worker2.calculateSalary(10));
        System.out.println(worker3.calculateSalary(10));


    }
}
