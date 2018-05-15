package logic;

import exceptions.ArrayLengthException;
import filework.Writer;
import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Finder{

    public static void findByPassengerCount(Coach c[], int countStart,int countEnd) throws Exception{
        boolean flag = false;
        if(c.length<=0) { throw new ArrayLengthException("Пустой массив обьектов!"); } //проверка пустой ли массив(собственное исключение)
        Writer.printInfo("Вагоны, с количеством пассажиров в диапазоне от " + countStart + " до " + countEnd + ":");
        for(int i=0;i<c.length;i++){
            if(c[i].getPassengerCount()>= countStart){
                if(c[i].getPassengerCount()<=countEnd){
                    flag= true;
                    Writer.printInfo(c[i].toString());
                }
            }
        }
        if(!flag) {
            Writer.printInfo("Ничего не найдено!");
        }
    }

}
