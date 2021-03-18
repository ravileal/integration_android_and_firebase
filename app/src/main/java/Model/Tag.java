package Model;

public class Tag extends Model {

    private String tagName;
    private String journalCount;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getJournalCount() {
        return journalCount;
    }

    public void setJournalCount(String journalCount) {
        this.journalCount = journalCount;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagName='" + tagName + '\'' +
                ", journalCount=" + journalCount +
                ", id='" + id + '\'' +
                '}';
    }
}