//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 1/17/16
//Class - 3rd
//Lab  - ArrayLists

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		ExpressionSolver test1=new ExpressionSolver("3 + 5");
		System.out.println(test1);
		
		ExpressionSolver test2=new ExpressionSolver("3 * 5");
		System.out.println(test2);
		
		ExpressionSolver test3=new ExpressionSolver("3 - 5");
		System.out.println(test3);
		
		ExpressionSolver test4=new ExpressionSolver("3 / 5");
		System.out.println(test4);
		
		ExpressionSolver test5=new ExpressionSolver("5 / 5 * 2 + 8 / 2 + 5");
		System.out.println(test5);
		
		ExpressionSolver test6=new ExpressionSolver("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		System.out.println(test6);

	}
}