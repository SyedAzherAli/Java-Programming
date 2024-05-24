import java.util.Arrays;
public class clngAndFloor{
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14,15};
	
	int target = 11;
	System.out.println(Arrays.toString(arr));
	int[] arr1 = reversearray(arr);
	System.out.println(Arrays.toString(arr1));
	int ans = clngbnrysrc(arr1,target);
	System.out.println(ans);  
	}
	// methrod to find the cealing of the number with order agonostic binary search 
	static int clngbnrysrc(int[] array, int target) {
	int start = 0; 
	int end = array.length - 1; 
	

	//find the given array is accending or decending order 
	boolean isAsc;
	if(array[start] < array[end]) {
	isAsc = true;
	}
	else {
	isAsc = false;
	} 
	
	while(start <= end) {
	int mid = start + (end - start) / 2;
	
	if(target == array[mid]){
	return start;
	}
	
	if(isAsc) {
	    if(target > array[mid]) {
	      start =  mid + 1;
	      }
	    else{
	      end = mid - 1;
	      }
	      }
	      
	else {
	if(target < array[mid]) {
	start =  mid + 1;
	}
	else{
	end = mid - 1;
	}
	}
	
	}
	if(isAsc) {
	return start;
	}
	else {
	return end;
	}
	}

// methord to reverse and array from accendign order to decending order 
static int[] reversearray(int [] array) {
int start = 0;
int end = array.length - 1;
while(start <= end) {
int temp = array[start];
array[start] = array[end];
array[end] = temp;
start++;
end--;
}
return array;
	}
	}	
