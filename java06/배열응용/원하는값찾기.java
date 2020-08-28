package 배열응용;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42); // random r : nextInt : 범위이내랜덤
		int[] number = new int[1000];
		for (int i = 0; i < number.length; i++) { // 랜덤값 for
			number[i] = r.nextInt(1000);// 0~999 //랜덤설정 // r.nextInt(1000) + 1 - 444 : 범위재지정
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ": " + number[i]); // 출력 for
		}
		int target = 100;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == target) { // 특정값 if //;세미콜론주의
				count++;
				System.out.println(target + "의 위치는 " + i);
			}
		}
		System.out.println(count + "개"); // 100의 위치갯수
		System.out.println(target + "의 개수는" + count + "개");
		
		//max값 찾기
		int max = number[0]; // 랜덤값 배열의 최대값 인덱스 [0]설정
		for (int i = 1; i < number.length; i++) { // int i = 1
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("최대값은" + max);//code위에서부터읽어내려옴
		
		//min값 찾기
		int min = number[0]; //랜덤배열 인덱스[0] : 최소값
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("최소값은" + min);//code위에서부터읽어내려옴
		
		//max의 위치찾기
		//min의 위치찾기

// max값 찾기
// min값 찾기
// max의 위치 찾기
// min의 위치 찾기
	}
}