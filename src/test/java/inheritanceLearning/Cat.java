package inheritanceLearning;

public class Cat extends Animal {
	
	
	public void sound()
	{
		System.out.println("sound generated from catClass-subclass");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal catObj = new Animal(); //it calls the sound() of superclass
		Cat catObj = new Cat();		//if sound is defined in subclass then it call that first . Is no sound() mehtod in sublass and present in superclass then it calls superclass sound() method
		catObj.sound();

	}

}
