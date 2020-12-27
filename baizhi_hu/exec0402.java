package day4;
public class exec0402{
    public static void main(String[] args){
		int count=0;
        for(int a=0;a<=100;a++){
			count++;
            for(int b=0;b<=100;b++){
				count++;
                for(int c=0;c<=100;c++){
                    //if((a+b+c==100)&&(a*3+b*2+c/3 ==100)){
                    if((a+b+c==100)&&(a*3+b*2+c/3 ==100)&&c%3==0){
                        System.out.println(a+"\t"+b+"\t"+c);
                    }
					count++;
                }
            }
        }
		System.out.println("count is : "+ count);
    }
}