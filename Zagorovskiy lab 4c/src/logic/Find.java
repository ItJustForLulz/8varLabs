package logic;

import train.Coach;

/**
 * Created by graver_mc on 14.05.2018.
 */
public interface Find {
    void findByPassengerCount(Coach c[],int countStart, int countEnd);
}
