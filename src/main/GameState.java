package main;

/**
 * GameState
 */
public class GameState {
    private int playerScore = 0;
    private int cpuScore = 0;
    private String startPrompt = "Game Start, choosing CPU opponent!";

    public GameState() {}

    public void increasePlayerScore() {
        playerScore += 1;
    }

    public void increaseCPUScore() {
        cpuScore += 1;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getCPUScore() {
        return cpuScore;
    }

    public void runGame() {

    }
}
