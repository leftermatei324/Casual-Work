package Test.exercise5;

import java.util.Objects;

public class Player implements Comparable<Player>{
    private String name;
    private String team;
    private int goals;
    private int assists;
    private int matches;

    public Player(String name, String team, int goals, int assists, int matches){
        this.name = name;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.goals,o.goals);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", goals=" + goals +
                ", assists=" + assists +
                ", matches=" + matches +
                '}';
    }
}
