package kakao.itstudy.controlstatement;

import java.util.Scanner;

public class PassIf {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("write id: ");
			String id = sc.nextLine();
			System.out.print("write pw: ");
			String pw = sc.nextLine();
			//문자열은 생성방법에 따라 다른 인스턴스가 될 수 있어서 값이 동일한지 비교할 때
			//==말고 equals 메서드를 이용해서 동일성 여부를 비교
			if (id.equals("root") && pw.equals("1234")) {
				System.out.println("중식");
			} else if{
				System.out.println("한식");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
