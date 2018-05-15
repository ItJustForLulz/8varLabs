package sort;

import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class SortBy {

    public static void SortByComfortDegree(Coach c[]){
        for(int i = c.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( c[j].getComfortDegree() < c[j+1].getComfortDegree()){
                    Coach temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
    }

}
