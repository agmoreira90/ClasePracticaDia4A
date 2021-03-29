package domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static java.lang.Class.*;

public class MiFactory {
    public static Sorter getInstance(String objName) {
        Properties properties = new Properties();
        Sorter obj = null;

        try {
            properties.load(new FileInputStream(new File("MiFactory.properties")));
            System.out.println("Metodo: " + properties.get(objName).toString());
             obj = (Sorter) Class.forName(properties.get(objName).toString()).newInstance();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
