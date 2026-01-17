package n1exercice1;

public class Worker {

    private String name = "";
    private String surname = "";
    private int priceHour = 0;

    public Worker(String name, String surname, int priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }

    public double calculateSalary(int workedHours) {
        double salary = 0d;
        salary = this.priceHour * workedHours;

        return salary;
    }

}
