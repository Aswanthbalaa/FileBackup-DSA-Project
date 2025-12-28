import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileManager {

    public static void backup(String sourcePath, String destinationPath) {

        try {
            File source = new File(sourcePath);
            File destination = new File(destinationPath);

            if (!source.exists()) {
                System.out.println("Source path does not exist!");
                return;
            }

            if (!destination.exists()) {
                destination.mkdirs();
            }

            if (source.isDirectory()) {
                DirectoryScanner.copyDirectory(source, destination);
            } else {
                Files.copy(source.toPath(),
                        new File(destination, source.getName()).toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
            }

            BackupVersionStack.addVersion(sourcePath);
            BackupIndex.store(sourcePath);

            System.out.println("Backup completed successfully!");

        } catch (IOException e) {
            System.out.println("Error during backup: " + e.getMessage());
        }
    }
}
