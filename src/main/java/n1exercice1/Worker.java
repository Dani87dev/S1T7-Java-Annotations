package n1exercice1;

public class Worker {

    private final String NAME;
    private final String SURNAME;
    private int priceHour;

    public Worker(String name, String surname, int priceHour) {
        this.NAME = name;
        this.SURNAME = surname;
        this.priceHour = priceHour;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }

    public double calculateSalary(int workedHours) {

        if (workedHours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        return this.priceHour * workedHours;
    }

}
