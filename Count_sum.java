class Count_Sum{
public static void main (String[] args)
{
		int[] arr = {10,20,20,10,15,10};
		int x = 10;
		int count=0;
		for (int i=0; i<arr.length;i++){
			if(arr[i]==x){
				count++;
			}
		}
		System.out.println(count);



}}
