import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        String text;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        text = in.nextLine();


        try (
                FileOutputStream stream = new FileOutputStream("file.txt");
                OutputStreamWriter writer = new OutputStreamWriter(stream, StandardCharsets.UTF_8);
        ) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}