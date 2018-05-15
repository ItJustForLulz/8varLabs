import java.io.IOException;

/**
 * Created by graver_mc on 13.05.2018.
 */
public class Square {

    private LineSegment ln1;
    private LineSegment ln2;
    private LineSegment ln3;
    private LineSegment ln4;
    private String color;

    public Square(LineSegment ln1,LineSegment ln2,LineSegment ln3,LineSegment ln4) throws OutOfMemoryError{ //нехватка памяти
        try {
            if (ln1.getEnd() == ln2.getStart()) {
                if (ln2.getEnd() == ln3.getStart()) {
                    if (ln3.getEnd() == ln4.getStart()) {
                        if (ln4.getEnd() == ln1.getStart()) {
                            this.ln1 = ln1;
                            this.ln2 = ln2;
                            this.ln3 = ln3;
                            this.ln4 = ln4;
                        }
                    }
                }
            }
        } catch (OutOfMemoryError e){
            System.out.println(e.getMessage());
        }
    }

    public void setColor(String color) throws IOException{
        assert (color.length()<=0): "Неверные данные!"; //неверное значение поля
        this.color=color;
        Writer.printInfo("Цвет изменен!");
    }

    public void stretchingByX(int length) throws IOException{
        Writer.printInfo("Растяжение по X на "+length+":");
        this.ln1.getEnd().setxCoordinate(this.ln1.getEnd().getxCoordinate()+length);
        this.ln3.getStart().setxCoordinate(this.ln3.getStart().getxCoordinate()+length);

    }

    public void compressionByX(int length) throws IOException{
        Writer.printInfo("Сжатие по X на "+length+":");
        this.ln1.getEnd().setxCoordinate(this.ln1.getEnd().getxCoordinate()-length);
        this.ln3.getStart().setxCoordinate(this.ln3.getStart().getxCoordinate()-length);
    }

    public void stretchingByY(int length) throws IOException{
        Writer.printInfo("Растяжение по Y на "+length+":");
        this.ln2.getEnd().setyCoordinate(this.ln2.getEnd().getyCoordinate()+length);
        this.ln4.getStart().setyCoordinate(this.ln4.getStart().getyCoordinate()+length);
    }

    public void compressionByY(int length) throws IOException{
        Writer.printInfo("Сжатие по Y на "+length+":");
        this.ln2.getEnd().setyCoordinate(this.ln2.getEnd().getyCoordinate()-length);
        this.ln4.getStart().setyCoordinate(this.ln4.getStart().getyCoordinate()-length);
    }

    public void setSize(int length) throws IOException{
        Writer.printInfo("Изменение размера на "+length+" :");
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
