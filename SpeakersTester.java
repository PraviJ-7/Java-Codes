class SpeakersTester
{
	public static void main (String args[])
	{
		
		Speakers.brand= "Nothing";
		Speakers.color= "Glass White";
		Speakers.price= 2999.00;
		
		System.out.println("\n");
		System.out.println(Speakers.brand);
		System.out.println(Speakers.color);
		System.out.println(Speakers.price);
		
		System.out.println("\n");
		System.out.println("The main method started");
		
		//invokinng the 
		Speakers.onOrOff();
		System.out.println("\n");
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		
		System.out.println("\n");
		Speakers.onOrOff();
		
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		Speakers.increaseVolume();
		
		System.out.println("\n");
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		
		System.out.println("\n");
		Speakers.onOrOff();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		Speakers.decreaseVolume();
		
		System.out.println("\n");
		Speakers.onOrOff();
		
		
		
		System.out.println("The main method ended");
		
	}
	
}