package main;

/**
 * GameState
 */
public class GameState {
    private int playerScore = 0;
    private int cpuScore = 0;
    private int highScore; // add with persistance 
    private String startGauntletPrompt = "Welcome to the rock, paper, scissor gauntlet, you will face four opponents. It's first to ten! Loose to one opponent and you start all over!";
    private String gameModePrompt = "1. Gauntlet%n2. Select Opponent";

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
