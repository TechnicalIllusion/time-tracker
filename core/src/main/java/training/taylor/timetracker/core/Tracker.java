package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(Final TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(Final TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(Final int index) {
        return entries.get(index);
    }
}
