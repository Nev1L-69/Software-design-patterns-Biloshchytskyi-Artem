public class SupportTicket {
    private String issueType;
    private int complexity;

    public SupportTicket(String issueType, int complexity) {
        this.issueType = issueType;
        this.complexity = complexity;
    }

    public String getIssueType() {
        return issueType;
    }

    public int getComplexity() {
        return complexity;
    }
}
