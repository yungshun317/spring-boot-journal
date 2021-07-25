package yungshun.chang.springbootjournal.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JournalEntry {

    private Long id;
    private String title;
    private Date created;
    private String summary;
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public JournalEntry(String title, String summary, String date) throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = format.parse(date);
    }

    JournalEntry() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated() {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary() {
        this.summary = summary;
    }
}
