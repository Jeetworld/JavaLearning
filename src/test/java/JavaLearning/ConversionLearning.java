package JavaLearning;

public class ConversionLearning {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
			
		//-----------------------------INT TO STRING------------------------------------
		int i = 10;
		
		String s1= String.valueOf(i);				//first method to convert Int into String
		System.out.println("value of String method 1= "+s1);
		
		
		
		String s2 =Integer.toString(i);				//second method to convert Int into String
		System.out.println("value of String method 2= "+s2);
		
		
		String s3 = String.format("%d", i);
		System.out.println("value of String method 3= "+s3);
		
		
		//-----------------------------STRING TO INT------------------------------------
		String s = "200";
		
		int i1= Integer.parseInt(s);
		System.out.println("value of Int method 1= "+i1);
		
		
		Integer i2 = Integer.valueOf(s);
		System.out.println("value of Int method 2= " +i2);
		
		
		
	}

}
