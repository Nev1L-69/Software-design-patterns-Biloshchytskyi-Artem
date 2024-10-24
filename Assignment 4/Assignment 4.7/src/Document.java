// Document.java
public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Create a memento (DocumentVersion) with the current content
    public DocumentVersion createVersion() {
        return new DocumentVersion(content);
    }

    // Restore the document content from a memento
    public void restoreVersion(DocumentVersion version) {
        content = version.getContent();
    }
}
