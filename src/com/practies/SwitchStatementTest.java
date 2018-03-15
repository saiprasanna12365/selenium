package com.practies;

public class SwitchStatementTest
{
	public static void main(String[] args)
	{
		int weekNumber=9;
		switch (weekNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("TuesDay");
			break;
		case 3:
			System.out.println("WednessDay");
			break;
		case 4:
			System.out.println("ThursDay");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out Of Range");
			break;
		}

	}

}
