package ca.sheridancollege.junit;

public class Winner {
    public static String testWinner(int cardsPlayer1,int cardsPlayer2){
        if (cardsPlayer1==52) {
            return "Player1 wins";
        }
        else if (cardsPlayer2==52) {
            return "Player2 wins";
        }
        else {
            return "Game still running";
        }
        
    }

}