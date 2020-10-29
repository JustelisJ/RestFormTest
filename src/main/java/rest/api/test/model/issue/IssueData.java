package rest.api.test.model.issue;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class IssueData {

    private Set<Issue> issues;
    private int total_count;
    private int offset;
    private int limit;

}
