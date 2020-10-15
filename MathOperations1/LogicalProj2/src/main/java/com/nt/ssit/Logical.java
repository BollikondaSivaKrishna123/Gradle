package com.nt.ssit;
public class Logical {
public int findBig(int a,int b) throws ClassNotFoundException
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Oracle Driver is Loaded...");
	if(a>b)
		return a;
	else if(a<b)
		return b;
	else
		return 0;
}
}
