package main;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RPSGame {
    private String setRoundOpponent(int round) {
        return "";
    }
    public static void main(String[] args) {
        // int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        // System.out.println(randomNum); 
        // Scanner myObj = new Scanner(System.in);
        // System.out.println("Enter Choice");
        // System.out.println("you chose:" + choice);
        // String choice = myObj.nextLine();
        GameState gs = new GameState();
        // GameCPU gc = new GameCPU(){};
        //gs.startGauntletPrompt();
        System.out.println(gs.getOpeningPrompt());
        System.out.println(gs.firstOpponentPrompt());
        gs.displayGameBoard();

    }
}
