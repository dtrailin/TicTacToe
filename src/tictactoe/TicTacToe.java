package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TicTacToe {      
public boolean player = true; // X = True, O = False
public byte Grid[] = new byte[8];

public void gridReset (){
    for(int i = 0; i < Grid.length; i++)
		Grid[i] = 0;
}
 public void printGrid(){
   int gridNo = 1;
     for(int row = 0; row < 3; row ++){
        for (int line = 0; line < 3; line++) {
            
            System.out.print("["+gridNo+"]");
            gridNo++;
        }
        System.out.printf("%n");
 
    }  
 }
 public void setGrid(){
     
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

  Grid.printGrid();
 
           }
   }