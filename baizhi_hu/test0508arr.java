package day5;
public class test0508arr{
   public static void main (String[] args){

      int[] a ={1,2,3,4,5};
      /*  // array exchange type 1 by self 
      int[] b =new int[a.length*2];
      for(int i=0;i<a.length;i++){
        b[i]=a[i];
      }
      */
      // array exchange type 2 by jdk
      int[] b = java.util.Arrays.copyOf(a,a.length*2);
      System.out.println(a.length);
      a=b;
      System.out.println(a.length);
      for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
      }

       
       System.out.println("---------1---------");
        
       //defalut is 0  0 0 0 0 
       System.out.println("---------2---------");
       
       System.out.println("---------3--------");
   }
}