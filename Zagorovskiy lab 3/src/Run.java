/**
 * Created by graver_mc on 13.05.2018.
 */
public class Run {

    public static void main(String[] args){
        //3a
        System.out.println("3a:\n");
        Car[] c = new Car[5];
        c[0] = new Car(10,"BMW","X5",2006,"Black",180000,"a1085ht");
        c[1] = new Car(8,"Mercedes","C300",2011,"White",240000,"b9732ht");
        c[2] = new Car(9,"Audi","A8",2006,"Black",110000,"h9820av");
        c[3] = new Car(3,"BMW","X5",2003,"Red",95000,"t8912hj");
        c[4] = new Car(7,"Mazda","CX3",2016,"Blue",390000,"k9165lj");

        CarLogic.printCars(c);
        CarLogic.printCarsByBrand(c,"BMW");
        CarLogic.printCarsByModelAndYear(c,"X5",3);
        CarLogic.printCarsByPriceAndYear(c,100000,5);
        //3a

        //3c
        System.out.println("3c:\n");
        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(7,5);
        Point p1 = new Point(c1);
        Point p2 = new Point(c2);
        System.out.println("1): "+p1.toString());
        System.out.println("2): "+p2.toString());

        System.out.println("Расстояние между точками 1 и 2: "+PointLogic.findDistanceBetweenPoints(p1,p2));
        System.out.println("Расстояние от первой точки до начала координат:"+PointLogic.findDistanceToNull(p1));
        System.out.println("Расстояние от второй точки до начала координат:"+PointLogic.findDistanceToNull(p2));
        //3c
    }



}
