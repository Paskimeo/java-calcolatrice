package calcolatrice;

public class CalcoliHelper 
{

	private CalcoliHelper ()
	{
		
	}
	
	//somma
	public static int somma(int a, int b) 
	{

		return a+b;
	}
	
	// sottrazione
	public static int differenza(int a, int b) 
	{

		return a-b;
	}
	
	//moltiplicazione
	public static int moltiplicazione(int a, int b) 
	{

		return a*b;
	}
	
	//valore assoluto
	public static int valoreAssoluto(int a) 
	{
		if(a<0) {
			return -a;
		}else {
			return a;
		}
		
	}
	
	//valore minore tra 2 valore
	public static int valoreMinore(int a, int b) 
	{
		if(a<b) {
			return a;
		}else {
			return b;
		}
		
	}
	//valore maggiore tra 2 valore
	public static int valoreMaggiore(int a, int b) 
	{
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
	}
	
	
	
	
	//BONUS 1 BONUS 1 BONUS 1 BONUS 1
	
	//cambio del variabile da INT a DOUBLE, tramite l'utilizzo dell'OVERLOADING
	
	public static double somma(double a, double b) 
		{

			return a+b;
		}
		
		// sottrazione double
		public static double differenza(double a, double b) 
		{

			return a-b;
		}
		
		//moltiplicazione double
		public static double moltiplicazione(double a, double b) 
		{

			return a*b;
		}
		
		//valore assoluto double
		public static double valoreAssoluto(double a) 
		{
			if(a<0) {
				return -a;
			}else {
				return a;
			}
			
		}
		
		//valore minore tra 2 valore "double"
		public static double valoreMinore(double a, double b) 
		{
			if(a<b) {
				return a;
			}else {
				return b;
			}
			
		}
		//valore maggiore tra 2 valore "double"
		public static double valoreMaggiore(double a, double b) 
		{
			if(a>b) {
				return a;
			}else {
				return b;
			}
			
		}
		
	
}
