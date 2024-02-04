package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    private Properties getData(String fileName){
        ClassLoader classLoader=getClass().getClassLoader();
        File file=new File(classLoader.getResource(fileName+".properties").getFile());
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Properties prop=new Properties();

        try {
            prop.load(fileInputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return prop;

    }
    public String getProperty(String fileName,String key)
    {
        return  getData(fileName).getProperty(key);
    }
}
