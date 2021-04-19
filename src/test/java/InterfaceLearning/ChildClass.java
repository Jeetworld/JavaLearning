package InterfaceLearning;

public class ChildClass implements interfaceA , interfaceB {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interfaceA obj = new ChildClass(); //polymorphic ref of interface class
		
		ChildClass obj = new ChildClass();
		obj.common();

	}

	@Override
	public void common() {
		System.out.println("common method executed from child");		
	}

}
