package java_textbook.ch05.ex05;

public class page158 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = (double) sum / scores.length;		
		System.out.println("평균: " + avg);
	}
}