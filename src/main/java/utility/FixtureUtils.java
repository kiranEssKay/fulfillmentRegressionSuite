package utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Kiran SK on 10/3/16.
 */
public class FixtureUtils

{

    public static <T> List<T> getAsList(Class<T> cl,String path, Type listType) throws FileNotFoundException {
        //ClassLoader classLoader = FixtureUtils.class.getClassLoader();
        File file = new File(path); //fixtures/tax_test_list.json"


        JsonReader reader = new JsonReader(new FileReader(file));
        List<T> list =  new Gson().fromJson(reader, listType);
        return list;

    }
    public static Object getAsObject(Class cl,String path) throws FileNotFoundException {
        //ClassLoader classLoader = FixtureUtils.class.getClassLoader();
        File file = new File(path);

        JsonReader reader = new JsonReader(new FileReader(file));

        return new Gson().fromJson(reader, cl);

    }
   
    
}
