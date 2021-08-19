
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 入力者よりローマ字で値が入力されます。
//		形式は一限配列です。（例：String[] array = {"John","hony", "Strength"}）
//		頭文字を認識し配列をABC順に並び替えて出力してください。
		String[] array = {"John","hony", "Strength", "Coke", "swim"};
//		配列の長さぶん回す
		for(int i = 0;i <=array.length;i++) {
//			右から一つずつ要素を取り出して左の要素と比べる。
			for(int f = array.length-1;f>=1;f--) {
				String A = array[f];
				String B =  array[f-1];
				char charA = A.charAt(0);
				char charB = B.charAt(0);
				String stringA = String.valueOf(charA).toLowerCase();
				String stringB = String.valueOf(charB).toLowerCase();
				if(stringA.compareTo(stringB)<0) {
					String box = array[f];
					array[f] = array[f-1];
					array[f-1] = box;
				}
			}

		}
		for(int k =0; k <array.length;k++) {
			System.out.println(array[k]);
		}
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long used = total - free;
        long max = Runtime.getRuntime().maxMemory();
        System.out.println("total => " + total  + "Byte");
        System.out.println("free  => " + free+ "Byte");
        System.out.println("used  => " + (total - free) + "Byte");
        System.out.println("max   => " + max + "Byte");
	}
	public static boolean sameLetter(String A,String B, int x) {
try {
	char charA = A.charAt(x);
	char charB = B.charAt(x);
	String stringA = String.valueOf(charA);
	String stringB = String.valueOf(charB);
if(stringA.equals(stringB)) {
	return true;
}else {
	return false;
}

}catch(Exception e) {
 return false;
}finally {
	}
}
//	public static boolean sameLetter(String A,String B, int h) {
//		return true;
//
//	}

}
