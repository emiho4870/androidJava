package 배열기본;

import java.util.Random;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1000문제
		//답안지 0~3까지 중 1000개를 만드세요 //답안지2개 //답숫자범위 0~3
		//내 답안지 0~3까지 중 1000개를 만드세요
		
		//채점을 해보세요
		//각 문항 당 오답처리
		
		
		Random r = new Random(); // int 배열에 랜덤값 설정 : r.nextInt(범위);
		
		int[] qa = new int[1000]; //총문항갯수
		int[] myQa = new int[1000];//내가푼문항갯수
		
		int count = 0;//for문 밖에 카운트함수설정
		for (int i = 0; i < qa.length; i++) {//for으로 1000문항범위 반복문설정 //myQa.length
			qa[i] = r.nextInt(4); //랜덤값범위 0~3 설정
			myQa[i] = r.nextInt(4);
			if (qa[i]==myQa[i]) {//랜덤값 같을경우 조건
				System.out.println("문항"+ i +"번의 정답은"+qa[i]+"이고 내 답은" + myQa[i]+ "이다");
				count++; //랜덤값 같을경우 count
			}else { //랜덤값 다를경우
				System.out.println("문항"+ i +"번의 정답은"+qa[i]+"이고 내 답은" + myQa[i]+ "이다");
			}
		}
		System.out.println("내 점수는" + count+ "점입니다"); //count로 총점확인 // for문 밖에
	
	}
}

