package n1exercice2;

public class Worker {

    private final String NAME;
    private final String SURNAME;
    private final int PRICE_HOUR;

    public Worker(String name, String surname, int priceHour) {
        this.NAME = name;
        this.SURNAME = surname;
        this.PRICE_HOUR = priceHour;
    }

    public int getPriceHour() {
        return PRICE_HOUR;
    }

    public double calculateSalary(int workedHours) {

        if (workedHours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        return this.PRICE_HOUR * workedHours;
    }

}
