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
}
