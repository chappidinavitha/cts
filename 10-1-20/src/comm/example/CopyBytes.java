package comm.example;

import java.io.*;

public class CopyBytes {
	public static void main(String[] args)throws IOException
	{
		File inputFile=null;
		File outputFile=null;
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			outputFile=new File("outagain");
			inputFile=new File("myfile");
			
			in=new FileInputStream(inputFile);
			out=new FileOutputStream(outputFile);
			int b;
			while((b=in.read())!=-1)
			{
				System.out.printf("%x\n",b);
				out.write(b);
			}
			System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");

		} finally {
			in.close();
	        out.close();
		}
			
		}
		
	}
 

