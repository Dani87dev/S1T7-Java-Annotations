package n1exercice2;

public class WorkerOnline extends Worker {

    private final double ONLINE_WORKER = 40;

    public WorkerOnline(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int workedHours) {

        return this.getPriceHour() * workedHours + ONLINE_WORKER;
    }

    @Deprecated
    public void calculateSalaryOld() {
        System.out.println("This method is deprecated");
    }

}
