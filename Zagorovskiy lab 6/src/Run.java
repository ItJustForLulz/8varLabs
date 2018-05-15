/**
 * Created by graver_mc on 13.05.2018.
 */
public class Run {

    public static void main(String[] args){
        CargoShip cs1 = new CargoShip("Титаник");
        cs1.stayInPort();
        cs1.breakEngine();
        cs1.repareEngine();
        cs1.ride();
        cs1.sink();
        System.out.println();

        Tanker t1 = new Tanker("Барсук");
        t1.stayInPort();
        t1.breakEngine();
        t1.repareEngine();
        t1.rideWithOil();
        t1.sink();
    }


}
