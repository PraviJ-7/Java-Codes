class WashingMachine
{
	static String brand ;
	static String color ;
	static double price;
	
	static boolean isConnected ;
	
	public static boolean onOrOff()
	{
		System.out.println("inside onOrOff()");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("WashingMachine is Turned On");
		}
		
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("WashingMachine is Turned Off");
		}
		System.out.println("end of onOrOff()");
		return isConnected;
	}
}
/*TV, AC, WashingMachine, Mobile, Torch*/