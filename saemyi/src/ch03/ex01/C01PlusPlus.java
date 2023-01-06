package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i; //변수의 앞,뒤 상관없이 쓸 수 있지만 보통 변수 뒤에 쓴다.
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;//초기화
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;//초기화
		j = i++;
		/*이러한 형태가 되면 j, i값의 할당이 우선되고 ++가
		 * 나중에 적용되게 된다. 따라서 j의 값은 0이 된다.
		 */
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
