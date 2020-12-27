package day5;
//  
public class test0505{
  public static void main(String[] args){
    java.util.Scanner sc =new java.util.Scanner(System.in);
    int n=    sc.nextInt();
    if(n<=6 || n%2==1){
      System.out.println("pls input num bigger than 6 ");
      return ;
    }
    /*
    100=2+98
         3+97
         4+96
         ...
    */
    for(int a=2;a<=n/2;a++){
        int b=n-a;
        // if a is zhishu  && b is zhishu 
        if(isPrime(a) && isPrime(b)){
          System.out.println(n+"="+a+"+"+b);
        }
    }

  }

 // 
  static boolean isPrime(int x){
    for(int i=2;i<x;i++){
      if(x%i==0) return false;
    }
    return true;
  }
  
}