public class Car {
    private final String brand;
    private final String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = Math.max(speed, 0);
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Current speed: " + speed + " km/h");
    }

    public void accelerate(int increase) {
        if (increase > 0) {
            speed += increase;
            System.out.println("Accelerated by " + increase + " km/h.");
        } else {
            System.out.println("Acceleration value must be positive.");
        }
    }

    public void brake(int decrease) {
        if (decrease > 0) {
            speed = Math.max(0, speed - decrease);
            System.out.println("Braked by " + decrease + " km/h.");
        } else {
            System.out.println("Braking value must be positive.");
        }
    }
}
