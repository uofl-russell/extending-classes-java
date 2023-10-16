public class Vehicle {
    private final String VIN;
    private final int yearModel;
    private int lastMaintMonth;
    private int lastMaintDay;
    private int lastMaintYear;
    private int lastMaintOdometer;

    Vehicle(String VIN, int yearModel) {
        this.VIN = VIN;
        this.yearModel = yearModel;
    }

    public void updateMaint(int month, int day, int year, int odometer) {
        this.lastMaintMonth = month;
        this.lastMaintDay = day;
        this.lastMaintYear = year;
        this.lastMaintOdometer = odometer;
    }

    public void printInfo() {
        System.out.println("VIN: " + this.VIN);
        System.out.println("Year Model: " + this.yearModel);
        System.out.println("Last Date of Maintenance : " +
            this.lastMaintMonth + "/" + this.lastMaintDay + "/" + this.lastMaintYear
        );
        System.out.println("Odometer Reading At Last Maintenance : " + this.lastMaintOdometer);
    }
}
