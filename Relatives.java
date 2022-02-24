package Relatives;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>();

	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		for(int i = 0; i < personRelative.length; i+=2) {
			if(map.containsKey(personRelative[i])) {
				Set<String> b = new TreeSet<String>();
				b.addAll(map.get(personRelative[i]));
				b.add(personRelative[i + 1]);
				map.put(personRelative[i], b);
			}
			else {
				Set<String> b = new TreeSet<String>();
				b.add(personRelative[i + 1]);
				map.put(personRelative[i], b);
			}
		}









	}


	public String getRelatives(String person)
	{
		return person + " is related to " + map.get(person);
	}


	public String toString()
	{
		String output="";
		for(String a : map.keySet()) {
			 map.get(a).toArray();
			 output+= a + " is related to " ;
			for(int i = 0; i < map.get(a).toArray().length; i ++) {
				output+= map.get(a).toArray()[i] + " ";
			}
			output+="\n";
		}
		return output;
	}
}