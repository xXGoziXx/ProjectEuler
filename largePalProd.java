
public class largePalProd {
	public static void main(String[] args) {
		int max = 100*100;
		System.out.println(largestProd(max));
	}
	public static String largestProd(int max){
		for(int i = 100;i<1000;i++){
			for(int j = 100;j<1000;j++){
				if((isPal(Integer.toString(i*j)))&& (i*j>max)){
					max = i*j;
				}
			}
		}
		return Integer.toString(max);
	}
	public static boolean isPal(String num){
		String pal = num;
		if(pal.length() == 1){
			return true;
		}
		else if(pal.length() == 2){
			if(pal.charAt(0) == pal.charAt(1)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(pal.charAt(0) == pal.charAt(pal.length()-1)){
				pal = pal.substring(1,pal.length()-1);
				return isPal(pal);
			}
			else{
				return false;
			}
			
		}
	}
}
