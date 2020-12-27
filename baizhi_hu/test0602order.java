package day6;
public class test0602order{
   public static void main (String[] args){
       // 
       int[] a = {8,6,1,4,5,7};
       int n =a.length;

          System.out.println("origion is : ");
          for(int k=0; k< n;k++){
            System.out.print(a[k]+"\t");
          }
          System.out.println();  


         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(a[i]> a[j]){
                    int tmp =a[i];
                    a[i]=a[j];
                    a[j]=tmp;
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