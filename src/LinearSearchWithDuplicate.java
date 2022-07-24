import java.util.ArrayList;

public class LinearSearchWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = {3,2,1,9,5,18,18};
	       int target = 18;
	       search(arr,target,0);
	       System.out.println(list);
		}
	static ArrayList<Integer> list = new ArrayList<>();
		static int search(int[] arr, int target, int index) {
			// condition arr[index] == target than give that index
			
			//base condition 
			if (index==arr.length ) {
				
				return -1;
			}
			if (arr[index]== target) {
				list.add(index);
			}
			return search(arr, target, index+1);
		}
}