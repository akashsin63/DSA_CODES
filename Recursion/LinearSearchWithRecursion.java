
public class LinearSearchWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {3,2,1,9,5,18};
       int target = 18;
       System.out.println(search(arr,target,0));
	}
	static int search(int[] arr, int target, int index) {
		// condition arr[index] == target than give that index
		
		//base condition 
		if (index==arr.length ) {
			
			return -1;
		}
		if (arr[index]== target) {
			return index;
		}
		return search(arr, target, index+1);
	}

}
