import java.util.*;
public class prime10001 {
	public static void main(String args[]){
		int array[] = new int [10001];
		Arrays.fill(array,0);
		int arrayCounter = 1;
		int primeCounter = 3;
		array[0] = 2;
		while(array[array.length-1] == 0){
			if(isPrime(primeCounter)){
				array[arrayCounter] = primeCounter;
				arrayCounter ++;
			}
			primeCounter += 2;
		}
		System.out.println(array[array.length - 1]);
	}
	public static boolean isPrime(int prime){
		for(int i = 2;i<prime; i++){
			if(prime%i == 0){
				return false;
			}
		}
		return true;
	}
}
