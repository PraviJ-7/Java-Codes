class CitizenOfIndia
{
	public static void showTheResponsiblity()
	{
		System.out.println ("invoked showTheResponsiblity");
		int age = 21;
		char gender = 'F';
		//AND or OR operators
		if(age >=10 && age< 16)
		{
			System.out.println("Responsiblity is going to School");
			return ;
		}
		
		if (age==16)
		{
			System.out.println("Responsiblity is going to College");
			
			return  ;
		}
		
		if(age ==21)
		{
			System.out.println("Responsiblity is to VOTE");
			if (gender == 'F' )
			{
				System.out.println("The Girl can Marry");
			}
		return  ;
		}
	}
}