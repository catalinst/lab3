package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FootballPlayerTest {

    @Test
    public void testConstructors() {
        FootballPlayer footballPlayer = new FootballPlayer("Florinel Mbappe","Real Madrid", 'M');
        assertEquals("Object should have the name Florinel Mbappe", "Florinel Mbappe", footballPlayer.getName());
        assertEquals("Object should have the team Real Madrid", "Real Madrid", footballPlayer.getTeam());
        assertEquals("Object should have the gender 'M'", 'M', footballPlayer.getGender());
        assertEquals("Object should have by default 0 goals", 0, footballPlayer.getGoalsScored());
    }

    @Test
    public void getName() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have the name Paco", "Paco", footballPlayer.getName());
    }

    @Test
    public void getTeam() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have the team Barcelona", "Barcelona", footballPlayer.getTeam());
    }

    @Test
    public void setTeam() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have the team Barcelona", "Barcelona", footballPlayer.getTeam());
        footballPlayer.setTeam("Seville");
        assertEquals("Object should have now the team Seville", "Seville", footballPlayer.getTeam());
    }

    @Test
    public void getGoalsScored() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have by default 0 goals", 0, footballPlayer.getGoalsScored());
    }

    @Test
    public void setGoalsScored() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have by default 0 goals", 0, footballPlayer.getGoalsScored());
        footballPlayer.setGoalsScored(25);
        assertEquals("Object should have now 25 goals", 25, footballPlayer.getGoalsScored());
    }

    @Test
    public void getGender() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("Object should have the gender 'M'", 'M', footballPlayer.getGender());
    }

    @Test
    public void testToString() {
        FootballPlayer footballPlayer = new FootballPlayer("Paco", "Barcelona", 'M');
        assertEquals("ToString should be", "Paco (M) scored 0 goals at Barcelona", footballPlayer.toString());
    }
}