package com.forloop;


public class For 
{
	public static void main(String[] args) 
	{
		//int count = 0;
		int summation = 0;
		for (int i = 1; i < 11; i++) 
		{
			if(i%2==1)
			{
				summation = summation +i;
				//count = count + 1;
				
			}
			
		}
		//System.out.println(count);
		System.out.println(summation);
	}
}

