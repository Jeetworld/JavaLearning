package JavaLearning;

import java.util.Arrays;

public class ArrayLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D Array
		String[] abc = new String[3];
		
		abc[0]= "The";
		abc[1] = "future";
		abc[2] = "is Here";
		
		System.out.println(abc.length); //length of array
		
		for(int i=0;i <abc.length; i++)
		System.out.println(abc[i]);
		
		
		//2D Array
		int row=2;
		int col=3;
		int[][] arr = new int[row][col];
		
		
		arr[0][0] = 2;
		arr[0][1] = 5;
		arr[0][2] = 26;
		arr[1][0] = 22;
		arr[1][1] = 200;
		arr[1][2] = 27;
		
		for(int l= 0 ; l < row ; l++)													//2D Array
		{
			for(int n= 0; n < col; n++)
			{
				System.out.print("   "+ arr[l][n]);
					
			}
			System.out.println("  ");
			
						
		}
		
		for(String K : abc)			//print with for each loop
			System.out.println("for each loop"+K);
		
			System.out.println("whole array print in one command"+Arrays.toString(abc));	//to print 1D Array
			System.out.println("2D array"+ Arrays.deepToString(arr));						//to print 2D Array
		
		
	}

}
