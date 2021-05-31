package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
//		for(int i =0; i<=intArray.length; i++) {
//			result = result + intArray[i];
//		}
		// for문을 0에서 intArray의 length보다 i가 <=(작거나 같음)으로 돌리면 4번 반복하므로
		// 오류가 발생한다.
		for(int i =0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
