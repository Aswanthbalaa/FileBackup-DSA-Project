import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DirectoryScanner {

    public static void copyDirectory(File source, File destination) throws IOException {

        if (!destination.exists()) {
            destination.mkdirs();
        }

        File[] files = source.listFiles();

        if (files == null) return;

        for (File file : files) {

            File newDestination = new File(destination, file.getName());

            if (file.isDirectory()) {
                copyDirectory(file, newDestination);
            } else {
                Files.copy(file.toPath(),
                        newDestination.toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }
}
