package OCt13;

public class memo {

	public static void main(String[] args) {

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + 1; // 랜덤값 넣기
		}

		for (int c : num) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				while (true) {
					if (i != j && num[i] == num[j]) {
						int c = num[j];
						num[j] = (int) (Math.random() * 10) + 1;
						System.out.println(
								(i + 1) + "번째숫자 " + num[i] + ", " + (j + 1) + "번째 숫자와 같아서 이 숫자를" + num[j] + "로/으로 변경");
						System.out.println();
						for (int a : num) {
							System.out.print(a + " ");
						}
						System.out.println();
						i = 0; // i를 초기화해서 또 같은게 없는지 처음부터 끝까지 다찾음
					} else {
						break;
					}
				}
			}
		}

		System.out.println();
		System.out.println("모두 다른 랜덤 숫자 !");

	}
}
