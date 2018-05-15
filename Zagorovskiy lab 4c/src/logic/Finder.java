package logic;

import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Finder{

    public static void findByPassengerCount(Coach c[], int countStart,int countEnd){
        boolean flag = false;
        System.out.println("Вагоны, с количеством пассажиров в диапазоне от "+countStart+" до "+countEnd+":");
        for(int i=0;i<c.length;i++){
            if(c[i].getPassengerCount()>= countStart){
                if(c[i].getPassengerCount()<=countEnd){
                    flag= true;
                    System.out.println(c[i].toString());
                }
            }
        }
        if(!flag) {
            System.out.println("Ничего не найдено!");
        }
    }

}
