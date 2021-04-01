package JavaLearning;

public class ContinueAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=0; k < 10; k++)
		{
			
			if(k>=5 && k <=8)
			continue;		// to continue or skip the current iteration and start/continue from next itration. Below line of code get skipped
								//means i need to print from 1-4 and then skip 5,6,7,8 and then print 9 number
			
			
			//break;		//to get out of loop and move forward to right next to the loop of code
			System.out.println(k);
		}
		
		
		
	}

}
