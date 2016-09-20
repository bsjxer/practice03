package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와  String 클래스의 split 함수를 사용합니다. 
		// left value + operator + righ value , split으로 분리.
		
		Scanner scanner = new Scanner( System.in );
		
		while (true) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) == true ){
				break;
			}
			
			String[] tokens = expression.split( " " );
			int lValue = Integer.parseInt( tokens[ 0 ] );
			String operator = tokens[ 1 ];
			int rValue = Integer.parseInt( tokens[ 2 ] );
			
			switch( operator ) {
				case "+" : 
					Arith arith = new Add();
					arith.setValue( lValue, rValue );
					System.out.println( ">> " + arith.calculate() );
					break;
				case "-" :
					Arith arith2 = new Sub();
					arith2.setValue( lValue, rValue );
					System.out.println( ">> " + arith2.calculate() );
					break;
				case "*" :
					Arith arith3 = new Mul();
					arith3.setValue( lValue, rValue );
					System.out.println( ">> " + arith3.calculate() );
					break;
				case "/" :
					Arith arith4 = new Div();
					arith4.setValue( lValue, rValue );
					System.out.println( ">> " + arith4.calculate() );
					break;
				default :
					System.out.println("다시 입력 하세요.");
					break;
			}
		
		}
		
		scanner.close();
	}
}
