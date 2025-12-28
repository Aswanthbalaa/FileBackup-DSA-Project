import java.util.Scanner;

public class BackupMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== FILE BACKUP TOOL ===");

        System.out.print("Enter source path: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter backup destination path: ");
        String destinationPath = sc.nextLine();

        while (true) {
            System.out.println("\n1. Backup Files");
            System.out.println("2. View Backup History");
            System.out.println("3. View Backup Index");
            System.out.println("4. View Settings");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    FileManager.backup(sourcePath, destinationPath);
                    break;

                case 2:
                    BackupVersionStack.showHistory();
                    break;

                case 3:
                    BackupIndex.displayIndex();
                    break;

                case 4:
                    SettingsManager.displaySettings();
                    break;

                case 5:
                    System.out.println("Exiting Backup Tool...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

