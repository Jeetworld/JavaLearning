package OverridingLearning;

public class HDFCBank extends RBIBank {
	
public void ROI()
	
	{
		System.out.println("HDFC ROI"+ 10);
			
	}

	public AMEX AMEXObject()			//AMEX Covariant concept --parent child relatiohnship. Return type is Classname
	{
		
		AMEX obj = new AMEX();
				return obj;				//whenever we return obj then return type of method is Classname
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank obj = new HDFCBank();
		obj.ROI();
		
		//OR
		//RBIBank obj2 = new HDFCBank();	--allow Parent reference to CHild class intthe same way --WebDriver driver = new ChromeDriver();	--click() method is declare in Webdriver interface but define it's functinality in ChromeDriver(), SafariDriver(), FireFoxDriver()
		//HDFCBank obj3 = new RBIBank();		--do not allow Child refernece to Parent Class
		

	}

}
