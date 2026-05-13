package Test.exercise5;

import Test.exercise3.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ex5Main {
    public static void main(String[] args) {

        List<Player> readPlayes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("players.txt"))){
            String lines;
            while ((lines = br.readLine())!= null){
                String[] parts = lines.split(",");

                String name = parts[0];
                String team = parts[1];
                int goals = Integer.parseInt(parts[2]);
                int assists = Integer.parseInt(parts[3]);
                int matches = Integer.parseInt(parts[4]);

                readPlayes.add(new Player(name,team,goals,assists,matches));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(readPlayes);

        Collections.sort(readPlayes);

        for (int i = 0; i < readPlayes.size(); i++){
            if (readPlayes.get(i).getGoals() < 15){
                readPlayes.remove(i);
                i--;
            }
        }

        Map<String, List<Player>> map = new HashMap<>();
        for (Player p : readPlayes){
            String teamn = p.getTeam();

            if (!map.containsKey(teamn)){
                map.put(teamn, new ArrayList<>());
            }
            map.get(teamn).add(p);
        }

        int sum = 0;
        for (Player p : readPlayes){
            sum = sum + p.getGoals();
        }

        double avg = (double) sum / readPlayes.size();
        System.out.println("Average goals: " + avg);

        int totalAssists = 0;
        for (Player p : readPlayes){
            totalAssists = totalAssists + p.getAssists();
        }
        System.out.println("Total assists: " + totalAssists);

        Player max = readPlayes.get(0);
        for (Player p : readPlayes){
            if (p.getMatches() > max.getMatches()){
                max = p;
            }
        }
        System.out.println("Max matches: " + max);

        Thread t1 = new Thread(new PlayerTask(readPlayes, 1));
        Thread t2 = new Thread(new PlayerTask(readPlayes, 2));
        Thread t3 = new Thread(new PlayerTask(readPlayes, 3));

        t1.start();
        t2.start();
        t3.start();
    }
}
