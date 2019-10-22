import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class MyFileReader implements IReader
{
    BufferedReader reader;

    //파일에 대한 스트림을 열기 위한 생성자
    public MyFileReader(String filename)
    {
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String read()
    {
        String input = "";

        try {
            input = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
