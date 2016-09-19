package prob4;

public class Sub {
	int a;
	int b;
	public void setValue( int a, int b ){
		if( b < a ){
			int temp = a;
			a = b;
			b = temp;
		}
		
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a-b;
	}
}
