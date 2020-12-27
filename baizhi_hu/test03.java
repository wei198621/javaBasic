package day3;
public class test03{
	public static void main(String[] args){
		/* 
		System.out.println("-------------01--------------");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int age =s.nextInt();
		if(age<6) System.out.println("baby");
		else if (age <12 ) System.out.println("yong");
		else System.out.println("old");
		*/
		
		System.out.println(" -------------02  switch--------------");
		
		java.util.Scanner s2=new java.util.Scanner(System.in);
		int score=s2.nextInt();
		switch(score){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4: System.out.println("bad..."); break;
			case 5: System.out.println("bad5"); break;
			case 6: System.out.println("bad6"); break;
			case 7: System.out.println("ok7"); break;
			case 8: System.out.println("good8"); break;
			case 9: System.out.println("prefect9"); break;
			default:System.out.println("input is wrong");break;
			
		}
		
		System.out.println("-------------03--------------");
		System.out.println("-------------01--------------");
		System.out.println("-------------01--------------");
		System.out.println("-------------01--------------");
		System.out.println("-------------01--------------");
		System.out.println("-------------01--------------");
		System.out.println("-------------01--------------");
		
		
	}
}