package Lesson1;

public class Team {
    private String teamName;
    private Person[] team;

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new Person[] {new Person("Tom", 28, 8, 17, 15),
                new Person("Anna", 19, 8, 20, 21),
                new Person("Kate", 23, 4, 21, 17),
                new Person("Denis", 31, 9, 22, 19)};
    }

    public String fullTeamInfo() {
        return "Team name is " + teamName + ", The participants: \n " +
                "1. " + team[0].fullPersonInfo() +
                "\n 2. " + team[1].fullPersonInfo() +
                "\n 3. " + team[2].fullPersonInfo() +
                "\n 4. " + team[3].fullPersonInfo();

    }

    Person[] getTeam() {
        return team;
    }

}
//