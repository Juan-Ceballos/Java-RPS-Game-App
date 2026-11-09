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
    private final int roundOne = 0;
    private final int roundTwo = 1;
    private final int roundThree = 2;
    private final int roundFour = 3;
    private int cpuChoice;
    private int playerChoice;
    private final int rock = 0;
    private final int paper = 1;
    private final int scissor = 2;
    private int gauntletRound = 0;
    private boolean isPlayerWinner;
    private boolean isPlayerTie;
    private boolean playerWon;
    private int highScore; // add with persistance 
    private String startGauntletPrompt = "Welcome to the rock, paper, scissor gauntlet, you will face four opponents. It's first to ten! Loose to one opponent and you start all over!";
    private String opponentPrompt = "Your oppenent is ";
    private String winningPrompt = "The winner is: ";
    private String tiePrompt = "Tie!";
    private String cpuPlayerRocky;
    private String cpuPlayerPipper;
    private String cpuPlayerCutter;
    private String cpuPlayerBoss;
    private String currentOpponent;
    private String playerName;

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

    private void resetScore() { // might be reset whole game most likely
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

    public void startGauntletPrompt() {
        System.out.println(startGauntletPrompt);
    }


    public void setOpponent(int round) {
        if (round == roundOne) {
            currentOpponent = cpuPlayerRocky;
        } else if (round == roundTwo) {
            currentOpponent = cpuPlayerPipper;
        } else if (round == roundThree) {
            currentOpponent = cpuPlayerCutter;
        } else {
            currentOpponent = cpuPlayerBoss;
        }
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

    private String declareWinnerRound(String cpuName) {
        if (isPlayerWinner) {
            return winningPrompt + playerName;
        } else if (isPlayerTie) {
            return tiePrompt;
        } else {
            return winningPrompt + cpuName;
        }
    }

    public void runGauntletGame(String cpuOpponent) {
        System.out.println(opponentPrompt + cpuOpponent);
        while (getPlayerScore() < winningScore || getCPUScore() < winningScore) {
            
        }
        resetScore();
        System.out.println(cpuScore);
        System.out.println(playerScore); 
    }

}
