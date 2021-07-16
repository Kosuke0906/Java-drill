package answer;

public class PrimeNumber {
	public static int array[] = { 3, 7, 45, 1, 6, 75, 85, 24, 11, 87, 43 };

	public static void main(String[] args) {
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は入力者の任意です。

		// Answer
		// 素数の定義：1より大きい整数で、1と自分自身でしか割り切れない数(→つまり1全整数徐算したら2回だけ割れるやつ)
		// 要素1:1より大きい整数
		// 要素2:1と自分自身でしか割り切れない数
		// ロジック：1より大きい整数、かつ、「1〜array[i]」の各整数で剰余算を行って剰余0となるのは2回だけ。
		primeNumber(array);
	}

	/**
	 * @param array
	 */
	public static void primeNumber(int[] array) {
		// 割り切れた回数
		int surPlusCount;

		for (int i = 0; i < array.length; i++) {
			// 初期化
			surPlusCount = 0;

			// 「1〜array[i]」の各整数の剰余算
			for (int j = 1; j <= array[i]; j++) {
				if (array[i] % j == 0) {
					surPlusCount++;
				}
			}

			// 1より大きい整数かつ割り切れた回数が2回である場合：素数
			if (array[i] > 1 && 2 == surPlusCount) {
				System.out.println(array[i] + ":素数です");
				continue;
			} else {
//				System.out.println(array[i] + ":素数じゃない");
				continue;
			}

		}
	}
}
