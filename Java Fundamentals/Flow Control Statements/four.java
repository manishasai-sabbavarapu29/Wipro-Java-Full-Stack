/*
Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
*/
import java.util.*;
public class Sample{
  public static void main(String[] args){
    alphabeticorder('s','e');
    alphabeticorder('a','e');
  }
  public static void alphabeticorder(char x, char y){
    if(x>y){
      System.out.println(y+","+x);
    }
    else{
      System.out.println(x+","+y);
    }
  }
}
