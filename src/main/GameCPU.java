package main;

public abstract class GameCPU {
    int regularWeight = 1;
    int heavyWeight = 2;
    int[][] weightList = {{1, 1, 1}, };
    int[] choiceRange = {0, 1, 2, 3, 4, 5, 6, 7, 8};

    if 
    
    public class BalancedCPU extends GameCPU {
        public BalancedCPU(int rockWeight, int scissorWeight, int paperWeight) {
            rockWeight = regularWeight;
            paperWeight = regularWeight;
            scissorWeight = regularWeight;
        }
    }

    public class RockCPU extends GameCPU {
        public RockCPU(int rockWeight, int scissorWeight, int paperWeight) {
            rockWeight = heavyWeight;
            paperWeight = regularWeight;
            scissorWeight = regularWeight;
        }
    }

    public class PaperCPU extends GameCPU {
        public PaperCPU(int rockWeight, int scissorWeight, int paperWeight) {
            rockWeight = regularWeight;
            paperWeight = heavyWeight;
            scissorWeight = regularWeight;
        }
    }

    public class ScissorCPU extends GameCPU {
        public ScissorCPU(int rockWeight, int scissorWeight, int paperWeight) {
            rockWeight = regularWeight;
            paperWeight = regularWeight;
            scissorWeight = heavyWeight;
        }
    }


}
