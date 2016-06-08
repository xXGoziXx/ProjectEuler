
public class smallestMultiple {

	public static void main(String[] args) {
		int num = 20;
		while(!(isMult(num))){
			num++;
		}
		System.out.println(num);
	}
	public static boolean isMult(int num){
		for(int i = 1;i<=20;i++){
			if(num%i != 0){
				return false;
			}
		}
		return true;
	}
}
