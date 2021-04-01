package JavaLearning;

public class TryCatchLearning {

	public static void main(String[] args) {
		
		
		try {
		
		int i =10;
		
		int c= 10/0;
		
			System.out.println(c);
			System.out.println("error ocuured by Kamal");
			}
		
		catch(Throwable t)
		{
			
			System.out.println("calling from catch block");		//if try block's error statment is executed then:
			//Failed Test case SC code written					//--right below code to the error statment is not executed
																//--then catch block is executed
																//if try blocl's error statment is not executed then flow can never come in Catch block
																//Throwable is baseclass for exeception and error class
																//finally block is always get executed either there is error statment is present or not in try block
		}
		
		finally
		{
			
			System.out.println("calling from finally block");
			
			
		}
		
		
	}

}
