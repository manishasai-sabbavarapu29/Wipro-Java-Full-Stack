/*
 Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

[Hint: You can use length property of an array to check its length]
*/
import java.util.*;
public class Sample{
  public static void main(String[] args){
    if(args.length == 0){
      System.out.print("No values");
    }
    else{
      for(int i=0; i<args.length-1;i++){
        System.out.print(args[i] + ","));
      }
      System.out.print(args[args.length-1]);
    }
  }
}
