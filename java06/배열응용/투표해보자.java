package 배열응용;

import javax.swing.JOptionPane;

public class 투표해보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int[] 투표수 = new int[5];
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력 0)블랙핑크 1)유재석 2)아이유 3)이효리 4)비 ");
			int choice2 = Integer.parseInt(choice);
			투표수[choice2]++;
		}
		// if (!(choice2<0 || choice2>4)) {

//		for (int x : 투표수) {
//			System.out.println(x + "");

		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(i + "번은 " + 투표수[i] + "표");
		}// 투표수[i] : 주소값있는 i : i : [0,2,3,4,...] : 순번
	}
}
