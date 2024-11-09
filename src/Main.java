import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] rps = {"rock", "paper", "sicssors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {


            System.out.println("Please enter your move: (rock,paper,scissors) ");
            playerMove = scanner.nextLine();
            if (!(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors") || playerMove.equals("exit"))) {
                System.out.println(playerMove + "is not a valid move.");
            }
            if (playerMove.equals("exit")) {
                break;
            }

            System.out.println("computer:" + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!!!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("YOU LOSE!!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("YOU WIN!!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("YOU WIN!!");
                } else if (computerMove.equals("s")) {
                    System.out.println("YOU LOSE!!");
                }
            } else {
                if (computerMove.equals("p")) {
                    System.out.println("YOU WIN!!");
                } else if (computerMove.equals("r")) {
                    System.out.println("YOU LOSE!!");
                }
            }
        }
    }
}