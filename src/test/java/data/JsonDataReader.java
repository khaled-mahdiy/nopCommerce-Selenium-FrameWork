package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    String gender , firstName , lastName , email ,companyName,password;

    public JSONArray jsonReader (String fileName) throws IOException, ParseException {
        //file path will read from it

        String filePath = System.getProperty("user.dir")+"/src/test/java/data/"+fileName;

        //file object to pass the path to it
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();

        //parsing the json array
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(srcFile));

        return jsonArray;
    }
}
