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

    abstract String makeChoice(int choiceRangeNum);

    class RockCPU extends GameCPU {
        public RockCPU() {}
        String makeChoice(int choiceRangeNum) {
            if (choiceRangeNum <= rockIndex + weight) {
                return "rock";
            } else if (choiceRangeNum <= paperIndex + weight) {
                return "paper";
            }
            return "scissor";
        }
    }

    class PaperCPU extends GameCPU {
        public PaperCPU() {}
        String makeChoice(int choiceRangeNum) {
            if (choiceRangeNum <= rockIndex - weight) {
                return "rock";
            } else if (choiceRangeNum <= paperIndex) {
                return "paper";
            }
            return "scissor";
        }
    }

    class ScissorsCPU extends GameCPU {
        public ScissorsCPU() {}
        String makeChoice(int choiceRangeNum) {
            if (choiceRangeNum <= rockIndex) {
                return "rock";
            } else if (choiceRangeNum <= paperIndex - weight) {
                return "paper";
            }
            return "scissor";
        }
    }

    class BossCPU extends GameCPU {
        public BossCPU() {}
        String makeChoice(int choiceRangeNum) {
            if (choiceRangeNum <= rockIndex) {
                return "rock";
            } else if (choiceRangeNum <= paperIndex) {
                return "paper";
            }
            return "scissor"; 
        }
    }
    
}