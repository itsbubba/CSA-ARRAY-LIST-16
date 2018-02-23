//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 1/17/16
//Class - 3rd Period 
//Lab  - Array Lists

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouseRunner
{
	public static void main( String args[] )
	{
		System.out.println(ArrayListFunHouse.getListOfFactors(9));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(23));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(50));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(100));
		
		System.out.println(ArrayListFunHouse.getListOfFactors(762));
		
		System.out.println();
		System.out.println("Orginal List");	
			
		Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		List<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );
		
		System.out.println( list );
		ArrayListFunHouse.keepOnlyCompositeNumbers( list );
		System.out.println("Composite List");
		System.out.println(ArrayListFunHouse.keepOnlyCompositeNumbers(list));
	}
}