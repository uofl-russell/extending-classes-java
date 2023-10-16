public class Motorcycle extends Vehicle{
    private int chainMaintMonth;
    private int chainMaintDay;
    private int chainMaintYear;
    private int chainMaintOdometer;

    Motorcycle(String VIN, int yearModel) {
        super(VIN, yearModel);
    }

    public void updateChainMaint(int month, int day, int year, int odometer) {
        this.chainMaintMonth = month;
        this.chainMaintDay = day;
        this.chainMaintYear = year;
        this.chainMaintOdometer = odometer;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Last Date of Chain Maintenance : " +
                this.chainMaintMonth + "/" + this.chainMaintDay + "/" + this.chainMaintYear
        );
        System.out.println("Odometer Reading At Last Chain Maintenance : " + this.chainMaintOdometer);
    }
}


