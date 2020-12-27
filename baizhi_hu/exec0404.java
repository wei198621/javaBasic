package day4;
public class exec0404{
    public static void main(String[] args){
		 for(int abcd=1000; abcd<=9999; abcd++){
			 int ab = abcd / 100;
			 int cd =abcd % 100;
			 if((ab+cd)*(ab+cd)== abcd){
				 System.out.println(abcd);
			 }	 
		 }
    }
}