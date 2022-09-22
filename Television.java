class Television
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
			System.out.println("Television is Turned On");
		}
		
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Television is Turned Off");
		}
		System.out.println("end of onOrOff()");
		return isConnected;
	}
}
