
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int digit = 12345;
      System.out.println(SumNumber(digit,0));
	}
    static int SumNumber(int digit,int sum) {
    	
    	if (digit==0) {
    		return sum;
    	}
    	sum = digit%10 +sum;
    	return SumNumber(digit/10 , sum);
    }
}
