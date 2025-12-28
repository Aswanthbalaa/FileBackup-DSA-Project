import java.util.HashMap;
import java.util.HashSet;

public class BackupIndex {

    private static HashMap<String, Long> index = new HashMap<>();
    private static HashSet<String> uniquePaths = new HashSet<>();

    public static void store(String path) {

        if (!uniquePaths.contains(path)) {
            uniquePaths.add(path);
            index.put(path, System.currentTimeMillis());
        }
    }

    public static void displayIndex() {

        if (index.isEmpty()) {
            System.out.println("Backup index is empty.");
            return;
        }

        System.out.println("Backup Index:");
        for (String key : index.keySet()) {
            System.out.println(key + " -> " + index.get(key));
        }
    }
}
