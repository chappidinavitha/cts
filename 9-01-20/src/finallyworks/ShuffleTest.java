package finallyworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
	public static void main(String[] args)
	{
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(new Integer(1));
		l.add(new Integer(100));
		l.add(new Integer(-3));
		System.out.println(l);
		int index=Collections.binarySearch(1,1);
		if(index>=0)
		{
			System.out.println("found"+l.get(index));
		}
		else
		{
			System.out.println("not found"+index);
		}
		
	}

}
