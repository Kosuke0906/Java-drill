
public class Main {
	public static int array[] = {3,7,45,1,6,75,85,24,11,87,43};
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//		要素数は入力者の任意です。
		for(int i = 0;i<array.length;i++) {
			if(!judgePrime(i)) {
				System.out.println(array[i]);
			}
		}

	    long total = Runtime.getRuntime().totalMemory();
	    long free = Runtime.getRuntime().freeMemory();
	    long used = total - free;
	    long max = Runtime.getRuntime().maxMemory();
	    System.out.println("total => " + total  + "Byte");
	    System.out.println("free  => " + free+ "Byte");
	    System.out.println("used  => " + used + "Byte");
	    System.out.println("max   => " + max + "Byte");
	}
	public static boolean judgePrime(int i) {
		for(int a = 2;a<=array[i]/2;a++) {
			if(array[i]%a==0) {
				return true;
			}
		}
		return false;
	}
}
