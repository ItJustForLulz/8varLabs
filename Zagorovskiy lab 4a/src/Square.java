/**
 * Created by graver_mc on 13.05.2018.
 */
public class Square {

    private LineSegment ln1;
    private LineSegment ln2;
    private LineSegment ln3;
    private LineSegment ln4;
    private String color;

    public Square(LineSegment ln1,LineSegment ln2,LineSegment ln3,LineSegment ln4){
        if(ln1.getEnd()==ln2.getStart()){
            if(ln2.getEnd()==ln3.getStart()){
                if(ln3.getEnd()==ln4.getStart()){
                    if(ln4.getEnd()==ln1.getStart()){
                        this.ln1 = ln1;
                        this.ln2 = ln2;
                        this.ln3 = ln3;
                        this.ln4 = ln4;
                    }
                }
            }
        }
    }

    public void setColor(String color){
        this.color=color;
        System.out.println("Цвет изменен!");
    }

    public void stretchingByX(int length){
        System.out.println("Растяжение по X на "+length+":");
        this.ln1.getEnd().setxCoordinate(this.ln1.getEnd().getxCoordinate()+length);
        this.ln3.getStart().setxCoordinate(this.ln3.getStart().getxCoordinate()+length);

    }

    public void compressionByX(int length){
        System.out.println("Сжатие по X на "+length+":");
        this.ln1.getEnd().setxCoordinate(this.ln1.getEnd().getxCoordinate()-length);
        this.ln3.getStart().setxCoordinate(this.ln3.getStart().getxCoordinate()-length);
    }

    public void stretchingByY(int length){
        System.out.println("Растяжение по Y на "+length+":");
        this.ln2.getEnd().setyCoordinate(this.ln2.getEnd().getyCoordinate()+length);
        this.ln4.getStart().setyCoordinate(this.ln4.getStart().getyCoordinate()+length);
    }

    public void compressionByY(int length){
        System.out.println("Сжатие по Y на "+length+":");
        this.ln2.getEnd().setyCoordinate(this.ln2.getEnd().getyCoordinate()-length);
        this.ln4.getStart().setyCoordinate(this.ln4.getStart().getyCoordinate()-length);
    }

    public void setSize(int length){
        System.out.println("Изменение размера на "+length+" :");
        if(this.ln1.getLength()<length){
            this.stretchingByX(length);
            this.stretchingByY(length);
        } else {
            this.compressionByX(length);
            this.compressionByY(length);
        }
    }

    @Override
    public String toString() {
        return color+" квадрат с ребрами: "+ln1.getLength()+" "+ln2.getLength()+" "+ln3.getLength()+" "+ln4.getLength();
    }
}
