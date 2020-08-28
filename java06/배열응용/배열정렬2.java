package 배열응용;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class 배열정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 과목명 String형 점수 int형
		 */
		String[] 과목 = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] 점수 = { 100, 99, 77, 87, 66 };
		int[] 점수2 = 점수.clone(); // 점수배열 clone복제
		int sum = 0;
		int sum2 = 0;

		/*
		 * 1학기 점수
		 */
		System.out.println("1학기 점수");
		for (int x : 점수) {
			System.out.println(x + "");
		}

		for (int i = 0; i < 점수.length; i++) {
			//sum = sum + 점수[i];
			sum += 점수[i];
		}
		System.out.println("1학기 평균은" + sum / 5 + "입니다");
		System.out.println("----------------------------");

		/*
		 * 변경할 '점수2[i]'배열에 점수 저장
		 */
		점수2[2] = 44;
		점수2[4] = 55;

		/*
		 * clone함수로 변경된 점수 확인
		 */
		System.out.println("2학기 점수");
		for (int x : 점수2) {
			System.out.println(x + "");
		}

		for (int i = 0; i < 점수2.length; i++) {
			//sum2 = sum2 + 점수2[i];
			sum2 += 점수2[i];
		}
		System.out.println("2학기 평균은" + sum2 / 5 + "입니다");
		System.out.println("----------------------------");

		if (sum == sum2) {
			System.out.println("1학기 2학기 평균이 같습니다");
		} else if (sum < sum2) {
			System.out.println("2학기 평균이 더 높습니다");
		} else {
			System.out.println("1학기 평균이 더 높습니다");
		}
		/*
		 * 점수배열과 점수2배열에서 다른값 찾기
		 */
		int count = 0;
		for (int i = 0; i < 점수.length; i++) { // 0~4 까지 순차비교점검 : FOR > if
			if (점수[i] != 점수2[i]) {
				System.out.println("점수가 변경된 과목의 수는" + count + "과목 입니다");
				count++; //count
			}
		}
		System.out.println("점수가 변경된 과목명은" + 과목[2] + "과" + 과목[3] + "입니다");//함수사용print
	}
}






