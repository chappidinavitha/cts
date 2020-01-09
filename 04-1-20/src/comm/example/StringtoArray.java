package comm.example;

public class StringtoArray {
	private char[] s;
	private String str;
	private char[] tempArray;
	private int count;
	
	{
	s=new char[26];
	}
	public char[] createArray()
	   {
		   for(int i=0;i<s.length;i++)
		   { 
			   s[i]=(char)('A'+i);
		   }
		   String str="Hello World";
		   return s;
	   }
	public void displayArray()
	   {
		   for(int i=0;i<s.length;i++)
		   {
			   System.out.println(s[i]+",");
		   }
	   }
	public void convertStringToArray(String str)
	
	{
	   this.str=str;
	   tempArray=str.toCharArray();
	}
	public void displayconvertedArray()
	{
		for(char ch:tempArray)
		{
			 System.out.println(ch);
		}
		
		}
	}
	

}
