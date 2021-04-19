package OverridingLearning;

public class LeaChildClass1 extends LeaParentClass1 {
	
	
	public void show()
	{
		
		System.out.println("child show method");
		
	}
	
	public void display()
	{
		
		System.out.println("child display method");
		
	}
	
	
	public void childKiClass()
	{
		
		System.out.println("child childkiClass method");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeaParentClass1 obj1 = new LeaChildClass1();
		obj1.display();			//calls child methods
		obj1.show();			//calls child methods due to defined in child class
		obj1.ParentKiClass();
		//obj1.childKiClass();	//it calls only parent class methods plus commons methods due to "LeaParentClass1 obj1 = new LeaChildClass1();" initalisation
		
		
		LeaChildClass1 obj2 = new LeaChildClass1();		//child class calls every method in parent as well as child class
		obj2.display();
		obj2.show();
		obj2.ParentKiClass();
		obj2.childKiClass();		
	}

}
