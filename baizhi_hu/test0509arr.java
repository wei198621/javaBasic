package day5;
public class test0509arr{
   public static void main (String[] args){

      //type 01 
      //int[][] a;       a=new int[3][4];
      //type 02 
      //int[][] a ={{1,2,3,4},{5,6,7,8},{1,3,5,7}};
      // type 03 
      //int[][] a ={{1,2,3,4,5},{5,6,7},{1,3,5,7}};
      //type 04
      int[][] a =new int[3][];   //it is ok  
      a[0] =new int[5];
      a[1] =new int[3];
      a[2] =new int[4];


      /*
      a[0][0]  a[0][1]  a[0][2]  a[0][3]
      a[1][0]  a[1][1]  a[1][2]  a[1][3]
      a[2][0]  a[2][1]  a[2][2]  a[2][3]
      */
      for(int i=0;i<a.length;i++){  
        for(int j=0;j<a[i].length;j++){
          System.out.print(a[i][j]+"\t");
        }
        System.out.println();
      }
       
       System.out.println("---------1---------");
        
       //defalut is 0  0 0 0 0 
       System.out.println("---------2---------");
       
       System.out.println("---------3--------");
   }
}