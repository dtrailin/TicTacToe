package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class TicTacToe {      
public boolean player = true; // X = True, O = False
 
 public static String Input () throws IOException{
    InputStreamReader istream = new InputStreamReader(System.in) ;
    BufferedReader bufRead = new BufferedReader(istream) ;
    String Input = bufRead.readLine();
     return Input;
    }
   public static void main (String[] args) throws IOException {
    System.out.println("Welcome to Denis' Tic Tac Toe game!");
  System.out.println (TicTacToe.Input());
           
   }
   }
