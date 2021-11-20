
public class Main {
public static void main(String[] args) {
//	Question 1~100で偶数だけ取り出し、それぞれ何回２で割れるかを出力してください。
	int A=68;
	for(int i = 1;i<=A;i++) {
		if(i%2==0){
			int num=i;
			int count = 0;
			while(num%2==0) {
				num=num/2;
				count++;
			}
			System.out.println(i+"は2で"+count+"回割れます");
		}
	}
	}
}