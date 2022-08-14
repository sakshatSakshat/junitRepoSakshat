package ca.sheridancollege.junit;

//package ca.sheridancollege.project;

public class newMain {
    public static void main(String []args){
        boolean firstTest = Junit.test(5, 3);
        System.out.println("valid" + firstTest);
        
        
        String winner = Winner.testWinner(52, 0);
        System.out.println(winner);
        
        Play.testPlay(9, 3);
        
    }
 }
