public class multiple3_5{
	public static void main(String args[]){
	int sum = 0;
		for(int i = 0;i<1000;i++){
			if(i%3==0){
				sum += i;
			}
			else if(i%5==0){
				sum += i;
			}
			else{
				
			}
		}
		System.out.println(sum);
	}
}