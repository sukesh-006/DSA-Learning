class Sumsubarray{
public static void main (String[] args){
		int[] arr= {2, 1, 5, 1, 3, 2};
		int k = 3;
		int windowsum=0;
		
		for (int i=0;i<k;i++){
			windowsum+=arr[i];
			
		}
		System.out.print(windowsum+" ");
		for(int i =k; i<arr.length;i++){
			windowsum=windowsum+arr[i]-arr[i-k];
			System.out.print(windowsum+" ");
		}
		
		
		
		
}
}