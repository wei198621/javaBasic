package day5;
public class test0507arr{
   public static void main (String[] args){
       int[] a;   //multial types of  int 
       a=new int[5];
       //
       System.out.println("---------1---------");
       for(int i=0;i<5;i++){
       	   System.out.println(a[i]);
       }
       //defalut is 0  0 0 0 0 
       System.out.println("---------2---------");
       for(int i=0;i<5;i++){
       	   a[i]=i+1;
       }
       //System.out.println(a.length);
       //System.out.println(a.toString());  //[I@659e0bfd
       System.out.println(a[3]);
       System.out.println("---------3--------");
   }
}