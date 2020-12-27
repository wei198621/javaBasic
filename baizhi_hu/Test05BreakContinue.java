package day3;
public class Test05BreakContinue{
    public static void main(String[] args){
        
		
		// for 
		/*
		int result=0;
        int i=1;
		for(i=0;i<=100;i++){
			if(i==4) continue;
			result+=i;	
			System.out.println("hello World index is "+ i);
            if(i==8) break;			
		}
		//System.out.println("for result is : " + result );
		*/
		
		
		for(int i=1;i<=9;i++){
			 for(int j=1;j<=i;j++){
				 //System.out.print("i="+i+" j="+j+"\t\t");
				 if(i==3&&j==3){  break;  } 
				 System.out.print( j + "*" +i+ "="+i*j+"\t\t");
				
			 }		
				 System.out.println();		 
	    }				
    }
}