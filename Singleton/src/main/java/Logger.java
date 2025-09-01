import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Logger {
    private static Logger instance;
    private BufferedWriter bufferedWriter;
    private Logger(){
        try{
            bufferedWriter = new BufferedWriter(new FileWriter("log.txt", true)); //append=true so it doesn't remake the file every time
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Logger getInstance(){

        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void write(String message){
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try{
            if(bufferedWriter != null){
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void setFileName(String fileName){
        this.close();
        try{

            bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));


        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
