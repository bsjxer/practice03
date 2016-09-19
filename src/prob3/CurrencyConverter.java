package prob3;

public class CurrencyConverter {
	private static double rate; 
	
	public static double toDollar( double won ){ // 1:1118 = x:won
		double result = ( double )( won / rate );
		return result;
	}
	
	public static double toKRW( double dollar ){ // 1:1118 = dollar:x
		double result = ( double )( rate*dollar );
		return result;
	}
	
	public static void setRate( double r ){
		rate = r;
	}
}
