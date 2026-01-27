package Enumeration;

import java.util.Arrays;

public class EnumMethods 
{
	public static void main(String[] args) 
	{
		EnumStructure es = EnumStructure.CONTINUE;
		System.out.println(EnumStructure.CONTINUE+"-"+es.getStatusCode());
		
		System.out.println(EnumStructure.PAGE_NOT_FOUND.getStatusCode());
		
		System.out.println(EnumStructure.INTERNAL_SERVER_ERROR.getStatusCode());
		
		EnumStructure[] ar = EnumStructure.values();
		System.out.println(Arrays.toString(ar));
		
		

	}

}
