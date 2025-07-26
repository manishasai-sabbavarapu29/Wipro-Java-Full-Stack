/*A) Write a program to check if a given integer number is Positive, Negative, or Zero. 
*/
public class Sample{
  public static void main(String[] args){
    int a = -51;
    if(a>0){
      System.out.println("Positive");
    }
    else if(a<0){
      System.out.println("Negative");
    }
    else{
      System.out.println("Zero");
    }
  }
}
// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

//      lastDigit(7, 17) → true
//      lastDigit(6, 17) → false
//      lastDigit(3, 113) → true
// */
public class Sample{
  public static void main(String[] args){
    lastdigit(7, 17);
    lastdigit(6,17);
    lastdigit(3,113);
  }
  public static void lastdigit(int a, int b){
    int rem1 = a%10;
    int rem2 = b%10;
    if(rem1 == rem2){
      System.out.println("true");
    }
    else{
       System.out.println("false");
    }
  }
}
    
