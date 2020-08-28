package 영화예매배열;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class 신체검사문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		주민번호 : (14길이로 이루어진 숫자,글자) //전체조건 5인 : 반복문 조건설정 입력값 랜덤값
//
//		키 : 
//
//		몸무게 : 
//
//		시력 : 
//
//		병명 : 1.없음 2.평발 3.고혈압

		Scanner scan = new Scanner(System.in); // scan입력값 : 1개 설정 : 타입과변수명으로 입력설정

		int human1 = 0; //현역수초기화
		int human2 = 0; //면제수초기화
		
		int score = 0; //점수초기화

		//5인 주민번호 키 몸무게 시력 병명 조회출력
		for (int i = 0; i < 3; i++) { //맨아래줄까지 sysout
			System.out.print("주민번호는");
			String human = scan.next(); // 주민번호 : 입력
			// System.out.println();//println : 줄바꿈
			System.out.print("키는");
			int tall = scan.nextInt(); // 키 : 입력
			// System.out.println();//println : 줄바꿈
			System.out.print("몸무게는");
			int weight = scan.nextInt(); // 몸무게 :입력
			System.out.print("시력은");
			double eye = scan.nextDouble(); // 몸무게 :입력
			System.out.println("병명은 1)없음 2)평발 3)고혈압");
			int sick = scan.nextInt(); // 몸무게 :입력

			
			//면제대상조건설정
			if (tall < 150 || tall > 190) {
				if (((weight / tall) * tall) > 30) {
				}if (eye < 0.0) {
					human2++; //중간조건에나중출력값설정만해줌
				}
			}//if문 면제대상 human2 누적시킴

			
			if (tall > 150 && tall < 190 ) {
				score = score + 20;
			}if (weight > 35 && weight < 100) {
				score = score + 20;
			}if (eye == 1.0) {
				score = score + 30;
			}if (eye == 0.5) {
				score = score + 20;
			}if (eye == 0.1) {
				score = score +10;
			}if (sick == 1) {
				score = score +30;
			}else if (sick ==2) {
				score = score +20;
			}else if(sick == 3) {
				score = score + 10;
			}
			
			
			System.out.println("-------------------------------");
			
			if (score > 40) {				
				System.out.println("현역대상자 입니다");
				human1++;
				score++;
				System.out.println("점수는"+score+"입니다");
			}else {
				System.out.println("면제대상자 입니다");
				human2++;
				score++;
				System.out.println("점수는"+score+"입니다");
			}
			
			System.out.println("-------------------------------");
			
		}//전체조건문 for문 안

		//조건해당되는 출력문
		System.out.println("-------------------------------");
		System.out.println("현역대상자 수는 "+ human1 +"입니다");
		System.out.println("면제대상자 수는 "+ human2 +"입니다");
		System.out.println("현역대상자 평균은 "+ score / human1 +"입니다");
		System.out.println("-------------------------------");


//
//		[성적관리]
//
//
//
//		학번:
//
//		이름:
//
//		성적을 입력받는다.
//
//		1학기기 중간고사 기말고사 2학기 중간고사 기말고사 를 입력받아
//
//
//
//		1학기 중간고사와 기말고사의 성정차를 구하고 2학기와 기말고사의 성적차이를 구한다
//
//
//
//		이 때 각 학기에 대한 결과를 출력하고  1학기와 2학기를 비교하여 결과를 출력한다.
//
//
//
//		각 학생별로 같은 과정을 반복.
//
//
//
//
//
//		[간단한 성적비교]
//
//
//
//		각각 입력받은 학생들의 성적을 비교해 우세를 판단한다.
//
//
//
//
//		<올림픽>
//		출전국가 : 한국, 중국, 일본
//		출전종목 : 피겨(figure), 스키(ski), 스피드스케이팅(speed), 쇼트트랙(short), 스켈레톤(skel)
//		최종점수 :
//
//		1. 종목별 순위 출력
//		2. 국가별 메달 수 출력
//		3. 최종 등수 출력
//
//		각나라당 종목5개
//		승/패 
//		각나라당 이긴 종목 횟수

		// 랜덤값
		// 콘솔입력값

		// 전체조건설정

//		Random r = new Random(); // 금)2 은)1 동)0 //기준
//		
//		int[] olympic =new int[5]; //총게임횟수 5회
//		
//		int figure = 0; 
//		int ski = 0;
//		int speed = 0;
//		int shrt = 0;
//		int skel = 0;
//
//		int ko = 0; // 한국 승 값  // 메달수 출력
//		int ja = 0; // 일본 승 값  // 메달수 출력
//		int ch = 0; // 중국 승 값  // 메달수 출력
//		
//		
//		
//		for (int i = 0; i < olympic.length; i++) {
//			
//			System.out.println("스키 게임결과는");
//			int korea = r.nextInt(3); // 0~2까지범위
//			int japan = r.nextInt(3); // 0~2까지범위
//			int china = r.nextInt(3); // 0~2까지범위
//			
//			if (korea == 2) {
//				if (japan == 1 && china == 0 ) {
//					System.out.println("한국 금 일본 은 중국 동 입니다");
//				}else {
//					System.out.println("한국 금 중국 은 일본 동 입니다");
//				}
//			}
//			
//			
//			System.out.print("스피드스케이팅 게임결과는 ");
//			
//			if (korea == 1) {
//				if (japan == 1 && china == 0 ) {
//					System.out.println("한국 금 일본 은 중국 동 입니다");
//				}else {
//					System.out.println("한국 금 중국 은 일본 동 입니다");
//				}
//			}
//			
//			System.out.print("쇼트트랙 게임결과는 ");
//			
//			if (korea == 0) {
//				if (japan == 1 && china == 0 ) {
//					System.out.println("한국 금 일본 은 중국 동 입니다");
//				}else {
//					System.out.println("한국 금 중국 은 일본 동 입니다");
//				}
//			}
//			
//			System.out.print("스켈 게임결과는 ");
//			
//			if (korea == 2) {
//				if (japan == 1 && china == 0 ) {
//					System.out.println("한국 금 일본 은 중국 동 입니다");
//				}else {
//					System.out.println("한국 금 중국 은 일본 동 입니다");
//				}
//			}
//			
//			System.out.print("피겨 게임결과는 ");
//			
//			if (korea == 2) {
//				if (japan == 1 && china == 0 ) {
//					System.out.println("한국 금 일본 은 중국 동 입니다");
//				}else {
//					System.out.println("한국 금 중국 은 일본 동 입니다");
//				}
//			}
//			
//			
//		}
//
//		System.out.println("-----------------------------------------");
//		System.out.println("피겨 순위는");
//		System.out.println("스키 순위는");
//		System.out.println("스피드스케이팅 순위는");
//		System.out.println("쇼트트랙 순위는");
//		System.out.println("스켈레톤 순위는");
//		System.out.println("한국 메달수 는 ");
//		System.out.println("중국 메달수 는 ");
//		System.out.println("일본 메달수 는 ");
//		System.out.println("나라별 순위 는");
//		System.out.println("-----------------------------------------");

	}

}
