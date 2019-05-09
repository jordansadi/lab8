package us.jsadi;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeamService {
    private List<Team> teams = new ArrayList<>(
            Arrays.asList(
                    new Team("Birds of Prey", "Gotham"),
                    new Team("Justice League", "Washington DC"),
                    new Team("Teen Titans", "Jump City")
            ));

    public List<Team> getAllTeams() {
        return teams;
    }

    public Team getTeam(String id) {
        return teams.stream()
                .filter(t -> t.getTeam().contains(id))
                .findFirst().get();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
}