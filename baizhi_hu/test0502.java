package day5;
public class test0502{
  public static void main(String[] args){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      int n= sc.nextInt();
      System.out.println(fabo(n));
  }
  //calc   n-1  + n -2 = n 
  static int fabo(int n){
     if(n==1) return 0;
     if(n==2) return 1;
     return fabo(n-1) + fabo(n-2);
  }
}