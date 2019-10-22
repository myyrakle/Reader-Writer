//파일에 쓰는 클래스
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter
{
    BufferedWriter writer;

    //파일에 대한 스트림을 열기 위한 생성자
    public MyFileWriter(String filename)
    {
        try
        {
            writer = new BufferedWriter(new FileWriter(filename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void write(String str)
    {
        try {
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
