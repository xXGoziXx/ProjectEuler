
public class sumSquareDifference {

	public static void main(String[] args) {
		int sumSquare = sumSquare(1,100);
		int squareSum = squareSum(1,100);
		int difference = Math.abs(squareSum - sumSquare);
		System.out.println(difference);
	}
	public static int sumSquare(int first, int end){
		int sum = 0;
		for(int i = first;i<=end;i++){
			sum += (int) Math.pow(i,2);
		}
		return sum;
	}
	public static int squareSum(int first, int end){
		int sum = 0;
		for(int i = first;i<=end;i++){
			sum += i;
		}
		sum = (int) Math.pow(sum, 2);
		return sum;
	}
}
