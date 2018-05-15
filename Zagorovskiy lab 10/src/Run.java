/**
 * Created by graver_mc on 14.05.2018.
 */
public class Run {

    public static void main(String[] args){
        Set s = new Set();
        s.add(4);
        s.add(3);
        s.add(8);
        s.add(13);

        Set s2 = new Set();
        s2.add(7);
        s2.add(13);
        s2.add(8);
        s2.add(1);

        System.out.println(s.toString());
        System.out.println(s2.toString());

        s.addToPosition(2,5);
        System.out.println(s.toString());

        s.add(18);
        System.out.println(s.toString());

        s.remove();
        System.out.println(s.toString());

        s.removeFromPosition(2);
        System.out.println(s.toString());

        System.out.println("Пересечение множеств: "+s.intersection(s2).toString());

        System.out.println("Объединение множеств: "+s.association(s2).toString());
    }

}
