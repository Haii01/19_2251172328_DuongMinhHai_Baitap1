public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Car
        Car myCar = new Car("Toyota", 180);
        myCar.displayInfo();
        myCar.honk();

        System.out.println(); // Dòng trống

        // Tạo đối tượng Motorbike
        Motorbike myBike = new Motorbike("Yamaha", 150);
        myBike.displayInfo();
        myBike.revEngine();
    }
}
