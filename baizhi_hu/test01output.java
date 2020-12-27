package day2;
public class test01output{
    public static void main(String[] args){
	    int a=10;
		System.out.println(a);
		a=20;
		System.out.println(a);
		byte b =50;
		long l=228;
		
		float f = 2.3f;
		//float f = 2.3;   // 错误
		double d =3.4d;
		double d2 =3.4;
		// System.out.println("1.1  ");
		System.out.println(2.0-1.1);    //0.8999999999999999
		
		char a3 ='A';
		char b3 = 'B';
		System.out.println(a3+b3);       //131
		
		//数据类型转化
		
		System.out.println("数据类型转化");
		int a4 =10;
		int b4=a4;
		System.out.println(b4);
		
		int a5=40000;
		short b5 =(short)a;
		System.out.println(b5);
		
		System.out.println("----");
		byte a6= 22;
         byte b6 =44;
        //byte c6 = a6+b6;  //错误: 不兼容的类型: 从int转换到byte可能会有损失
		byte c6 = (byte)(a6+b6) ;
		System.out.println(c6);
		
		System.out.println("--777777777--");		
		int a7=1;
		System.out.println(a7++);
		int b7=1;
		System.out.println(++b7);
		
		System.out.println("---88888888-");
		int a8=7; int b8=8;
		System.out.println("a:"+a8+";b:"+b8);
		a8=a8^b8;
		b8=a8^b8;
		a8=a8^b8;
		System.out.println("a:"+a8+";b:"+b8);
		
		
		
		
	}


}