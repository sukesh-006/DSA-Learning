class sum{
public static void main (String[] args){
		int[] marks={10,20,30,4,50,60,70,80,90,100};
		int sum = 0;
		for (int i =0; i<marks.length; i++){
			sum = marks[i]+sum;
		}
System.out.println("Sum of all elements is "+sum);}

}