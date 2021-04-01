package JavaLearning;

public class StaticLearning {
	
	
	public static int a = 10;
	public static int b = 20;		//Static methods and static vairables(declared in the same class)can access/invoke without creating object from Main static method.


	public static void staticMethod()
	{
		System.out.println("I am static method");
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethod();
		System.out.println("a="+a + "b="+b);
		
		

		
		
		
		
		
	}

}
