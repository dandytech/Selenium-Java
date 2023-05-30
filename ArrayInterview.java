package javaOOPBasic;

import org.testng.annotations.Test;

public class ArrayInterview {

	@Test
	public  void minNum() {
		
		// Interview Question
		//Q1.  Print the minimun number from the below 3 by 3 matrix
		// 2 4 5
		// 3 6 7
		// 0 2 1
		
			//Logic to solve this, always assume the minimum value to be the first numner, i.e [0][0]

			int abc[][] = {{2,4,5},{3,6,7}, {0,2,1}};
			
			int min = abc[0][0];
			
			for(int i=0;i<3;i++)
			{ 
				for(int j=0;j<3;j++) 
				{
					if(abc[i][j]<min) //2
					{
						min = abc[i][j];
					}
						
				}
				
			}
			
			System.out.println(min);	
	}
	
	//Q2. print the maximum number
	@Test 
	public void maxNum() {
		//Logic to solve this, always assume the maximum value to be the first numner, i.e [0][0]

		int abc[][] = {{2,4,5},{3,6,7}, {0,2,1}};
		
		int max = abc[0][0];
		
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++) 
			{
				if(abc[i][j]>max) //2
				{
					max = abc[i][j];
				}
					
			}
			
		}
		
		System.out.println(max);	
	}
	
	//Q3. Get the minimum number and grab the column of the minimum number and print the maximum number of the column.
	@Test
	public void minColMax() {
		
		int abc[][] = {{2,4,5},{3,6,7}, {0,2,1}};
		int min = abc[0][0];
		int minCol = 0;
		
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++) 
			{
				if(abc[i][j]<min) //2
				{
					min = abc[i][j];
					minCol = j;
				}
					
			}
			
		} //end of outer loop
		int max = abc[0][minCol];
		int k = 0;
		while(k<3)
		{
			if(abc[k][minCol] > max)
			{
				max = abc[k][minCol];
			}
		
		k++;
		}
		
		System.out.println(max);
		
	}

}


