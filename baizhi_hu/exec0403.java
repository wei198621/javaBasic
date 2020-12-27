package day4;
public class exec0403{
    public static void main(String[] args){
		int count=0;
        for(int a=0;a<=33;a++){                  //step2 cock biggest is  33   a<=100
		    int maxb=(100-3*a)/2;
			 count++;
            for(int b=0;b<=maxb;b++){            //step3 is  b<=100
                int c=100-a-b;                   //step1 chicken biggest is 100-a-b ;
				 count++;
                if((a+b+c==100)&&(a*3+b*2+c/3 ==100)&&c%3==0){
                     System.out.println(a+"\t"+b+"\t"+c);
                }
				 count++;
            }
        }
		System.out.println("count is : "+ count);
    }
}