//find the nth no in fibo using recursion
// base condition will be f(1)=1   f(0)=0;


public class FiboUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print(fibo(4));
	}
  static int fibo(int n) {
	  //base condition 
	  
	  if (n<2) {
		  return n;
	  }
	  return fibo(n-1) + fibo(n-2);
  }
}
//video by kunal @time 1:03:36 in the video