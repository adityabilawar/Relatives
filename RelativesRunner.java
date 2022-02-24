package Relatives;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		FileReader file = new FileReader(new File("C:\\Users\\adity\\eclipse-workspace\\AT Computer Science Honors\\src\\Relatives\\relatives.dat")); 
		BufferedReader br = new BufferedReader(file); 
		int numOfRelatives = Integer.parseInt(br.readLine());
		String r = "";
		for(int i =0; i < numOfRelatives; i++) {
			r+=br.readLine() + " ";
		}
		Relatives a = new Relatives();
		a.setPersonRelative(r);
		System.out.println(a);
		System.out.println();
		System.out.println(a.getRelatives(br.readLine()));
	}
}