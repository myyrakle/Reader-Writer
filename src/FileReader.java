import java.io.FileWriter;

public class FileReader implements IReader
{
    FileReader reader;

    //파일에 대한 스트림을 열기 위한 생성자
    public FileReader(String filename)
    {
        reader = new FileReader(filename);
    }

    public String read()
    {
        String input = "";
        return input;
    }
}
