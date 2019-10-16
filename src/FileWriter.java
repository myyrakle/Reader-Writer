//파일에 쓰는 클래스
import java.io.IOException;

public class FileWriter implements IWriter
{
    java.io.FileWriter writer;

    //파일에 대한 스트림을 열기 위한 생성자
    public FileWriter(String filename)
    {
        try
        {
            writer = new java.io.FileWriter(filename);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void write(String str)
    {
        //파일에 씀...
    }
}
