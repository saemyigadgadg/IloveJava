package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know,";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long";}
		};
		System.out.println(msg);
		
		// yield: keword가 아니다. restricted identifier(제한자) 이다.
		int yield = 1;
		System.out.println(yield);
		//int switch = 1;
	}
}
