package main;

import java.util.concurrent.ThreadLocalRandom;

public class RPSGame {
    public static void main(String[] args) {
        System.out.println("Start Game");
        GameState gs = new GameState();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        System.out.println(randomNum); 
    }
}
