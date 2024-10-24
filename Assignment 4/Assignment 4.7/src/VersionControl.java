// VersionControl.java
import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versionHistory = new ArrayList<>();

    // Save a new version of the document
    public void saveVersion(DocumentVersion version) {
        versionHistory.add(version);
    }

    // Get a specific version of the document
    public DocumentVersion getVersion(int index) {
        if (index < 0 || index >= versionHistory.size()) {
            throw new IndexOutOfBoundsException("Invalid version index");
        }
        return versionHistory.get(index);
    }

    // List all saved versions
    public void listVersions() {
        for (int i = 0; i < versionHistory.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versionHistory.get(i).getContent());
        }
    }

    // Get the number of saved versions
    public int getVersionCount() {
        return versionHistory.size();
    }
}
