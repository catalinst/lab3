package isp.lab3.exercise3;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        FootballPlayer fp = new FootballPlayer("Cristiano", "Real Madrid", 'M');

        System.out.println(fp.getName() + " is a " + fp.getGender() + " and now is at " + fp.getTeam());
        System.out.println("He scored last week " + fp.getGoalsScored() + " goals");

        Random random = new Random();
        fp.setTeam("Juventus");
        fp.setGoalsScored(random.nextInt(16) + 15);

        System.out.println(fp);
    }
}
