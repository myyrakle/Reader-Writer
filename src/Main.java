//사용례
public class Main
{
    static void main(String[] args)
    {
        IReader reader;
        reader = new FileReader("boom.txt");
        String text = reader.read();

        IWriter writer;
        writer = new ConsoleWriter();
        writer.write(text);
    }
}
