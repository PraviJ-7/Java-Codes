class TelevisionTester
{
	public static void main (String args[])
	{
		
		Television.brand= "OnePlus";
		Television.color= "Black";
		Television.price= 58999.00;
		
		System.out.println("\n");
		System.out.println(Television.brand);
		System.out.println(Television.color);
		System.out.println(Television.price);
		
		System.out.println("\n");
		System.out.println("The main method started");
		
		Television.onOrOff();
		System.out.println("\n");
		Television.onOrOff();
		
		
		
		System.out.println("The main method ended");
		
	}
	
}