//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 1/17/16
//Class - 3rd
//Lab  - ArrayLists

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	private String exprString;
	private ArrayList<String> expr;
	//add in instance variables

	public ExpressionSolver(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		exprString=s;
		expr=new ArrayList<String>();
		Scanner test=new Scanner(s);
		while(test.hasNext())
		{
			expr.add(test.next());
		}
			solveExpression();
	}

	public void solveExpression()
	{
		//PEMDAS
		boolean MD=true;
		boolean AS=true;
		while(MD)
		{
			if(expr.size()<=1)
			{
				break;
			}
			boolean finder=false;
			for(int j=1;j<expr.size(); j=j+2)
			{
				if(expr.get(j).equals("*")||expr.get(j).equals("/"))
				{
					int a=Integer.parseInt(expr.get(j-1));
					int b=Integer.parseInt(expr.get(j+1));
					int c=-1;
					if(expr.get(j).equals("*"))
					{
						c=a*b;
					}
					else if(expr.get(j).equals("/"))
					{
						c=a/b;
					}
					expr.remove(j);
					expr.remove(j-1);
					expr.set(j-1, Integer.toString(c));
					finder=true;
					break;
				}
			}
			if(!finder) MD=false;
		}
		while(AS)
		{
			if(expr.size()<=1)
			{
				break;
			}
			boolean finder=false;
			for(int j=1;j<expr.size(); j=j+2)
			{
				if(expr.get(j).equals("+")||expr.get(j).equals("-"))
				{
					int a=Integer.parseInt(expr.get(j-1));
					int b=Integer.parseInt(expr.get(j+1));
					int c=-1;
					if(expr.get(j).equals("+"))
					{
						c=a+b;
					}
					else if(expr.get(j).equals("-"))
					{
						c=a-b;
					}
					expr.remove(j);
					expr.remove(j-1);
					expr.set(j-1, Integer.toString(c));
					finder=true;
					break;
				}
			}
			if(!finder) AS=false;
		}
	}

	public String toString( )
	{
		return exprString+" = "+expr.get(0);
	}
}