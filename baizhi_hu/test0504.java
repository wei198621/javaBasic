package day5;
// value reference 
public class test0504{
  public static void main(String[] args){
     int m=1;int n=3;
     exchange1(m,n);
     System.out.println(m+ "  "+ n); // 1 3 do not change 
  }
  // 
  static void exchange1(int a,int b ){
      int temp =a;
      a=b;
      b=temp;
  }
}