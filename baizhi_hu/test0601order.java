package day6;
public class test0601order{
   public static void main (String[] args){
       // 
       int[] a = {8,6,1,4,5,7};
       int n =a.length;

          System.out.println("origion is : ");
        for(int k=0; k< n;k++){
            System.out.print(a[k]+"\t");
          }
          System.out.println();  

       for(int i=0;i<n-1;i++){
          for(int j=0;j<n-1-i;j++){

             if(a[j]>a[j+1]){
                   int tmp = a[j];
                   a[j]=a[j+1];
                   a[j+1]=tmp;
               }
          }        
       }

          System.out.println("order result is :");
        for(int k=0; k< n;k++){
            System.out.print(a[k]+"\t");
          }    
          System.out.println();    
       
   }
}