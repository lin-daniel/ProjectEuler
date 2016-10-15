public class ProjectEuler{

	public static void main(String[] args){
		System.out.println("\nProject Euler");
		id1();
		
	}

	static void id1(){
		int sum = 0;
		for(int a = 0; a < 1000; a++){
			if(a%3 == 0 || a%5 == 0){
				sum += a;
			}
		}
		System.out.println(sum);
	}

}