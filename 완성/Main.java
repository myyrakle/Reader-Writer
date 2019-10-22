//사용례
public class Main
{
    public static void main(String[] args)
    {
        IReader reader;
        reader = new MyFileReader("boom.txt");
        String text = reader.read();

        IWriter writer;
        writer = new ConsoleWriter();
        writer.write(text);
    }
}
