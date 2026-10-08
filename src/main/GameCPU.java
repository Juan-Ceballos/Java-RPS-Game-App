package main;

public abstract class GameCPU {
    final int rockIndex = 2;
    final int paperIndex = 5;
    final int scissorIndex = 8;
    final int weight = 1;
    final String rock = "rock";
    final String Paper = "paper";
    final String Scissor = "scissor";

    public GameCPU() {}

    String makeChoiceRock(int choiceRangeNum) {
        if (choiceRangeNum <= rockIndex + weight) {
            return "rock";
        } else if (choiceRangeNum <= paperIndex + weight) {
            return "paper";
        }
        return "scissor";
    }

    String makeChoicePaper(int choiceRangeNum) {
        if (choiceRangeNum <= rockIndex - weight) {
            return "rock";
        } else if (choiceRangeNum <= paperIndex) {
            return "paper";
        }
        return "scissor";
    }

    String makeChoiceScissor(int choiceRangeNum) {
        if (choiceRangeNum <= rockIndex) {
            return "rock";
        } else if (choiceRangeNum <= paperIndex - weight) {
            return "paper";
        }
        return "scissor";
    }

    String makeChoiceBalanced(int choiceRangeNum) {
       if (choiceRangeNum <= rockIndex) {
            return "rock";
        } else if (choiceRangeNum <= paperIndex) {
            return "paper";
        }
        return "scissor"; 
    }

}
