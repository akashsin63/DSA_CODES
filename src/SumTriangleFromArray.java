
public class SumTriangleFromArray {
	public static void main(String[] args) {
    /*     int[] Arr = {1, 2, 3, 4, 5};
         
         SumArray task = new SumArray();
 		// Given array elements
 		int[] arr = {
 			1 , 4 , 3 , 1 , 6 , 5
 		};
 		task.SumArr(arr, 0);
	}
	public static void SumArray(int[] Arr, int index){
		
		int[] latestArr = new int[index-1];
		
		if (index==1) {
			return ;
		}
		if (index>Arr.length-1) {
			return ;
		}
		for(int i=0; i<Arr.length-1; i++) {
			latestArr[i]= Arr[index]+Arr[index+1];
		}
		SumArray(Arr, index+1);
		for (int i=0; i<Arr.length-1; i++) {
			System.out.print(" " + latestArr[i]);
		}System.out.print("\n");  */
		
		int[] nums = {1,2,3,4,5};
		 triangularSum( nums) ;
	}
	public static int triangularSum(int[] nums) {
		int x=0;
		if(nums.length==1){
		return nums[0];
		}
		else{
		int []newNums =new int[nums.length-1];
		for(int i=0;i<nums.length-1;i++){
		newNums[i]=(nums[i]+nums[i+1]);
		}
		x = triangularSum(newNums);
		for(int i=0; i<nums.length-1; i++) {
			System.out.print(" "+ newNums[i] );
		}System.out.print("\n");
		}
		
		return x;
		}
}
