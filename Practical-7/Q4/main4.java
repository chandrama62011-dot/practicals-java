package Q4;

public class main4 {
    static void main() {
        Car c1=new Car(101,"Toyota","fortuner");
        Car c2=new Car(102,"BMW","X5");

        System.out.println("==========================");
        System.out.println("       Car 1 Details");
        System.out.println("==========================");
        c1.displayCarDetails();
        c1.displayEngineDetails();
        c1.StartCar();
        c1.StopeCar();
        System.out.println();
        System.out.println("==========================");
        System.out.println("       Car 2 Details");
        System.out.println("==========================");
        c2.displayCarDetails();
        c2.displayEngineDetails();
        c2.StartCar();
        c2.StopeCar();
    }
}
