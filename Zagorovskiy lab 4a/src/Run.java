/**
 * Created by graver_mc on 13.05.2018.
 */
public class Run {
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(5,0);
        Point p3 = new Point(5,5);
        Point p4 = new Point(0,5);

        LineSegment ln1 = new LineSegment(p1,p2);
        LineSegment ln2 = new LineSegment(p2,p3);
        LineSegment ln3 = new LineSegment(p3,p4);
        LineSegment ln4 = new LineSegment(p4,p1);

        Square sq = new Square(ln1,ln2,ln3,ln4);
        sq.setColor("Красный");
        System.out.println(sq.toString()+"\n");

        sq.stretchingByX(2);
        System.out.println(sq.toString()+"\n");

        sq.compressionByX(2);
        System.out.println(sq.toString()+"\n");

        sq.stretchingByY(2);
        System.out.println(sq.toString()+"\n");

        sq.compressionByY(2);
        System.out.println(sq.toString()+"\n");

        sq.setSize(10);
        System.out.println(sq.toString()+"\n");
    }
}
