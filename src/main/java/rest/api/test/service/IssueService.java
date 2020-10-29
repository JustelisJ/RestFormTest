package rest.api.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import rest.api.test.model.issue.IssueData;

public interface IssueService {

    IssueData getIssues();

}
