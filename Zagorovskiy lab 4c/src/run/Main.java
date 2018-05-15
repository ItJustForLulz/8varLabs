package run;

import logic.ComputingSums;
import logic.Finder;
import sort.SortBy;
import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Main {

    public static void main(String[] args){
        Coach c[] = new Coach[5];
        c[0]= new Coach(150,7859,4);
        c[1]= new Coach(101,5703,3);
        c[2]= new Coach(79,4890,1);
        c[3]= new Coach(93,5208,5);
        c[4]= new Coach(213,11928,2);

        Coach.print(c);

        System.out.println("Общая численность пассажиров поезда: "+ ComputingSums.getPassengerCount(c));
        System.out.println("Общий вес багажа пассажиров поезда: "+ComputingSums.getLuggageWeigth(c)+" кг.");

        System.out.println("Сортировка относительно уровня комфортности вагонов:");
        SortBy.SortByComfortDegree(c);
        Coach.print(c);

        Finder.findByPassengerCount(c,99,170);

    }

}
