package MementoPattern_DocumentVersionControl;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentVersion> versions;

    public VersionControl() {
        this.versions = new ArrayList<>();
    }

    // Save a new version of the document
    public void saveVersion(DocumentVersion version) {
        versions.add(version);
        System.out.println("Version saved. Total versions: " + versions.size());
    }

    // List all saved versions
    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    // Restore a specific version by index
    public DocumentVersion getVersion(int index) {
        if (index < 0 || index >= versions.size()) {
            System.out.println("Invalid version index.");
            return null;
        }
        return versions.get(index);
    }
}
