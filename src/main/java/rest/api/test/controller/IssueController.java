package rest.api.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rest.api.test.service.IssueService;

@Controller
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/issues/new")
    public String createIssue(){
        return "issue/newIssue";
    }

    @GetMapping("/issues")
    public String getIssues(Model model){
        model.addAttribute("issues", issueService.getIssues());
        return "issue/allIssues";
    }

}
