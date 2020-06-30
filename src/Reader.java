import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String read(String question) throws IOException {
        System.out.println(question);
        return reader.readLine();
    }

    public static void close() throws IOException{
        reader.close();
    }
}
