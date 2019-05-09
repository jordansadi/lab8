package us.jsadi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamsController {
    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getThanks() {
        return teamService.getAllTeams();
    }

    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeam(id);
    }

    // original POST method from example; never used in class
/*    @RequestMapping(method= RequestMethod.POST,
            value="/teams")
    public void addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
    }*/

    @RequestMapping(method= RequestMethod.GET, value="/teams")
    public List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Packers", "Green Bay"));
        return teams;
    }

    @RequestMapping(method= RequestMethod.POST, value="/teams")
    public List<Team> postTeams() {
        return teamService.getAllTeams();
    }
}