/*
 Write a program to check if a given integer number is odd or even.
*/
public class Sample{
  public static void main(String[] args){
    checkevenodd(9);
  }
  public static void checkevenodd(int a){
    if(a%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
  }
}
