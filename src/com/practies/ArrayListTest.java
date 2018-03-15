package com.practies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args)
	{
	
List<String>  s=new ArrayList<>();
s.add("Selenium");
s.add("QTP");
s.add("ETL");
s.add("Vasu");
s.add("sel");
System.out.println(s.size());
for (int i = 0; i < s.size(); i++) 
{
	System.out.println(s.get(i));
}

	}

}
