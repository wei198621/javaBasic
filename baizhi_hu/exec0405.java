package day4;
public class exec0405{
    public static void main(String[] args){
        /*		
		for(int abcd=1000; abcd<=9999; abcd++){
			 int ab = abcd / 100;
			 int cd =abcd % 100;
			 if((ab+cd)*(ab+cd)== abcd){
				 System.out.print("  ab:"+ab);
				 System.out.print("  cd:"+cd);
				 System.out.println("  abcd:"+abcd);
			 }	 
		 }
		 */
		 // 
		 for(int n=32;n<=99;n++){
			 int abcd=n*n;
			 int ab=abcd/100;
			 int cd =abcd%100;
			 if(ab+cd==n){
				 System.out.println(abcd);
			 }
		 }
    }
}