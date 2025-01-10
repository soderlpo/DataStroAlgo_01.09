public class Main {
    public static void main(String[] args) {

        Car car = new Car("toyota");
        Bike bike = new Bike("Scott");

        System.out.println(car.getName() + " is " + car.getPropulsion());
        System.out.println(bike.getName() + " is " + bike.getPropulsion());



    }
}
