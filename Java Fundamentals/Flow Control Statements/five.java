/*
 Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/
import java.util.*;
public class Sample{
  public static void main(String[] args){
    checkvariable('v');
    checkvariable('@');
    checkvariable('2');
  }
  public static void checkvariable(char a){
    if(a>='1' && a<='9'){
      System.out.println("Digit");
    }
    else if(a>='a' && a<='z'){
      System.out.println("Alphabet");
    }
    else{
      System.out.println("Special Character");
    }
  }
}
