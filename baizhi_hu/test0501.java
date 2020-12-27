package day5;
public class test0501{
  public static void main(String[] args){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      int n= sc.nextInt();
      System.out.println(fact(n));
  }
  static int fact(int n){
     if(n==1) return 1;   //... 3 2 1 0 -1 -2  ... 
     int result = n* fact(n-1);
     return result;
  }
}