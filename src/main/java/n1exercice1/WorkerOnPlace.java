package n1exercice1;

public class WorkerOnPlace extends Worker {

    private static int fuel=150;

    public WorkerOnPlace(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    public static int getFuel() {
        return fuel;
    }

    public static void setFuel(int fuel) {
        WorkerOnPlace.fuel = fuel;
    }

    @Override
    public double calculateSalary(int workedHours) {
        double salary = 0d;
        salary = this.getPriceHour() * workedHours + fuel;

        return salary;
    }


}
