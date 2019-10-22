//콘솔에 쓰게 해주는 클래스
public class ConsoleWriter implements IWriter
{
    public void write(String str)
    {
        System.out.println(str);
    }
}
