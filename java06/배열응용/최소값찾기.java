package 배열응용;

public class 최소값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 55, 11, 22, 99, 33 };
		// 해당 인덱스까지의 최대값을 저장해주기로 함
		int min = num[0]; // 최대값설정 인덱스 [0]번째로 설정 //55 : 비교기준값 : 인덱스[0]번째값 : 자료구조배열비교
		for (int i = 1; i < num.length; i++) {
			// 이전까지의 최대값은 max에 들어있음
			// 배열의 인덱스의 값을 하나씩 꺼내서 이전까지의
			// 최대값보다 큰지 비교
			// 해당 인덱스의 값이 이전까지의 최대값보다 더 크면
			// 해당 인덱스의 값을 최대값 변수에 저장
			if (num[i] < min) { // 최소값찾아서
				min = num[i]; // min에 저장
				// 11>55 false => 55
				// 22>55 false => 55
				// 99>55 true => 99
				// 33>99 false => 99
			}

		}
		System.out.println("최소값은" + min);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == min) {
				System.out.println(min + "의 위치 : " + i);
				count++;

			}//if밑
		}//for밑
			System.out.println(min + "의 개수 : " + count);
	}
}
