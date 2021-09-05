package answer;

public class Pyramids {

	public static void main(String[] args) {
//		Qestion ９段の星（⭐️）で出来たピラミッドを作成しましょう。
		// △:減ってく
		// ⭐:増えてく
		// ※イメージ
		// △△△△△△△△⭐
		// △△△△△△△⭐⭐
		// △△△△△△⭐⭐⭐
		// △△△△△⭐⭐⭐⭐
		// △△△△⭐⭐⭐⭐⭐
		// △△△⭐⭐⭐⭐⭐⭐
		// △△⭐⭐⭐⭐⭐⭐⭐
		// △⭐⭐⭐⭐⭐⭐⭐⭐
		// ⭐⭐⭐⭐⭐⭐⭐⭐⭐

		// 引数：段数
		pyramid(9);
	}

	/**
	 * @param steps 段数
	 */
	public static void pyramid(int steps) {
		for (int i = 0; i < steps; i++) {
			System.out.println("");
			for (int j = 0; j < steps - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("⭐");
			}
		}
	}
}
