/**
 * Created by graver_mc on 13.05.2018.
 */
public class Tanker extends CargoShip {

    public Tanker(String name, boolean isEngineBroken, boolean state, boolean isSinking) {
        super(name, isEngineBroken, state, isSinking);
        this.setName("Танкер "+name);
    }

    public Tanker(String name) {
        this.setName("Танкер "+name);
    }

    public Tanker() {
    }

    public void rideWithOil(){ //плыть с жидкостью на борту
        System.out.println(this.getName()+" плывет в нефтью на борту!");
    }

}
