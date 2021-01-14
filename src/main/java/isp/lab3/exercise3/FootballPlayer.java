package isp.lab3.exercise3;

public class FootballPlayer {
    private String name;
    private String team;
    private int goalsScored;
    private char gender;

    public FootballPlayer(String name, String team, char gender) {
        this.name = name;
        this.team = team;
        this.gender = gender;
        goalsScored = 0;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ")" + " scored " + goalsScored + " goals at " + team;
    }
}
