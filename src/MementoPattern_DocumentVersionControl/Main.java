package MementoPattern_DocumentVersionControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nDocument Version Control System");
            System.out.println("1. Edit Document Content");
            System.out.println("2. Save Version");
            System.out.println("3. List Versions");
            System.out.println("4. Restore Version");
            System.out.println("5. Display Current Document Content");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter new content: ");
                    String content = scanner.nextLine();
                    document.setContent(content);
                    System.out.println("Document content updated.");
                    break;

                case 2:
                    versionControl.saveVersion(document.save());
                    break;

                case 3:
                    versionControl.listVersions();
                    break;

                case 4:
                    System.out.print("Enter version number to restore: ");
                    int versionNumber = scanner.nextInt() - 1;
                    DocumentVersion version = versionControl.getVersion(versionNumber);
                    if (version != null) {
                        document.restore(version);
                        System.out.println("Document restored to version " + (versionNumber + 1));
                    }
                    break;

                case 5:
                    System.out.println("Current Document Content: " + document.getContent());
                    break;

                case 0:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }
}
