package day5;
// 哥德巴赫猜想  
//  
public class test0506{
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
    //for(int a=2;a<=n/2;a++){
      for(int a=3;a<=n/2;a+=2){   //update   01 

        int b=n-a;
        // if a is zhishu  && b is zhishu 
        if(isPrime(a) && isPrime(b)){
          System.out.println(n+"="+a+"+"+b);
        }
    }

  }

 // 
  static boolean isPrime(int x){
      double d = Math.sqrt(x);
      for(int i=3;i<d;i+=2){             //update 02  because  100   2*50   4*25  5*20  10*10  
    //for(int i=3;i<x;i+=2){             //update   01 
    //for(int i=2;i<x;i++){
      if(x%i==0) return false;
    }
    return true;
  }
  
}