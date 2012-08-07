package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class TicTacToe {
    //1 = X, 2 = O
    public boolean player = true; // X = True, O = False
    public int Grid[] = new int[10];
    public String textGrid[] = new String[10];
    public boolean gameRun = true;
    public int roundNo = 0;
    public boolean reset = true;

    public void gridReset() {
        for (int i = 0; i < Grid.length; i++) {
            Grid[i] = 0;
        }
        for (int i = 0; i < textGrid.length; i++) {
            textGrid[i] = " ";
            roundNo = 0;
            player = true;
        }
    }

    public void clear(int clear) {
        char c = '\n';
        int length = clear;
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));
    }

    public void convert() throws IOException, NumberFormatException {
        try {
            int input = Integer.parseInt(TicTacToe.Input());
            if (input > 9 || input < 1) {
                System.out.println("Number out of bounds");
            } else {


                if (Grid[input] == 0) {
                    if (player == true) {
                        Grid[input] = 1;
                        player = false;
                        roundNo++;
                    } else {
                        Grid[input] = 2;
                        player = true;
                        roundNo++;
                    }
                } else {
                    System.out.println("There is already something there. Try again");
                }
                for (int i = 0; i < Grid.length; i++) {
                    switch (Grid[i]) {
                        case 1:
                            textGrid[i] = "X";
                            break;
                        case 2:
                            textGrid[i] = "O";
                            break;
                    }
                }
            }
        } catch (NumberFormatException bad) {
            System.out.println("That's not a number...");
        }
    }

    public void printGrid1() {
        int gridNo = 1;
        for (int row = 0; row < 3; row++) {
            for (int line = 0; line < 3; line++) {
                System.out.print("[" + textGrid[gridNo] + "]");
                gridNo++;
            }
            System.out.printf("%n");

        }
    }

    public void printGrid() {
        int gridNo1 = 1;
        for (int row = 0; row < 3; row++) {
            for (int line = 0; line < 3; line++) {

                System.out.print("[" + gridNo1 + "]");
                gridNo1++;
            }
            System.out.printf("%n");
        }
    }

    public static String Input() throws IOException {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(istream);
        String Input = bufRead.readLine();
        return Input;
    }

    public void checkWin() {
        for (int x = 0; x <= 6; x += 3) {
            if (Grid[x + 1] == Grid[x + 2] && Grid[x + 2] == Grid[x + 3] && Grid[x + 1] == 1) {
                gameRun = false;
                System.out.println("The winner is X!");
            }
            if (Grid[x + 1] == Grid[x + 2] && Grid[x + 2] == Grid[x + 3] && Grid[x + 1] == 2) {
                gameRun = false;
                System.out.println("The winner is O!");
            }
        }
        for (int l = 0; l < 3; l++) {
            if (Grid[l + 1] == Grid[l + 4] && Grid[l + 4] == Grid[l + 7] && Grid[l + 1] == 1) {
                gameRun = false;
                System.out.println("The winner is X!");
            }
            if (Grid[l + 1] == Grid[l + 4] && Grid[l + 4] == Grid[l + 7] && Grid[l + 1] == 2) {
                gameRun = false;
                System.out.println("The winner is O!");
            }
        }
        if (Grid[1] == Grid[5] && Grid[5] == Grid[9] && Grid[1] == 1) {
            gameRun = false;
            System.out.println("The winner is X!");
        }
        if (Grid[1] == Grid[5] && Grid[5] == Grid[9] && Grid[1] == 2) {
            gameRun = false;
            System.out.println("The winner is O!");
        }
        if (Grid[3] == Grid[5] && Grid[5] == Grid[7] && Grid[3] == 1) {
            gameRun = false;
            System.out.println("The winner is X!");
        }
        if (Grid[3] == Grid[5] && Grid[5] == Grid[7] && Grid[3] == 2) {
            gameRun = false;
            System.out.println("The winner is O!");
        }
    }

   
    public static void main(String[] args) throws IOException {
        AI AIplay = new AI();
        System.out.println("Welcome to Denis' Tic Tac Toe game!");
        boolean run = true;
        while (run == true) {
            TicTacToe Grid = new TicTacToe();
            Grid.gridReset();
            Grid.printGrid();
            boolean asks = true;
            System.out.println("Would you like to play AI or human?\n 1 = AI \t 2 = human");
            while (asks == true) {
                switch (TicTacToe.Input()) {
                    case "1":
                        System.out.println(System.getProperty("user.name") + " VS AI");
                        Grid.gridReset();
                        asks = false;
                        while (Grid.gameRun == true) {
                         //   AIplay.AI();
                            if (Grid.roundNo == 9 && Grid.gameRun == true) {
                                Grid.gameRun = false;
                                System.out.println("It's a tie!");
                            }
                        }
                       // Grid.reset = true;
                        break;
                    case "2":
                        System.out.println(System.getProperty("user.name") + " VS human");
                        asks = false;
                        while (Grid.gameRun == true) {
                            if (Grid.player == true) {
                                System.out.println("Where do you want to place (X)?");
                            } else {
                                System.out.println("Where do you want to place (O)?");
                            }
                            Grid.convert();
                            Grid.printGrid1();
                            Grid.checkWin();
                            if (Grid.roundNo == 9 && Grid.gameRun == true) {
                                System.out.println("It's a tie!");
                                Grid.gameRun = false;
                            }
                        }
                        break;
                    default:
                        System.out.println("Not valid answer");
                        break;
                }
            }
            System.out.println("Would you like to play another round?(y/n)");
            boolean ask = true;
            while (ask == true) {
                switch (TicTacToe.Input()) {
                    case "n":
                        run = false;
                        System.out.println("Thanks for playing!");
                        ask = false;
                        break;
                    case "y":
                        ask = false;
                        switch (System.getProperty("os.name")) {
                            case "Linux":
                                ProcessBuilder ProcessBuilder = new ProcessBuilder();
                                String line = ProcessBuilder.environment().get("LINES");
                                if (line != null) {
                                    Grid.clear(Integer.parseInt(line));
                                } else {
                                    Grid.clear(50);
                                }
                                break;
                            default:

                                break;
                        }


                        break;
                    default:
                        System.out.println("Not valid answer.");
                        break;
                }
            }
        }
    }
}