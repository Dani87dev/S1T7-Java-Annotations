package n1exercice1;

public class WorkerOnPlace extends Worker {

    private final static int FUEL=150;

    public WorkerOnPlace(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int workedHours) {

        return this.getPriceHour() * workedHours + FUEL;
    }


}
