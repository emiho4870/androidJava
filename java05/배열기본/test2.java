package 배열기본;

import java.util.Random;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1000문제
		//답안지 0~3까지 중 1000개를 만드세요 //답안지2개 //답숫자범위 0~3
		//내 답안지 0~3까지 중 1000개를 만드세요
		
		//채점을 해보세요
		//각 문항 당 오답처리 : boolean
		
		
		Random r = new Random(); // 자동완성 : import : import java.util.Random; //랜덤변수설정 //랜덤함수 단순생성
		
		int[] qa = new int[1000]; //int형 data배열 갯수 1000개 //data 변수갯수 설정
		int[] myQa = new int[1000];
		
		int count = 0;
		for (int i = 0; i < qa.length; i++) {
			qa[i] = r.nextInt(4);//문제1000개범위에 랜덤갯수설정4개 : 0~3범위 //int 배열로 문항갯수설정 : 랜덤변수명 r로 : r.nextInt(범위);
			myQa[i] = r.nextInt(4);
			if (qa[i]==myQa[i]) {
				System.out.println("문항"+ i +"번의 정답은"+qa[i]+"이고 내 답은" + myQa[i]+ "이다");
				count++;
			}else {
				System.out.println("문항"+ i +"번의 정답은"+qa[i]+"이고 내 답은" + myQa[i]+ "이다");
			}
		}
		System.out.println("내 점수는" + count+ "점입니다");
		
//		for (int i = 0; i < 1000; i++) { //1000까지 범위에
//			System.out.println();
//			//data[i] = r.nextInt(4); //Random설정된 변수 r.nextInt(범위);
//		}//for문 (1)
//		//for (int x : data) {
//		//	System.out.println("정답은" + x +"번");
//		}
//		
	}
}

