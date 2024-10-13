import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean main_done = false;

        do {
            String movePlayer1 = "";
            String movePlayer2 = "";
            boolean done = false;
            do {
                System.out.println("What is player 1's move?");
                if (input.hasNextLine()) {
                    String move = input.nextLine();
                    //I am already familiar with java, so I know || means or, which means that if one statement is true then the "if statement" is set to true
                    if((move.equalsIgnoreCase("r")||move.equalsIgnoreCase("p"))||move.equalsIgnoreCase("s")){
                        movePlayer1 = move;
                        done = true;}
                    else {
                        System.out.println("Wrong input");
                        input.nextLine();
                    }
                }
                else {
                    System.out.println("Wrong input type");
                    input.nextLine();

                }
            } while (!done);
            done = false;
            do {
                System.out.println("What is player 2's move?");
                if (input.hasNextLine()) {
                    String move = input.nextLine();
                    if(move.equalsIgnoreCase("r")||move.equalsIgnoreCase("p")||move.equalsIgnoreCase("s")){
                        movePlayer2 = move;
                        done = true;}

                } else {
                    System.out.println("Wrong input type");
                    input.nextLine();
                }

            } while (!done);
            if (movePlayer1.equalsIgnoreCase("R")) {
                if (movePlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, its a tie");
                }
                if (movePlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Rock vs Paper, player 2 wins");
                }
                if (movePlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Rock vs Scissors, player 1 wins");
                }
            }

            if (movePlayer1.equalsIgnoreCase("P")) {
                if (movePlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Paper, player 1 wins");
                }
                if (movePlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, its a tie");
                }
                if (movePlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Paper vs Scissors, player 2 wins");
                }
            }

            if (movePlayer1.equalsIgnoreCase("S")) {
                if (movePlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Scissors, Player 2 wins");
                }
                if (movePlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Scissors vs Paper, player 1 wins");
                }
                if (movePlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors, its a tie");
                }
            }

            done = false;
            do{
                System.out.println("Want to play again? please input Y/N");
                if(input.hasNextLine()){
                    String decision = input.nextLine();
                    if (!decision.equalsIgnoreCase("y")) {
                        main_done = true;
                    }
                    done = true;
                }
                else{
                    System.out.println("PLEASE INPUT Y/N, wrong input type");
                    input.nextLine();
                }
            }while(!done);

        }while(!main_done);
    }
}