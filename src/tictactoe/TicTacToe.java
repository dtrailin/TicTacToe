package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TicTacToe {

       
        
   public static String Input () throws IOException{
 InputStreamReader istream = new InputStreamReader(System.in) ;
 BufferedReader bufRead = new BufferedReader(istream) ;
            String Input = bufRead.readLine();
            return Input;
       }
        
    public static void main (String[] args) throws IOException {
       
    }

}
