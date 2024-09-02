
public class Exc2 {
	
	public static void main(String[] args) {
		System.out.println(potencia(10,10));
		
		}
	public static long potencia(int base, int pot) {
		if(pot ==0) {
			return 1;
		}
			
		else {
			return base * potencia (base, pot -1);
	}
		
	}
}
