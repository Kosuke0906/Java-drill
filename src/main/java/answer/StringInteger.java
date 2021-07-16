package answer;

import java.util.ArrayList;
import java.util.List;

public class StringInteger {
	public static String[] strs = { "123", "aiueo", "12312", "asdfas", "asdfas", "12542341" };

	public static void main(String[] args) {
//		Question 任意の文字列が入力されます。数字(int型とInteger型)とそれ以外を分割するプログラムを作成しましょう。
//		数字とそれ以外を配列に分けて出力してください。

		stringInteger(strs);

	}

	public static void stringInteger(String[] strs) {
		List<String> strList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < strs.length; i++) {
			try {
				int number = Integer.parseInt(strs[i]);
				intList.add(number);
			} catch (NumberFormatException e) {
				strList.add(strs[i]);
			}
		}

		System.out.println("文字配列:" + strList);
		System.out.println("数字配列:" + intList);

	}

}
