
public class Main {
    public static void main(String[] args) {
//        Vehicle Car = new Vehicle("QWERTY77YTREWQ", 2021);
//        Car.updateMaint(10, 11, 2023, 78654);
//        Car.printInfo();

        Motorcycle Suzuki = new Motorcycle("MHYTJ986YT", 2022);
        Suzuki.updateMaint(9, 23, 2023, 17587);
        Suzuki.updateChainMaint(6,19,2023, 14345);
        Suzuki.printInfo();
    }
}