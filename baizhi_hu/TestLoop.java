package day3;
public class TestLoop{
    public static void main(String[] args){
        int result=0;
        int i=1;
		/*  //while  
        while(i<=100){
            result+=i;
            i++;
        }
		System.out.println("while result is :" + result);
		*/
        /*  // do while 
		do{
			result+=i;
            i++;
		}while(i<=100);
		System.out.println("do while result is :" + result);
		*/
		
		// for 
		for(i=0;i<=100;i++){
			result+=i;			
		}
		System.out.println("for result is : " + result );
		
		
		
    }
}