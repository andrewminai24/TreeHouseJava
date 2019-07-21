class Main {
    public static void main(String[] args) {
        calculateScore(true, 12, 4, 8);
        calculateScore(true, 1, 4, 10);
     int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("ANDREW",highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int err = -1;
        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 100;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        } else {
            return err;
        }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "Managed to get into position" + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int pScore) {
        if (pScore > 1000) {
            return 1;
        } else if (pScore > 500 && pScore < 1000) {
            return 2;
        } else if (pScore > 100 && pScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }

}