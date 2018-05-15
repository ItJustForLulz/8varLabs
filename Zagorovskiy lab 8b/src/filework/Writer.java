package filework;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by graver_mc on 03.05.2018.
 */
public class Writer {

    private static Writer instance = new Writer();
    private static FileWriter writer;

    private Writer() {
        try {
            writer = new FileWriter("outInfo.txt", false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Writer getInstance(){
        return instance;
    }

    public static void printInfo(String info) throws IOException { //file not found exception
        try{
            writer.write(info);
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
