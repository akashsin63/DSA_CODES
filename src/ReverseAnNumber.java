
public class ReverseAnNumber {

	public static void main(String[] args) {
		// T8ODO Auto-generated method stub
		reverseNumber(8421);
	}
	static int reverseNumber(int N) {
		int temp = N%10;
		if (temp==1) {
			return 1;
		}
		System.out.println(temp);
		return reverseNumber(temp);
		
	}

}
