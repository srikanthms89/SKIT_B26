package com.tns.generics;

class Data_Generic<T>
{
	private T obj;

	public T getobj()
	{
		return obj;
	}

	public String toString()
	{
		return "Data_Generic [str=" + obj + "]";
	}

	public Data_Generic(T obj)
	{
		this.obj = obj;
	}
	}

public class App
{
	public static void main(String[] args)
	{
		Data_Generic<Integer> obj1 =new Data_Generic<Integer>(15);
       Integer out= obj1.getobj();
       System.out.println(out);
        
	}

}
