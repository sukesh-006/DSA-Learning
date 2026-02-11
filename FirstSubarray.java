class FirstSubarray{
public static void main(String[] args){
		int[] arr = {1, 4, 2, 3, 1, 1, 5};
		int target = 6;
		int start=0;
		int end=0;
		int windowsum=0;
		for(end=0;end<arr.length;end++){
			windowsum+=arr[end];
			while(windowsum > target){
			windowsum-=arr[start];
			start++;
					
		}
		if (windowsum==target){
			System.out.print(arr[start]);			
			System.out.print(arr[end]);
			break;
		}
		}
		
		
}
}