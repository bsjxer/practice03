package prob4;

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
					Add add = new Add();
					add.setValue( lValue, rValue );
					System.out.println( ">> " + add.calculate() );
					break;
				case "-" :
					Sub sub = new Sub();
					sub.setValue( lValue, rValue );
					System.out.println( ">> " + sub.calculate() );
					break;
				case "*" :
					Mul mul = new Mul();
					mul.setValue( lValue, rValue );
					System.out.println( ">> " + mul.calculate() );
					break;
				case "/" :
					Div div = new Div();
					div.setValue( lValue, rValue );
					System.out.println( ">> " + div.calculate() );
					break;
				default :
					System.out.println("다시 입력 하세요.");
					break;
			}
		
		}
		
		scanner.close();
	}
}
