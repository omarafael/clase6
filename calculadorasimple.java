package calculadora;

public class calculadorasimple {

	public static double sumar(double n1, double n2) {
		double res=n1+n2;
		return res;
			
	}
	
	public static double restar(double n1, double n2) {
		double res=n1-n2;
		return res;
			
	}
	public static double dividir(double n1, double n2) {
		double n3=0;
		if (n2!=0) {
			double res=n1/n2;
			n3=res;
		}
		else {
			double res=-1;
			n3=res;
		}
				
		return n3;
			
	}
	public static double multiplicar(double n1, double n2) {
		double res=n1*n2;
		return res;
			
	}
	
	
	
}
