package finallyworks;

import java.util.Collections;
import java.util.LinkedList;

public class MyList {
	private LinkedList<String> list=null;
	{
	list=new LinkedList<String>();
	}
	public void getSortedList()
	{
		list.add("jeep");
		list.add("car");
		list.add("bus");
		list.add("lorry");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		MyList myList=new MyList();
		myList.getSortedList();
	}

}
