
public class fibonacciNumbers {
	public static void main(String[] args) {
		int fibN = 0, temp1 = 1, temp2 = 0, sum = 0;
		while(fibN<=4000000){
			if(fibN % 2 == 0){
				sum += fibN;
			}
			fibN = temp1 + temp2;
			temp2 = temp1;
			temp1 = fibN;
		}
		System.out.println(sum);
	}
}
