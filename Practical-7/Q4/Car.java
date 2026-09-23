package Q4;

public class Car {

    int Car_number;
    String brand;
    String model;
    Engine engine;

    Car(int Car_number,String brand,String model){
         this.Car_number=Car_number;
         this.brand=brand;
         this.model=model;
         this.engine=new Engine(101,"petrol",150);
    }
    void StartCar(){
        System.out.println("Car is Started");
        engine.StatEngine();
    }
    void StopeCar(){
        System.out.println("Car is Stope");
        engine.StopeEngine();
    }
    void displayCarDetails(){

        System.out.println();
        System.out.println("Car NO "+Car_number);
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);

    }
    void displayEngineDetails(){

        System.out.println();
        engine.displayEngineDetails();
    }

}
