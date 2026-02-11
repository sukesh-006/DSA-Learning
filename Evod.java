class Evod{
public static void main(String[] args){
		int[] roll = {2,3,4,5,6,7,8,9};
		int even = 0, odd = 0;
		for(int i =0; i<roll.length;i++){
			if(roll[i]%2==0){
			even++;
			}
			else
				odd++;
		}
		System.out.println("Even Numbers are totally "+even);
		System.out.println("odd Numbers are totally "+odd);

}
}