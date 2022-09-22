class Identity
{
	static String name;
	static char gender;
	static int age;
	static long mobile;
	static String email;
	static String address;
	static String work;
	static int shirtSize;
	static int pantSize;
	static double weight;
	static double height;
	
	public static void identitys( )
	{
		
		System.out.println ("Name                    :" +name);
		System.out.println ("Name and age            :" +name + age);
		System.out.println ("Name and Email          :" +name + email);
		System.out.println ("Name and Mobile No.     :" +name + mobile );
		System.out.println ("Name and Gender         :" +name + gender);
		System.out.println ("Name and Address        :" +name + address);
		System.out.println ("Name , Email and Address:" +name + email  + address);
		System.out.println ("Name and Working        :" +name + work);
		System.out.println ("Name and ShirtSize      :" +name + shirtSize);
		System.out.println ("Name and PantSize       :" +name +  pantSize);
		System.out.println ("Name, Height and Weight :" +name + height + weight);
		
		
		
		
	}
}