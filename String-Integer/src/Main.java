import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 任意の文字列が入力されます。数字(Iint型とInteger型)とそれ以外を分割するプログラムを作成しましょう。
//		数字とそれ以外を配列に分けて出力してください。

	    /**
	     * 「任意の文字列が入力される。」とあるが、期待値は「数字とそれ以外を配列に分ける」とある為、
	     * 「入力機能を持ち、なおかつ渡ってきた要素の数に応じて数字とそれ以外をそれぞれ配列に分けて出力する」と解釈する。
	     * なお、入力要素については半角スペース区切りで区切ることとする。
	     */
	    
	    // 入力部分
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("---任意の文字列を入力して下さい。スペース区切りで複数指定可能です。---");
        System.out.print(">");
	    String[] input = scanner.nextLine().split(" ");
	    scanner.close();
	    
	    List<Integer> intList = new ArrayList<>(); // 数字
        List<String> stringList = new ArrayList<>(); // それ以外
        
        Arrays.stream(input).forEach(s -> {
            try {
                // 数値に変換
                intList.add(Integer.valueOf(s));
            } catch (NumberFormatException e) {
                // 数値ではない場合、NumberFormatExceptionをキャッチする
                stringList.add(s);
            }
        });
	    
        // 「配列に分けて出力」する為、出力時に配列に変換
	    System.out.println("数値の配列 : " + Arrays.toString(intList.toArray()));
        System.out.println("数値以外の文字列の配列 : " + Arrays.toString(stringList.toArray()));
	}

}
