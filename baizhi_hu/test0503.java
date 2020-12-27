package day5;
//汉诺塔问题 
public class test0503{
  public static void main(String[] args){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      int n= sc.nextInt();
      /*
      移动n个盘子  A -B 
      1.  移动 n-1 个盘子   A--> C 
      2.  将大盘子          A--> B
      3.  移动 n-1 个判词   C --> B   
       -----------------------------到目前为止没有解决 ，因为不符合一次移动一个的条件 
       注意递归一定要有退出条件 
      */
      transfer(n,'A','B','C');
  }
  //把n 个盘子，从from移动到to ,借助temp 
  //static void transfer(int n,char A ,char B ,char C ){
  static void transfer(int n,char from ,char to ,char temp ){
      if(n==0) return ;
       // 1.  移动 n-1 个盘子   from--> temp 
       transfer(n-1,from,temp,to);
       // 2.  将大盘子          from--> to
       System.out.println(from +"------->" + to );
       // 3.  移动 n-1 个盘子   temp --> to
       transfer(n-1,temp,to,from);
  }
}