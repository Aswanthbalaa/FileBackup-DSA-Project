import java.util.Stack;

public class BackupVersionStack {

    private static Stack<String> backupHistory = new Stack<>();

    public static void addVersion(String path) {
        backupHistory.push(path);
    }

    public static void showHistory() {

        if (backupHistory.isEmpty()) {
            System.out.println("No backup history available.");
            return;
        }

        System.out.println("Backup History:");
        for (int i = backupHistory.size() - 1; i >= 0; i--) {
            System.out.println("- " + backupHistory.get(i));
        }
    }
}
