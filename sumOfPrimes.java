import java.math.*;
import java.util.Arrays;

public class sumOfPrimes {

	public static void main(String[] args) {
		boolean array[] = new boolean[2000000];
		Arrays.fill(array,true);
		array[0] = false;
		array[1] = false;
		//fills an array with true and false depending on whether the index is a prime number or not
		for(int i = 2;i<array.length;i++){
			if(array[i] == true){
				for(int j = i+i;j<array.length;j+=i){
					array[j] = false;
				}
			}
		}
		int prime = 1;
		BigInteger sum = BigInteger.valueOf(0);
		while(prime<2000000){
			if(array[prime-1]){
				sum = sum.add(BigInteger.valueOf(prime-1));
			}
			prime++;
			
		}
		System.out.println(sum);
	}
}
