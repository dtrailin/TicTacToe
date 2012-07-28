package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TicTacToe {      
public boolean player = true; // X = True, O = False
public byte Grid[] = new byte[10];

public void gridReset (){
    for(int i = 0; i < Grid.length; i++)
		Grid[i] = 0;
}
public void convert() throws IOException{
 byte input = Byte.parseByte(TicTacToe.Input());
if (player = true){
    Grid[input] = 1;
}
    }
 public void printGrid1(){
    int gridNo = 1;
     for(int row = 0; row < 3; row ++){
        for (int line = 0; line < 3; line++) {
            
            System.out.print("["+Grid[gridNo]+"]");
            gridNo++;
        }
        System.out.printf("%n");
 
    }  
 }
 public void printGrid(){
     int gridNo1 = 1;
     for(int row = 0; row < 3; row ++){
        for (int line = 0; line < 3; line++) {
            
            System.out.print("["+gridNo1+"]");
            gridNo1++;
        }
        System.out.printf("%n");
 
    }
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
  Grid.convert();
  Grid.printGrid1();
  
 
           }
   }