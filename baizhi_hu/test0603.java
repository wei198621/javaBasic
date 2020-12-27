package day6;
public class test0603{
   public static void main (String[] args){

       char[] cs={ 'A','d','G','d','F','c','d'}; 
       char[] csResult=new char[cs.length];
       int result=0;
       for(int i=0;i<cs.length;i++){
          if(cs[i]>='a' && cs[i]<='z')
          {
            csResult[result]=cs[i];
             result ++;
          }
       }
       System.out.println(result); 
       System.out.println();

       for(int i=0;i<csResult.length;i++){
          System.out.print(csResult[i]);
       }     

       
   }
       
}