package train;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Coach {

    private int passengerCount;
    private int luggageWeigth;
    private int comfortDegree;

    public Coach(int passengerCount, int luggageWeigth, int comfortDegree) {
        this.passengerCount = passengerCount;
        this.luggageWeigth = luggageWeigth;
        this.comfortDegree = comfortDegree;
    }

    public static void print(Coach c[]){
        System.out.println("Поезд:");
        for(Coach a:c){
            System.out.println(a.toString());
        }
        System.out.println();
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getLuggageWeigth() {
        return luggageWeigth;
    }

    public void setLuggageWeigth(int luggageWeigth) {
        this.luggageWeigth = luggageWeigth;
    }

    public int getComfortDegree() {
        return comfortDegree;
    }

    public void setComfortDegree(int comfortDegree) {
        this.comfortDegree = comfortDegree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coach coach = (Coach) o;

        if (passengerCount != coach.passengerCount) return false;
        if (luggageWeigth != coach.luggageWeigth) return false;
        return comfortDegree == coach.comfortDegree;
    }

    @Override
    public int hashCode() {
        int result = passengerCount;
        result = 31 * result + luggageWeigth;
        result = 31 * result + comfortDegree;
        return result;
    }

    @Override
    public String toString() {
        return "Вагон "+comfortDegree+"-го уровня комфортности, в котором "+passengerCount+" пассажиров и "+luggageWeigth+" кг багажа";
    }
}
