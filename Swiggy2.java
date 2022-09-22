class Swiggy2
{
	public static double takeOrders(String item) 
	{
		//String item = "Pastries";
		if( item == "Pizza")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 50;
		}
		if (item== "Burger")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 60;
		}
		if( item == "SouthIndian")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 70;
		}
		if (item== "Sandwitch")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 80;
		}
		if (item== "mosaranna")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 90;
		}
		if( item == "Pastries")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 50;
		}
		return 0.0; 
	}
	
	public static double takeOrders(String item, int quantity ) 
	{
		//String item = "Pastries";
		if( item == "Pizza")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 50 * quantity;
		}
		if (item== "Burger")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 60 * quantity;
		}
		if( item == "SouthIndian")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 70 * quantity;
		}
		if (item== "Sandwitch")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 80 * quantity;
		}
		if (item== "mosaranna")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 90 * quantity;
		}
		if( item == "Pastries")
		{
			System.out.println("ThankYou for ordering  :"+ item);
			return 50 * quantity;
		}
		return 0.0; 
	}
}