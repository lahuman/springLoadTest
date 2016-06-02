package kr.pe.lahuman;

public class SimpleCalculation {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(new SimpleCalculation().add(5, 2));
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
	public int add(int a, int b){
		return a+b;
	}
	public int minus(int a, int b){
		return a-b;
	}

}
