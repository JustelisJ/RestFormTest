package rest.api.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Project {

    private Long id;
    private String name;
    private String identifier;
    private String description;
    private int status;
    private boolean is_public;
    private Long parent_id;
    private boolean inherit_members;
    private Set<Long> tracker_ids = new HashSet<>();
    private Set<Long> issue_custom_field_ids = new HashSet<>();
    private Date created_on;
    private Date updated_on;

}
