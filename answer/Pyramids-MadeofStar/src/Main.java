
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Qestion ９段の星（⭐️）で出来たピラミッドを作成しましょう。
		int i = 9;
		int count = 1;
		for(int a = i;a >0;a--) {
			for(int x =1;x<a;x++) {
				System.out.print(" ");
			}
			for(int s = 1;s <= count;s++) {
				System.out.print("⭐️");
			}
			count=count+1;
			System.out.println();
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

}
