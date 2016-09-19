package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){ 
		char[] sentence = str.toCharArray(); // String 문자열을 char 배열로 바꾸는 코드
		for( int i = 0; i < sentence.length / 2; i++ ){ // 바꾼 char 배열을 순서를 바꾸는 코드. 
			char temp = sentence[ i ];					
			sentence[ i ] = sentence[ sentence.length - i - 1 ];
			sentence[ sentence.length - i - 1 ] = temp;
		}
		
		return sentence;
	}
	
	public static void printCharArray(char[] array){
		for( int i : array ){
			System.out.print( (char)i );	// 출력값이 int값이기 때문에 char로 바꾸는 코드
		}
		System.out.println();
	}
}
