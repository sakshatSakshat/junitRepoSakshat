package ca.sheridancollege.junit;

public class Play {

    public static void testPlay(int player1TopCard,int player2TopCard){
        String winner;
        if (player1TopCard > player2TopCard) {
            winner = "Player1 wins both cards and added to player1 deck";
        }
        else if (player2TopCard > player1TopCard) {
            winner="Player2 wins both cards and added to player2 deck";
        }
        else {
            winner="Game draws(war begins)";
        }
        System.out.println(winner);
    }
}
