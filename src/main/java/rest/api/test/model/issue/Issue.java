package rest.api.test.model.issue;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rest.api.test.model.Project;
import rest.api.test.model.Tracker;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Issue {

    private Project project;
    private Tracker tracker;
    private Long status_id;
    private Long priority_id;
    private String subject;
    private String description;
    private Long category_id;
    private Long fixed_version_id;
    private Long assigned_to_id;
    private Long parent_issue_id;
    private Set<Long> custom_fields = new HashSet<>();
    private Set<Long> watcher_user_ids = new HashSet<>();
    private boolean is_private;
    private int estimated_hours;

}
