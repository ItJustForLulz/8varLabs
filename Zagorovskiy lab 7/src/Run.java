import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = input.nextLine();

        System.out.println("Введите два символа(начальный и конечный):");
        String tempStr = input.nextLine();
        char a = tempStr.charAt(0);
        char b = tempStr.charAt(2);

        System.out.println(Run.func(s,a,b));


    }

    public static String func(String s,char a,char b){
        String regex = "(["+a+"]+)(.*)(["+b+"]+)";
        String[] str = s.split(regex);
        s="";
        for(String temp:str){
            s+=temp;
        }
        return s;
    }

}
