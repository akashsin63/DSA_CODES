//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class PrintNWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberWithoutLoop(1,5);
	}
	public static void NumberWithoutLoop(int initial, int last) {
	 if ( initial<=last) {
		 System.out.println(initial +" ");
		NumberWithoutLoop(initial+1 , last);			
		}

	}
}