package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
			
		switch(operation)
		{
		case "+" : Arithmetic add = new Add(); Oper(add, a,b); break;
		case "-" : Arithmetic sub = new Sub(); Oper(sub, a,b); break;
		case "*" : Arithmetic mul = new Mul(); Oper(mul, a,b); break;
		case "/" : Arithmetic div = new Div(); Oper(div, a,b); break;
		default : System.out.println("잘못된 사칙연산 입니다.");
		}
	}
	
	public static void Oper(Arithmetic ari, int a,int b)
	{
		System.out.println(ari.calculate(a, b));
	}
}
