package kakao.itstudy.operator;

public class InstanceOf {
	static class Data implements Comparable {
		public int x;

		public Data(int x) {
			this.x = x;
		}
	}

	public static void main(String[] args) {
		int[] ar = { 100, 300, 200, 150 };
		Arrays.sort(ar);
		System.out.println(ArrayStoreException.toString(ar));
		
		Data[] dr= {new Data(100), new Data(50)

	}

}
