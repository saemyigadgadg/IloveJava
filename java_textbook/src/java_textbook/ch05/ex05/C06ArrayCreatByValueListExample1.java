package java_textbook.ch05.ex05;

public class C06ArrayCreatByValueListExample1 {
	public static void main(String[] args) {
		int[] score = { 83, 90, 87 };
		
		System.out.println("score[] : " + score[0]);
		System.out.println("score[] : " + score[1]);
		System.out.println("score[] : " + score[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.printf("평균 : %.1f ", avg);
	}
}