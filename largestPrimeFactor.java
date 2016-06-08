public class largestPrimeFactor {
	public static void main(String[] args) {
		long num = 600851475143L;
		long temp = num;
		long lpf= 0;
		long div = 2;
		for(int i = 0;i<num/div;i++){
			if(temp % div == 0){
				temp /= div;
				lpf = div;
			}
			else{
				div ++;
			}
		}
		System.out.println(lpf);
	}
}
