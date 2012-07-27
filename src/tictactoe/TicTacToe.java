/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author denis
 */
import java.io.BufferedReader ;
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
        // TODO code application logic he
       System.out.println (TicTacToe.Input());
    }

}
