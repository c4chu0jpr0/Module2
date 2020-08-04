public class TennisGame {

    public static final int FOUR = 4;

    public static String getScore(String NamePlayer1, String NamePlayer2, int ScoreOfPlayer1, int ScoreOfPlayer2) {
        String score = "";
        int tempScore = 0;
        if (isaBoolean(ScoreOfPlayer1, ScoreOfPlayer2)) score = getString(ScoreOfPlayer1);
        else if (ScoreOfPlayer1 >= FOUR || ScoreOfPlayer2 >= FOUR) score = getString(ScoreOfPlayer1, ScoreOfPlayer2);
        else score = getString(ScoreOfPlayer1, ScoreOfPlayer2, score);
        return score;
    }

    private static String getString(int ScoreOfPlayer1, int ScoreOfPlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (isaBoolean(i, 1)) tempScore = ScoreOfPlayer1;
            else {
                score += "-";
                tempScore = ScoreOfPlayer2;
            }
            switch (tempScore) {
                score = getString(score);
                break;
            }
        }
        return score;
    }

    private static String getString(String score) {
        case 0:
        score += "Love";
        return score;
        case 1:
        score += "Fifteen";
        break;
        case 2:
        score += "Thirty";
        break;
        case 3:
        score += "Forty";
        break;
        return score;
    }

    private static String getString(int ScoreOfPlayer1, int ScoreOfPlayer2) {
        String score;
        int minusResult = ScoreOfPlayer1-ScoreOfPlayer2;
        if (isaBoolean(minusResult, 1)) score ="Advantage player1";
        else if (isaBoolean(minusResult, -1)) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getString(int ScoreOfPlayer1) {
        String score;
        switch (ScoreOfPlayer1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static boolean isaBoolean(int ScoreOfPlayer1, int ScoreOfPlayer2) {
        return ScoreOfPlayer1 == ScoreOfPlayer2;
    }
}
