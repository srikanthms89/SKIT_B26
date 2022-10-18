package com.tnsif.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args)
	{

			Set<Integer>  obj= new TreeSet<>();
			for(int i=30;i>0;i--)
			{
				obj.add(i);
				  
			}
			
			for(int i:obj)
			{
				System.out.println(i);
			}
				
			
	        
	
	}
}



