package javaOOPBasic;

import org.testng.annotations.Test;

public class javaBassicPractice {

	@Test
	public void whileLoop() //print 1 to 10
	{
		//while loop
		int i = 1;
		
		while(i<=10)
		{
			
			System.out.println(i);
			i++;
		}

	}
	
	@Test
	public void doWhileLoop() //print 20 to 30
	{
		int j = 20;
		
		do 
		{
			System.out.println(j);
			j++;
			
		}while(j<=30);
		
	}
	
	@Test
	public void nextedLoop()
	{
		for (int i = 1; i <=4; i++) //outer loop
		{
		System.out.println("outer loop started");
		
			for (int j = 1; j <=4; j++) //inner loop
			{
				System.out.println ("inner loop");
				//this runs 4 times each time outer loop executes, i.e 16 times
			
			}
		System.out.println("outer loop finished");
		}
	}
	
// To print below using nexted loop	
// 1 2 3 4
// 5 6 7
// 8 9
// 10
	@Test
	public void nextedLoopPyramid()
	{
		int k=1;
		for(int i = 0; i < 4; i++) //outer loop 
		{
			
			for(int j= 1; j<=4-i; j++)
			{
				System.out.print(k);
				System.out.print("\t"); //print space
				k++;
			}
			
			System.out.println(""); //goto to next line
			
		}
	}
	
	// To print below using nexted loop	
	// 1 
	// 2 3 
	// 4 5 6
	// 7 8 9 10
		@Test
		public void nextedLoopTriangle()
		{
			int k=1;
			for(int i = 1; i<=4; i++) //outer loop 
			{
				
				for(int j= 1; j<=i; j++)
				{
					System.out.print(k);
					System.out.print("\t"); //print space
					k++;
				}
				
				System.out.println(""); //goto to next line
				
			}
		}
	
		// To print below using nexted loop	
		// 1 
		// 1 2 
		// 1 2 3
		// 1 2 3 4
			@Test
			public void nextedLoopTriangle2()
			{
				//int k=1;
				for(int i = 1; i<=4; i++) //outer loop 
				{
					
					for(int j= 1; j<=i; j++)
					{
						System.out.print(j);
						System.out.print("\t"); //print space
						//k++;
					}
					
					System.out.println(""); //goto to next line
					
				}
			}
			
			// To print below using nexted loop	
			// 3
			// 6 9 
			// 12 15 18
				@Test
				public void nextedLoopTriangle3()
				{
					int k=3;
					for(int i = 1; i<=3; i++) //outer loop 
					{
						
						for(int j= 1; j<=i; j++)
						{
							System.out.print(k);
							System.out.print("\t"); //print space
							k+=3;
						}
						
						System.out.println(""); //goto to next line
						
					}
				}


}
