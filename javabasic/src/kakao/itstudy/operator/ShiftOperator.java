package kakao.itstudy.operator;

public class ShiftOperator {
	public static void main(String[] args) {
		int x = -29;
		System.out.println(x << 2);// 한 번 밀 때 마다 곱하기 2
		System.out.println(x >> 3);// 한 번 밀 때 마다 나누기 2
		System.out.println(x >>> 3);// 부호 변경2
		System.out.println(x << 33);//32로 나눈 나머지 만큼 밀기
	}

}
