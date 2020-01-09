package comm.example;

public class Tester {

	public static void main(String[] args) {
	      StringtoArray myarray=new StringtoArray();
	     // myarray.createArray();
	      //myarray.displayArray();
	     // myarray.convertStringToArray("Hello World");
	      //myarray.displayconvertedArray();
	      int[] myarray1= {1,2,3,4,5,6};
	      int[] hold= {10,9,8,7,6,5,4,3,2,1};
	      System.arraycopy(myarray1,0,hold,0,myarray1.length);
	      for( int a:hold)
	      {
	    	  System.out.println(a);
	      }


	}

}
