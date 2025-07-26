/*
 Write a program to receive a number and print the corresponding month name.

Example1)

C:\>java Sample 12

O/P Expected : December

Example2)

C:\>java Sample 

O/P Expected : Please enter the month in numbers

Example3)

C:\>java Sample 15

O/P Expected : Invalid month*/
import java.util.*;
public class Sample{
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    if(num>=1 && num<=12){
      switch(num){
        case 1 : System.out.print("January");break;
        case 2 : System.out.print("February");break;
        case 3 : System.out.print("March");break;
        case 4 : System.out.print("April");break;
        case 5 : System.out.print("May");break;
        case 6 : System.out.print("June");break;
        case 7 : System.out.print("July");break;
        case 8 : System.out.print("August");break;
        case 9 : System.out.print("September");break;
        case 10 : System.out.print("October");break;
        case 11 : System.out.print("November");break;
        case 12 : System.out.print("December");break;
        default: System.out.print("Invalid month");
      }}}}
      
