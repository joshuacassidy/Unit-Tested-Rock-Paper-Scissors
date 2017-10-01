package rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSTest {

    RPS rps;

    @Before
    public void setUp() throws Exception {
        rps = new RPS(new String[] {"rock", "paper", "scissors"});
    }

    @Test
    public void testingTheRockInput() throws Exception {
        assertEquals("rock",rps.getComputerChoices()[0]);
    }

    @Test
    public void testingThePaperInput() throws Exception {
        assertEquals("paper",rps.getComputerChoices()[1]);
    }

    @Test
    public void testingTheScissorsInput() throws Exception {
        assertEquals("scissors",rps.getComputerChoices()[2]);
    }

    @Test
    public void computerRockAgainstPlayerRock() throws Exception {
        assertEquals("You chose rock and the computer chose rock!",rps.play("rock","rock"));
        assertEquals("Its a Draw!",rps.getOutput());
    }

    @Test
    public void computerRockAgainstPlayerPaper() throws Exception {
        assertEquals("You chose paper and the computer chose rock!",rps.play("rock","paper"));
        assertEquals("You Win!",rps.getOutput());
    }

    @Test
    public void computerRockAgainstPlayerScissors() throws Exception {
        assertEquals("You chose scissors and the computer chose rock!",rps.play("rock","scissors"));
        assertEquals("You Lose!",rps.getOutput());
    }

    @Test
    public void computerScissorsAgainstPlayerRock() throws Exception {
        assertEquals("You chose rock and the computer chose scissors!",rps.play("scissors","rock"));
        assertEquals("You Win!",rps.getOutput());
    }

    @Test
    public void computerScissorsAgainstPlayerPaper() throws Exception {
        assertEquals("You chose paper and the computer chose scissors!",rps.play("scissors","paper"));
        assertEquals("You Lose!",rps.getOutput());
    }

    @Test
    public void computerScissorsAgainstPlayerScissors() throws Exception {
        assertEquals("You chose scissors and the computer chose scissors!",rps.play("scissors","scissors"));
        assertEquals("Its a Draw!",rps.getOutput());
    }

    @Test
    public void computerPaperAgainstPlayerRock() throws Exception {
        assertEquals("You chose rock and the computer chose paper!",rps.play("paper","rock"));
        assertEquals("You Lose!",rps.getOutput());
    }

    @Test
    public void computerPaperAgainstPlayerPaper() throws Exception {
        assertEquals("You chose paper and the computer chose paper!",rps.play("paper","paper"));
        assertEquals("Its a Draw!",rps.getOutput());
    }

    @Test
    public void computerPaperAgainstPlayerScissors() throws Exception {
        assertEquals("You chose scissors and the computer chose paper!",rps.play("paper","scissors"));
        assertEquals("You Win!",rps.getOutput());
    }



}