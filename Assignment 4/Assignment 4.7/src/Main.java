// Main.java
public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        // Edit the document and save different versions
        document.setContent("Version 1: Initial content");
        versionControl.saveVersion(document.createVersion());

        document.setContent("Version 2: Added more content");
        versionControl.saveVersion(document.createVersion());

        document.setContent("Version 3: Corrected some errors");
        versionControl.saveVersion(document.createVersion());

        // List all saved versions
        System.out.println("Listing all versions:");
        versionControl.listVersions();

        // Restore a specific version
        System.out.println("\nRestoring to version 2:");
        document.restoreVersion(versionControl.getVersion(1)); // Restore to the second version (index 1)
        System.out.println("Current content: " + document.getContent());

        // Restore to the first version
        System.out.println("\nRestoring to version 1:");
        document.restoreVersion(versionControl.getVersion(0)); // Restore to the first version (index 0)
        System.out.println("Current content: " + document.getContent());
    }
}
