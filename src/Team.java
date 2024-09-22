import java.util.ArrayList;
public class Team {
    private ArrayList<Person> teamMembers;


    public Team() {
        teamMembers = new ArrayList<Person>();
    }

    public void addTeamMember(Person prs) {
        teamMembers.add(prs);
    }
    public void ShowTeamMembers() {
        for(Person prs : teamMembers) {
            prs.show();
        }
    }

    public void removeTeamMember(int jerseyNumber) {
        for(int i = 0; i < teamMembers.size(); i++) {
            Person member = teamMembers.get(i);
            if (member.getJerseyNumber() == jerseyNumber) {
                teamMembers.remove(i);
                System.out.println("Team member removed");
            }
        }
    }
}
