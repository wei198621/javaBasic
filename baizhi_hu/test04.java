package day4;
public class test04{
	
	public static void main(String[] args){
	
    //阶乘
    java.util.Scanner s= new java.util.Scanner(System.in);
    int n =s.nextInt();
    if(n>13){
        System.out.println("input num must < 13 ");
        return ;
    }
    //int result=1;   //biggest 12   BigInteger 
	long result =1;
    for(int i=1;i<=n;i++){
        result*=i;  //1*2*3*4.....99;
    }
    System.out.println(result);
   }  
}