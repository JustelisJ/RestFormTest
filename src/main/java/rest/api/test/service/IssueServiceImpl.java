package rest.api.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rest.api.test.model.issue.Issue;
import rest.api.test.model.issue.IssueData;

import java.util.Set;

@Service
public class IssueServiceImpl implements IssueService {

    private RestTemplate restTemplate;
    private final String url;

    public IssueServiceImpl(RestTemplate restTemplate, @Value("${redmine.url}") String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    @Override
    public IssueData getIssues(){
        IssueData issues = restTemplate.getForObject(url+"/issues.json", IssueData.class);
        return issues;
    }
}
