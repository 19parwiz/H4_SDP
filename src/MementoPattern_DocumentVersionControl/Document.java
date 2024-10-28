package MementoPattern_DocumentVersionControl;

public class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Create a new memento to store the current state
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    // Restore content from a given memento
    public void restore(DocumentVersion version) {
        this.content = version.getContent();
    }
}
