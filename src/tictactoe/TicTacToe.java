package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
;
public class TicTacToe {      
public boolean player = true; // X = True, O = False
public byte Grid[] = new byte[8];

public void gridReset (){
    for(int i = 0; i < 8; i = i + 1)
		Grid[i] = 0;
}
 
 public static String Input () throws IOException{
    InputStreamReader istream = new InputStreamReader(System.in) ;
    BufferedReader bufRead = new BufferedReader(istream) ;
    String Input = bufRead.readLine();
     return Input;
    }
 
   public static void main (String[] args) throws IOException {
    System.out.println("Welcome to Denis' Tic Tac Toe game!");
 TicTacToe Grid = new TicTacToe();
 Grid.Grid[1]=23;
  System.out.println (Grid.Grid[1]);
  Grid.gridReset();
  System.out.println (Grid.Grid[1]);
 
           }
   }
