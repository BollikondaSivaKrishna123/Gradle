package com.nt.ssit;
public class Airthematic {
public int Addition(int a,int b) throws ClassNotFoundException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("MySql CJ Driver is Loaded...");
	return a+b;
	
}

}
