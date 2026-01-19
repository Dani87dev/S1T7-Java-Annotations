package n1exercice2;

public class WorkerOnPlace extends Worker {

    private static final int FUEL = 150;

    public WorkerOnPlace(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int workedHours) {

        return this.getPriceHour() * workedHours + FUEL;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }


}
