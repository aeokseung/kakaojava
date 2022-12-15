package kakao.itstudy.datatype;

public class PrimitiveType {
	public static void main(String[] args) {
		//정수 저장하고 출력
		int x=100;
		System.out.println("x: "+x);
		
		//동일한 공간에서 동일한 이름의 변수를 2번 생성하면 에러
		//int x=100;
		int y=100;
		//hashcode가 같다는 뜻은 참조하는 위치가 같다는 뜻
		//변수에 저장하는 것이 아니라 변수의 참조를 저장
		//실제 데이터의 참조 위치를 확인
		System.out.println("x: "+System.identityHashCode(x));
		System.out.println("y: "+System.identityHashCode(y));
		//정수는 자신의 자료형보다 큰 범위의 데이터를 참조할 수 없음
		//int x=2000000000000000000;
		long L=200_000_000_000L;
		System.out.println("L: "+L);
		
		//16진수
		x=0x789;
		System.out.println("x: "+x);
		
		char ch='A';
		System.out.println("ch:"+ch);
		System.out.println(ch+1);
		
		ch='\uAC00';
		System.out.println("ch:"+ch);
		
		//int는 약 21억까지 저장 가능한데 연산의 결과가 21억을 넘어섬- overflow
		//이 경우 음수됨
		x=2000000000+1000000000;
		System.out.println(x);
		//양수됨
		x=-2000000000-1000000000;
		System.out.println(x);
		
		
		
	}

}
