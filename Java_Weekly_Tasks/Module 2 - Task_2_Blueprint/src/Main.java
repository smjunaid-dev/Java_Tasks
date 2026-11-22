public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner", 40);
        Car car2 = new Car("Hyundai", "Creta", 25);

        System.out.println("===== CAR 1 =====");
        car1.displayDetails();

        car1.accelerate(30);
        car1.displayDetails();

        car1.brake(20);
        car1.displayDetails();

        System.out.println("\n===== CAR 2 =====");
        car2.displayDetails();

        car2.accelerate(15);
        car2.brake(50);
        car2.displayDetails();
    }
}
