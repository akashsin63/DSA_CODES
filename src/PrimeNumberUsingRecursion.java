
public class PrimeNumberUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if (isPrime(10,2)) {
	System.out.print("number is Prime");
}else {
	System.out.print("number is  not Prime");
}
	}
	static boolean isPrime(int n, int i) {
		if(n%2==0) {
			return false;
		}
		if(i==n/2+1) {
			return true;
		}
		return isPrime(n, i+1);
	}

}
