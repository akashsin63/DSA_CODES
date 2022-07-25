//https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class SumOfNaturalNumbers {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int N=5;
     System.out.println(naturalNumSum(N));
	}
     static int naturalNumSum(int N) {
    	 //base condition //
    	 //if it is 0 or 1 it sum will be 0 or 1;
    	 if(N<=1) 
    		 return N;
    	 
    	 //else it will just add (sum = N + (N-1)) till N =0;
    	 return N + naturalNumSum(N-1);
    	 
    	 
     }
}
