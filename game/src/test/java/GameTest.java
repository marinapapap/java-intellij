import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
public class GameTest {
    @Test public void testGetsWordToGuess() {
        Game game = new Game("MAKERS");
        assertEquals("M_____", game.getWordToGuess());
    }
}

