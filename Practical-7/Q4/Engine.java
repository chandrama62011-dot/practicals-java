package Q4;

public class Engine {
    int engine_no;
    String engine_type;
    int horsePower;

    Engine(int engine_no,String engine_type,int housePower){
        this.engine_no=engine_no;
        this.engine_type=engine_type;
        this.horsePower=housePower;
    }
    void StatEngine(){
        System.out.println("Engine is start");
    }
    void StopeEngine(){
        System.out.println("Engine is stop");
    }
    void displayEngineDetails(){
        System.out.println("Engine NO "+engine_no);
        System.out.println("Engine Type "+engine_type);
        System.out.println("House Power "+horsePower);
    }
}
