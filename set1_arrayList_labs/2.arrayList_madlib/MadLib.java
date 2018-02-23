//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 1/17/16
//Class - 3rd Period 
//Lab  - Array Lists

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private ArrayList<String> dankstory;
	
	public MadLib()
	{
		
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		dankstory = new ArrayList<String>();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext())
			{
				dankstory.add(file.next());
			}
		}
		catch(Exception e)
		{
			System.out.println("Well this is awkward...");
		}
		
	}

	public void loadNouns()
	{
		nouns=new ArrayList<String>();
		try{
		Scanner nounScanner = new Scanner(new File("nouns.dat"));
		while(nounScanner.hasNext())
		{
			nouns.add(nounScanner.next());
		}
		   }
		catch(Exception e)
		{
			System.out.println("The Nouns have refused to load!");
		}	
		
	}
	
	public void loadVerbs()
	{
		verbs=new ArrayList<String>();
		try{
		Scanner verbScanner = new Scanner(new File("verbs.dat"));
		while(verbScanner.hasNext())
		{
			verbs.add(verbScanner.next());
		}
		   }
		catch(Exception e)
		{
			System.out.println("The Verbs have refused to load!");
		}
	}

	public void loadAdjectives()
	{
		adjectives=new ArrayList<String>();
		try{
		Scanner adjectiveScanner = new Scanner(new File("adjectives.dat"));
		while(adjectiveScanner.hasNext())
		{
			adjectives.add(adjectiveScanner.next());
		}
		   }
		catch(Exception e)
		{
			System.out.println("The Adjectives have refused to load!");
		}
	}

	public String getRandomVerb()
	{
		int rando = (int) (Math.random()*verbs.size());
		String verb = verbs.get(rando);
		verbs.remove(rando);
		return verb;
	}
	
	public String getRandomNoun()
	{
		int rando = (int) (Math.random()*nouns.size());
		String noun = nouns.get(rando);
		nouns.remove(rando);
		return noun;
	}
	
	public String getRandomAdjective()
	{
		int rando = (int) (Math.random()*adjectives.size());
		String adjective = adjectives.get(rando);
		adjectives.remove(rando);
		return adjective;
	}		

	public String toString()
	{
		String returnvalue="";
		String jaden="";
		for(int j=0;j<dankstory.size();j++)
		{
			jaden=dankstory.get(j);
			if(jaden.equals("#"))
			{
				dankstory.set(j, getRandomNoun());
			}
			else if(jaden.equals("@"))
			{
				dankstory.set(j, getRandomVerb());
			}
			else if(jaden.equals("&"))
			{
				dankstory.set(j, getRandomAdjective());
			}
		}
		for(int j=0;j<dankstory.size(); j++)
		{
			returnvalue=returnvalue+dankstory.get(j)+" ";
		}
	   return returnvalue;
	}
}