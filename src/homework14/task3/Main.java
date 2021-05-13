package homework14.task3;

//Create program which read all pairs of values (more then 5 pairs) from property file and print them in console in view of map.

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\xwogu\\IdeaProjects\\ss_homework\\src\\homework14\\task3\\test1.properties");
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(prop+"\n\n");
        for (String key : prop.stringPropertyNames()){
            System.out.println(key+"="+prop.getProperty(key));
        }
    }

}
