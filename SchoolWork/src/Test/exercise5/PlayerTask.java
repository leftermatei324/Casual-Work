package Test.exercise5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class PlayerTask implements Runnable{
    private List<Player> players;
    private int type;

    public PlayerTask(List<Player> players, int type){
        this.players = players;
        this.type = type;
    }


    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true))){
            for (Player p : players){
                if (type == 1 && p.getGoals() > 20){
                    bw.write("High goals: " + p);
                    bw.newLine();
                }

                if (type == 2 && p.getAssists() >  10){
                    bw.write("High assists: " + p);
                    bw.newLine();
                }

                if (type == 3 && p.getMatches() > 18){
                    bw.write("Many matches: " + p);
                    bw.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
