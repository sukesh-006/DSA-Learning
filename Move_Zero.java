class Move_zero{
	public static void main (String [] args){
		int[] arr = {0,20,0,30,15,1};
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[count]=arr[i];
				count++;
			}
			}
		while(count<arr.length){
			arr[count]=0;
			count++;
		}
		for (int x : arr) {
            System.out.print(x + " ");
        }
		
		
		
	}
}