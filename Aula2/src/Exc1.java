
public class Exc1 {

	public static void main(String[] args) {
		decimaltoBinario(8);
	}
	
	public static void decimaltoBinario(int valor) {
		int resto;
		if(valor <= 2) {
			System.out.println(valor / 2);
			System.out.println(valor % 2);
			
		
		}else {
			decimaltoBinario (valor / 2);
			decimaltoBinario (valor % 2);
		}
	}
	
}
