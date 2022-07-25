
public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums = {1,2,3,4,55,66,77};
     int target = 4;
     
     System.out.println(BS(nums,target, 0, nums.length-1));
	}
static int BS(int[] nums, int target , int l , int h ) {
	
	if (l>h) {
		return -1;
	}
	
		int mid = l+ (h-l)/2;
		if(nums[mid] == target) {
			return mid;
		}
		if (nums[mid]< target) {
			return BS(nums, target , mid+1, h);
		}else if(nums[mid]> target) {
			return BS(nums, target , l , mid -1);
		}
	
	return -1;
}
}
