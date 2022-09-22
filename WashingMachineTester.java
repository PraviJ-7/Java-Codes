class WashingMachineTester
{
	public static void main (String args[])
	{
		
		WashingMachine.brand= "Samsung";
		WashingMachine.color= "White";
		WashingMachine.price= 89009.00;
		
		System.out.println("\n");
		System.out.println(WashingMachine.brand);
		System.out.println(WashingMachine.color);
		System.out.println(WashingMachine.price);
		
		System.out.println("\n");
		System.out.println("The main method started");
		
		WashingMachine.onOrOff();
		System.out.println("\n");
		WashingMachine.onOrOff();
		
		
		
		System.out.println("The main method ended");
		
	}
	
}