package JavaLearning;

public class StringLearning {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "way ";
		String s2 = "To";
		String s3 = "Future";
		
		String s4 = s1+    s2+s3;
		
		System.out.println(s4);
		
		int numb1 = 10;
		int numb2 = 5;
		
		System.out.println(numb1 + numb2); //15 output
		System.out.println(numb1+numb2+"after"); //15after 
		System.out.println("before"+numb1 + numb2 + "after"); //before105after ---string agar pehele aye toh sabko string consider krega
		System.out.println("before"+(numb1 + numb2) + "after"); //before15after -- it uses bodmas
		

	}

}
