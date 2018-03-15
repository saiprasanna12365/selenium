package com.practies;

public class Vasu 
{
//variables
	int k=10;
	//Methods 
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		//object
		Vasu v=new Vasu();
		//accessing method by using object
		v.add();
		//accesing varibale by using object
		System.out.println(v.k);

	}

}
