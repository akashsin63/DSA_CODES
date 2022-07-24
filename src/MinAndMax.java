//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinAndMax {
 public static void main(String[] arg) {
	 int arr[] = {1, 4, 45, 6, 10, -8};
	 MinMAX(arr,0, 0, 0);
 }
 public static int MinMAX(int[]arr, int index, int min, int max) {
	if (arr.length==1) {
		System.out.println(arr[index] +" "+ arr[index]);
	}
	if(arr.length<index) {
		System.out.println(min +" "+ max);
	}
	 
	 if(arr[index]<arr[index+1]) {
		 min=arr[index]; 
		 max=arr[index+1];
		 System.out.println(min + " " + max);
	 }
	 return MinMAX(arr, index +1 , index+1, index);
 }
}
