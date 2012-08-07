/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Denis
 */
public class AI extends TicTacToe {

    public void AI() throws IOException {

        Random rand = new Random();
        try {
            if (reset == true) {
                gridReset();
                reset = false;
            }
            boolean turnWork = true;
            if (player == true && roundNo != 9) {
                while (turnWork == true) {
                    int input = Integer.parseInt(TicTacToe.Input());
                    if (input > 9 || input < 1) {
                        System.out.println("Number out of bounds");
                    } else {
                        if (Grid[input] == 0) {
                            Grid[input] = 1;
                            roundNo++;
                            turnWork = false;
                            player = false;
                        } else {
                            System.out.println("There is already something there. Try again");
                        }
                    }
                }
            } else if (player == false && roundNo != 9 && gameRun == true) {
                System.out.println("AI");
                roundNo++;
                boolean AIwork = true;
                while (AIwork == true) {
                    for (int x = 0; x <= 6; x += 2) {
                        if (Grid[x + 1] == Grid[x + 2] && Grid[x + 2] == 2 && Grid[x + 3] == 0 && AIwork == true) {
                            Grid[x + 3] = 2;
                            AIwork = false;
                        } else if (Grid[x + 2] == Grid[x + 3] && Grid[x + 3] == 2 && Grid[x + 1] == 0 && AIwork == true) {
                            Grid[x + 1] = 2;
                            AIwork = false;
                        } else if (Grid[x + 1] == Grid[x + 3] && Grid[x + 3] == 2 && Grid[x + 2] == 0 && AIwork == true) {
                            Grid[x + 2] = 2;
                            AIwork = false;
                        }
                        for (int l = 0; l < 3; l++) {
                            if (Grid[l + 1] == Grid[l + 4] && Grid[l + 4] == 2 && Grid[l + 7] == 0 && AIwork == true) {
                                Grid[l + 7] = 2;
                                AIwork = false;
                            } else if (Grid[l + 4] == Grid[l + 7] && Grid[l + 4] == 2 && Grid[l + 1] == 0 && AIwork == true) {
                                Grid[l + 1] = 2;
                                AIwork = false;
                            } else if (Grid[l + 1] == Grid[l + 7] && Grid[l + 1] == 2 && Grid[l + 4] == 0 && AIwork == true) {
                                Grid[l + 4] = 2;
                                AIwork = false;
                            }
                        }
                        if (Grid[1] == Grid[5] && Grid[5] == 2 && Grid[9] == 0 && AIwork == true) {
                            Grid[9] = 2;
                            AIwork = false;
                        } else if (Grid[5] == Grid[9] && Grid[5] == 2 && Grid[1] == 0 && AIwork == true) {
                            Grid[1] = 2;
                            AIwork = false;
                        } else if (Grid[1] == Grid[9] && Grid[9] == 2 && Grid[5] == 0 && AIwork == true) {
                            Grid[5] = 2;
                            AIwork = false;
                        } else if (Grid[3] == Grid[5] && Grid[5] == 2 && Grid[7] == 0 && AIwork == true) {
                            Grid[7] = 2;
                            AIwork = false;
                        } else if (Grid[3] == Grid[7] && Grid[3] == 2 && Grid[5] == 0 && AIwork == true) {
                            Grid[5] = 2;
                            AIwork = false;
                        } else if (Grid[5] == Grid[7] && Grid[5] == 2 && Grid[3] == 0 && AIwork == true) {
                            Grid[3] = 2;
                            AIwork = false;
                        }
                    }
                    for (int x = 0; x <= 6; x += 2) {
                        if (Grid[x + 1] == Grid[x + 2] && Grid[x + 2] == 1 && Grid[x + 3] == 0 && AIwork == true) {
                            Grid[x + 3] = 2;
                            AIwork = false;
                        } else if (Grid[x + 2] == Grid[x + 3] && Grid[x + 3] == 1 && Grid[x + 1] == 0 && AIwork == true) {
                            Grid[x + 1] = 2;
                            AIwork = false;
                        } else if (Grid[x + 1] == Grid[x + 3] && Grid[x + 3] == 1 && Grid[x + 2] == 0 && AIwork == true) {
                            Grid[x + 2] = 2;
                            AIwork = false;
                        }
                        for (int l = 0; l < 3; l++) {
                            if (Grid[l + 1] == Grid[l + 4] && Grid[l + 4] == 1 && Grid[l + 7] == 0 && AIwork == true) {
                                Grid[l + 7] = 2;
                                AIwork = false;
                            } else if (Grid[l + 4] == Grid[l + 7] && Grid[l + 4] == 1 && Grid[l + 1] == 0 && AIwork == true) {
                                Grid[l + 1] = 2;
                                AIwork = false;
                            } else if (Grid[l + 1] == Grid[l + 7] && Grid[l + 1] == 1 && Grid[l + 4] == 0 && AIwork == true) {
                                Grid[l + 4] = 2;
                                AIwork = false;
                            }
                        }
                        if (Grid[1] == Grid[5] && Grid[5] == 1 && Grid[9] == 0 && AIwork == true) {
                            Grid[9] = 2;
                            AIwork = false;
                        } else if (Grid[5] == Grid[9] && Grid[5] == 1 && Grid[1] == 0 && AIwork == true) {
                            Grid[1] = 2;
                            AIwork = false;
                        } else if (Grid[1] == Grid[9] && Grid[9] == 1 && Grid[5] == 0 && AIwork == true) {
                            Grid[5] = 2;
                            AIwork = false;
                        } else if (Grid[3] == Grid[5] && Grid[5] == 1 && Grid[7] == 0 && AIwork == true) {
                            Grid[7] = 2;
                            AIwork = false;
                        } else if (Grid[3] == Grid[7] && Grid[3] == 1 && Grid[5] == 0 && AIwork == true) {
                            Grid[5] = 2;
                            AIwork = false;
                        } else if (Grid[5] == Grid[7] && Grid[5] == 1 && Grid[3] == 0 && AIwork == true) {
                            Grid[3] = 2;
                            AIwork = false;
                        }
                    }
                    int AIplace = 1 + rand.nextInt(9);
                    if (Grid[AIplace] == 0 && AIwork == true) {
                        Grid[AIplace] = 2;
                        AIwork = false;
                    }
                }
                player = true;
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
            checkWin();
            if (roundNo == 9 && gameRun == true) {
                gameRun = false;
                System.out.println("It's a tie!");
            }
            printGrid1();
        } catch (NumberFormatException bad) {
            System.out.println("That's not a number...");
        }
    }
}
