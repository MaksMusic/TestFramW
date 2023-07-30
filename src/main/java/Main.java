import files.FilesImpl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            FilesImpl.copyFile(Paths.get(""),Paths.get("wef"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
