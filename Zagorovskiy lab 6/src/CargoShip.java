/**
 * Created by graver_mc on 13.05.2018.
 */
public class CargoShip implements Ship {

    private String name;
    private boolean isEngineBroken = false;
    private boolean isSinking = false; //тонет ли
    private boolean state = false; //если false - корабль стоит в порту и не плывет;

    public CargoShip(String name,boolean isEngineBroken, boolean state, boolean isSinking) {
        this.name=name;
        this.isEngineBroken = isEngineBroken;
        this.isSinking = isSinking;
        this.state = state;
    }

    public CargoShip(String name){
        this.name=name;
        this.isEngineBroken = false;
        this.isSinking = false;
        this.state = false;
    }

    public  CargoShip(){
        this.name=null;
        this.isEngineBroken = false;
        this.isSinking = false;
        this.state = false;
    }

    public void ride(){
        this.state = true;
        System.out.println(name+" плывет!");
    }

    public void sink(){
        this.isSinking=true;
        System.out.println(name+" тонет!");
    }

    public void stayInPort(){
        this.state=false;
        System.out.println(name+" стоит в порту!");
    }

    public void breakEngine(){
        this.isEngineBroken = true;
        System.out.println("У "+name+" сломался двигатель!");
    }

    public void repareEngine(){
        this.isEngineBroken = false;
        System.out.println(name+" починили двигатель!");
    }

    public void checkStatus(){
        if(!state) { this.stayInPort(); }
        else if(!isEngineBroken) { this.breakEngine(); }
        else if(!isSinking) { this.sink(); }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
