class Speakers
{
	static String brand ;
	static String color ;
	static double price;
	static int minVolume;
	static int maxVolume= 5;
	static int currentVolume;
	
	static boolean isConnected ;
	
	//functionality
	public static boolean onOrOff()
	{
		
		System.out.println("inside onOrOff()");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Speaker is Turned On");
		}
		
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Speaker is Turned Off");
		}
		System.out.println("end of onOrOff()");
		return isConnected;
	}
	
	public static void increaseVolume()
	{
		
		System.out.println("inside increse Volume");
		if(isConnected == true)
		{
		if (currentVolume < maxVolume)
		{
			currentVolume = currentVolume+ 1;
			System.out.println("The Current Volume is :"+ currentVolume );
		}
		
		else
		{
			System.out.println("Max Volume is Reached....");
		}
		}
		else
		{
			System.out.println("Turn ON the Speaker");
		}
	}
	public static void decreaseVolume()
	{
		
		System.out.println(" Start of decrese Volume");
		if(isConnected == true)
		{
			if (currentVolume > minVolume)
			{
			currentVolume = currentVolume- 1;
			System.out.println("The Current Volume is :"+ currentVolume );
			}
		
		else
			{
			System.out.println("Min Volume is Reached....");
			}
		}
		else
		{
			System.out.println("Turn ON the Speaker");
		}
	}
	
}
/*TV, AC, WashingMachine, Mobile, Torch*/