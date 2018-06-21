package assignment11;

import java.util.HashSet;
import java.util.Scanner;
public class sets {

	public static void main(String args [] ) {
		
HashSet<Integer> h1 = new HashSet<Integer>();

h1.add(1);
h1.add(7);
h1.add(2);
h1.add(4);
h1.add(9);
h1.add(10);
System.out.println(h1);
HashSet<Integer> h2 = new HashSet<Integer>();
h2.add(4);
h2.add(9);
h2.add(1);
h2.add(12);
System.out.println(h2);
h1.retainAll(h2);
System.out.println("intersection of set  : ");
System.out.println(h1);
		
	
	
		
	}
	
	
}
