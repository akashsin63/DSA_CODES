
public class PrintNtoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    fun(5);
    System.out.println("####################");
    funReverse(5);	
	}
	 static void fun(int n ) {
		if (n==0) {
			return ;
		}
		System.out.println(n);
		fun(n-1);
	 }// what if we need to print the reverse 1,,2,3,4,5 
	 static void funReverse(int n ) {
		 if (n==0) {
			 return ;
		 }
		 funReverse(n-1);
		 System.out.println(n);
	 }
	}


