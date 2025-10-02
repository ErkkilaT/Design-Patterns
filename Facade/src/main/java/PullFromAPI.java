import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PullFromAPI {
    //use Dot notation for attributeName if it has a path
    public static String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException, ParseException {
        URL url = new URL(urlString);
        String input;
        try{
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            try(BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))){
                String inputLine;
                StringBuilder content = new StringBuilder();
                while((inputLine=in.readLine()) != null){
                    content.append(inputLine);
                }
                input = content.toString();
            }finally{
                con.disconnect();;
            }
        }catch(IOException e){
            throw new IOException("Error connecting to url " + urlString, e);
        }



        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(input);
        String[] path = attributeName.split("\\.");
        Object current = jsonObject;
        for(String part :path){
            current = ((JSONObject) current).get(part);
        }
        if(current == null){
            throw new IllegalArgumentException("Error attribute name or path is incorrect");
        }
        return current.toString();

    }


    public static void main(String[] args) {

        try{
            String joke = getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(joke);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            String eurRate = getAttributeValueFromJson("https://api.fxratesapi.com/latest", "rates.EUR");
            System.out.println(eurRate);
        }catch(Exception e){
            e.printStackTrace();
        }


    }


}
