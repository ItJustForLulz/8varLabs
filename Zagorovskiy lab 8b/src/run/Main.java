package run;

import exceptions.NoObjectFoundException;
import filework.Writer;
import logic.ComputingSums;
import logic.Finder;
import sort.SortBy;
import train.Coach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Coach c[] = new Coach[5];

        FileOutputStream fO = new FileOutputStream("temp");
        ObjectOutputStream oO = new ObjectOutputStream(fO);
        oO.writeObject(new Coach(150,7859,4));
        oO.close();

        FileInputStream fI = new FileInputStream("temp");
        ObjectInputStream oI = new ObjectInputStream(fI);
        c[0] = (Coach) oI.readObject();
        if(c[0].getComfortDegree()==0) { throw new NoObjectFoundException("Объект не найден!"); } //работа с потоком ввода
        oI.close();

        c[1]= new Coach(101,5703,3);
        c[2]= new Coach(79,4890,1);
        c[3]= new Coach(93,5208,5);
        c[4]= new Coach(213,11928,2);

        Coach.print(c);

        Writer.printInfo("Общая численность пассажиров поезда: "+ ComputingSums.getPassengerCount(c));
        Writer.printInfo("Общий вес багажа пассажиров поезда: "+ComputingSums.getLuggageWeigth(c)+" кг.");

        Writer.printInfo("Сортировка относительно уровня комфортности вагонов:");
        SortBy.SortByComfortDegree(c);
        Coach.print(c);

        Finder.findByPassengerCount(c,99,170);

    }

}
