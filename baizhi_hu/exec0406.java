package day4;
public class exec0406{
    public static void main(String[] args){
		System.out.println("pls intput a num :");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int n = sc.nextInt();
		// int n=8;
		
		System.out.println("=====leo self ======");
		for(int i=n;i>0;i--){
			for(int j=n;j>0;j--){
				int tmp= (i-j)+1;
				if(tmp<1){ tmp =1;}
				System.out.print(tmp);
			}
			System.out.println();
		}
		System.out.println("======teache teach =====");
		for(int i=0;i<n;i++){
			for(int tmp=1;tmp <=i;tmp++){
				System.out.print(1+"\t");
			}
			for(int j=1;j<=n-i;j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
    }
}