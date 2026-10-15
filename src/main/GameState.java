package main;

/**
 * GameState
 */
public class GameState {
    private int playerScore = 0;
    private int cpuScore = 0;
    private final int winningScore = 10;
    private final int initialScore = 0;
    private final int scoredPoint = 1;
    private int cpuChoice;
    private int playerChoice;
    private final int rock = 0;
    private final int paper = 1;
    private final int scissor = 2;
    private boolean isPlayerWinner;
    private boolean isPlayerTie;


    private int highScore; // add with persistance 
    private String startGauntletPrompt = "Welcome to the rock, paper, scissor gauntlet, you will face four opponents. It's first to ten! Loose to one opponent and you start all over!";
    private String gameModePrompt = "Welcome! Pick an option(e.g. 1)%n1. Gauntlet%n2. Select Opponent";
    private String cpuPlayerRocky;
    private String cpuPlayerPipper;
    private String cpuPlayerCutter;
    private String cpuPlayerBoss;


    public GameState() {}

    private void increasePlayerScore() {
        playerScore += scoredPoint;
    }

    private void increaseCPUScore() {
        cpuScore += scoredPoint;
    }

    private int getPlayerScore() {
        return playerScore;
    }

    private int getCPUScore() {
        return cpuScore;
    }

    private void resetScore() {
        playerScore = initialScore;
        cpuScore = initialScore;
    }

    private void setCPUChoice(int currentCPUChoice) {
        cpuChoice = currentCPUChoice;
    }

    private void setPlayerChoice(int currentPlayerChoice) {
        playerChoice = currentPlayerChoice;
    }

    private int getCPUChoice() {
        return cpuChoice;
    }

    private int getPlayerChoice() {
        return playerChoice;
    }

    public void checkRock() {
        if (cpuChoice == rock) {
            isPlayerTie = true;
        } else if (cpuChoice == paper) {
            isPlayerWinner = false;
        } else {
            isPlayerWinner = true;
        }
    }

    public void checkPaper() {
        if (cpuChoice == paper) {
            isPlayerTie = true;
        } else if (cpuChoice == scissor) {
            isPlayerWinner = false; 
        } else {
            isPlayerWinner = true;
        }
    }

    public void checkScissor() {
        if (cpuChoice == scissor) {
            isPlayerTie = true;
        } else if (cpuChoice == rock) {
            isPlayerWinner = false;
        } else {
            isPlayerWinner = true;
        }
    }


    public void runGauntletGame(String cpuOpponent) {
        System.out.println("Your opponent is " + cpuOpponent);
        while (getPlayerScore() < winningScore || getCPUScore() < winningScore) {
            
        }
        resetScore();
        System.out.println(cpuScore);
        System.out.println(playerScore); 
    }

    public void runSelectGame() {

    }
}
