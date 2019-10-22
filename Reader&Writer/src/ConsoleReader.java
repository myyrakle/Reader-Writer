import java.util.Scanner;

//콘솔로부터 읽어오는 클래스
public class ConsoleReader implements IReader
{
    public String read()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
