package jsonreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JSONReader {

    public List<String> getJSONsFromFile(String filename) {
        List<String> jsonList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                 jsonList.add(line);


            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
         return jsonList;
    }
}
