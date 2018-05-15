package logic;

import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class ComputingSums {

    public static int getPassengerCount(Coach c[]){
        int temp=0;
        for(Coach a:c){
            temp+=a.getPassengerCount();
        }
        return temp;
    }

    public static int getLuggageWeigth(Coach c[]){
        int temp=0;
        for(Coach a:c){
            temp+=a.getLuggageWeigth();
        }
        return temp;
    }
}
