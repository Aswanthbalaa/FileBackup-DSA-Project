public class SettingsManager {

    private static String backupType = "FULL";
    private static boolean overwrite = true;

    public static void displaySettings() {

        System.out.println("Backup Settings:");
        System.out.println("Backup Type: " + backupType);
        System.out.println("Overwrite Existing Files: " + overwrite);
    }
}
