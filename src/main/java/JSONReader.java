
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JSONReader {

    public static List<String> getJSONFromFile(String filename) {
        List<String> jsonTexts = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                 jsonTexts.add(line);


            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
         return jsonTexts;
    }
}
