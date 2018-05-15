import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Run {

    public static void main(String[] args) throws IOException{

        FileInputStream inFile = new FileInputStream("Testfile.java");
        byte[] str = new byte[inFile.available()];
        inFile.read(str);

        String text = new String(str);
        String output = text.replaceAll("[\\s&&[^\r?\n]]+", " ").replaceAll("(\r\n)+", "\r\n").replaceAll("\n+", "\n");

        FileWriter writer = new FileWriter("outInfo.java");
        writer.write(output);
        writer.flush();
    }

}
