import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Qestion ９段の星（⭐️）で出来たピラミッドを作成しましょう。
        /**
         * 1. 段数(step)を変数として保持 2. stepの段数分文字列出力をループ この際半角スペースを(step - (index
         * -1))回結合し出力した後、⭐️をindex回結合して出力する
         */
        int step = 9;
        IntStream.rangeClosed(1, step)
                .forEach(i -> System.out.println(repeatChars(" ", step - (i - 1)) + repeatChars("⭐️", i)));
    }
    private static String repeatChars(String s, int repeatCount) {
        return Stream.generate(() -> s).limit(repeatCount).reduce((a, b) -> a + b).get();
    }

}
