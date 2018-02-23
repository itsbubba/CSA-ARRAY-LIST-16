//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 1/17/16
//Class - 3rd Period
//Lab  - Array Lists

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> Factors;
		Factors = new ArrayList<Integer>();
		for(int j = 2; j < number; j++)
		{
			if(number%j==0)
			{
				Factors.add(j);
			}
		}
		return Factors;
	}
	
	public static ArrayList<Integer> keepOnlyCompositeNumbers( List<Integer> nums )
	{
		ArrayList<Integer> Composite;
		Composite = new ArrayList<Integer>();
		for(int j:nums)
		{
			for(int t=2; t<j; t++)
			{
				if(j%t==0)
				{
					Composite.add(j);
					t=j;
				}
			}
		}
		return Composite;
	}
}