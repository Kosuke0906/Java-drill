import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static int array[] = {3,7,45,1,6,75,85,24,11,87,43};
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は入力者の任意です。

	    /**
         * 配列要素数分以下処理をループ
         * 1. 配列から要素(i)毎に「1～i」までをループ(indexをnとする)で除算して以下の条件に合致するものを取得※
         *    ※i から n を割った数字が0のもの
         * 2. 素数は1を除いて、1とその数字だけで割り切れるものの2つしかない為、「1」で取得した要素数が2以下のものを出力
         */
        Arrays.stream(array)
            .filter(i -> IntStream.rangeClosed(1, i).filter(n -> i % n == 0).count() <= 2)
            .forEach(System.out::println);
    }
}
