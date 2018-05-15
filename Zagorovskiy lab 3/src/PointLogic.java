/**
 * Created by graver_mc on 13.05.2018.
 */
public class PointLogic {

    public static double findDistanceBetweenPoints(Point a,Point b){
        double x = Double.parseDouble(String.valueOf(b.getCoordinate().getRealPart()-a.getCoordinate().getRealPart()));
        double y = Double.parseDouble(String.valueOf(b.getCoordinate().getImaginaryPart()-a.getCoordinate().getImaginaryPart()));
        return Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
    }

    public static double findDistanceToNull(Point a){
        double x = Double.parseDouble(String.valueOf(a.getCoordinate().getRealPart()));
        double y = Double.parseDouble(String.valueOf(a.getCoordinate().getImaginaryPart()));
        return Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
    }

}
