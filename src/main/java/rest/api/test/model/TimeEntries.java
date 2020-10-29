package rest.api.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rest.api.test.model.issue.Issue;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class TimeEntries {

    private Issue issue;
    private Project project;
    private Date spent_on;
    private int hours;
    private Long activity_id;
    private String comments;

}
