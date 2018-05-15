/**
 * Created by graver_mc on 13.05.2018.
 */
public class Point {

    private ComplexNumber coordinate;

    public Point(ComplexNumber coordinate) {
        this.coordinate = coordinate;
    }

    public ComplexNumber getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(ComplexNumber coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Точка с координатами: ( "+coordinate.getRealPart()+" , "+coordinate.getImaginaryPart()+" )\n";
    }
}
