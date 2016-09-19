package prob3;

public class Prob3 {

	public static void main(String[] args) {
		CurrencyConverter.setRate( 1118.70 );
		
		double dollar = CurrencyConverter.toDollar( 1000000 );
		System.out.println( "백만원은 " + dollar + "달러입니다." );
		
		double krw = CurrencyConverter.toKRW( 100 );
		System.out.println( "백달러는 " + krw + "원 입니다." );		
	}

	
	// 여기서 하면 안되는 이유!!!
//	public class CurrencyConverter {
//		private static double rate; 
//		
//		public static double toDollar( double won ){ // 1:1118 = x:won
//			double result = ( double )( won / rate );
//			return result;
//		}
//		
//		public static double toKRW( double dollar ){ // 1:1118 = dollar:x
//			double result = ( double )( rate*dollar );
//			return result;
//		}
//		
//		public static void setRate( double r ){
//			rate = r;
//		}
//	}
	

}
