public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        Motorbike motorbike = new Motorbike("Yamaha", 150);

        System.out.println("Car Information:");
        car.displayInfo();
        car.honk();

        System.out.println("\nMotorbike Information:");
        motorbike.displayInfo();
        motorbike.revEngine();
    }
}
