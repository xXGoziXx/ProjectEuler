import java.math.*;
public class pythagoreanTripleS {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		for(int i = 0;i<1000;i++){
			for(int j = 0;j<1000;j++){
				if(a+b+c == 1000){
					BigInteger answer = BigInteger.valueOf(a*b*((int)c));
					System.out.println(answer);
				}
				a = i;
				b = j;
				c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			}
		}
	}
}
