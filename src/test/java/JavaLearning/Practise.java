package JavaLearning;

import java.util.Scanner;

public class Practise {
	
	
	public String conversionInteger2String(int i)
	{
		
		String s= String.valueOf(i);
		return s;
		
	}
	
	public int conversionString2Integer(String s)
	{
		
		Integer i= Integer.valueOf(s);
		return i;
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("Please enter the integer");
		Scanner sc = new Scanner(System.in);
		int numb1= sc.nextInt();
		
		Practise obj = new Practise();
		String sResult = obj.conversionInteger2String(numb1);
		
		System.out.println("Integer after conversion"+sResult);
		
		System.out.println("Please enter the String");
		String str= sc.next();
		
		int iResults= obj.conversionString2Integer(str);
		System.out.println("String after conversion ="+iResults);
		
		
	}

}
