package kakao.itstudy.oop;

public class Student {
	public static String schoolName;
	//static 초기화
	static {
		System.out.println("logo print");
		// static 변수 사용 가능
		schoolName = "elementry";
		//인스턴스 속성 사용 불가
		//num = 1;
	}
	// 인스턴스 속성 생성
	// 접근 지정자가 public이므로 외부에서 인스턴스를 통해서 접근
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int mat;
}
