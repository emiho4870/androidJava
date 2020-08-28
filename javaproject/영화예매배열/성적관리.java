package 영화예매배열;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		[성적관리] //5인성적관리 : 항목3개 입력받음 : 타입 int String int
//				학번:
//				이름:
//				성적:을 입력받는다. Scanner scan = new Scanner(System.In);
//				1학기기 중간고사 기말고사 2학기 중간고사 기말고사 입력
//
				Scanner scan = new Scanner(System.in);
				
				
				
				System.out.println("+++++++++++++++");
				System.out.println("학생정보를 입력하세요");
				System.out.println("+++++++++++++++");
				
				for (int i = 0; i < 3; i++) {
					
					
					
					System.out.print("학번 : ");
					int grade = scan.nextInt(); //학번
					System.out.print("학생이름 : ");
					String stu = scan.next(); //학생이름
					System.out.print("1학기 중간고사성적 : ");
					int test1 = scan.nextInt(); //성적점수
					System.out.print("1학기 기말고사성적 : ");
					int test2 = scan.nextInt(); //성적점수
					System.out.print("2학기 중간고사성적 : ");
					int test3 = scan.nextInt(); //성적점수
					System.out.print("2학기 기말고사성적 : ");
					int test4 = scan.nextInt(); //성적점수
					
					
					System.out.println("+++++++++++++++");
					
					
					
					int sum1 = (test1 + test2) / 2; //중간고사 평균
					int sum2 = (test3 + test4) / 2; //기말고사1
					
					if (sum1 > sum2) {
						System.out.println(stu +"는 1학기 점수가 더 높습니다");
					}else {
						System.out.println(stu +"는 2학기 점수가 더 높습니다");
					}
					
					int ave = (test1 + test2 + test3 +test4) / 4 ;
					System.out.println(stu + "의 평균은" + ave );
					
					System.out.println("+++++++++++++++");
				}
		
//				1학기 중간고사와 기말고사의 성적차를 구하고 2학기 중간고사와 기말고사의 성적차이를 구한다
				// test1++ test2++ 
//
//
//
//				이 때 각 학기에 대한 결과를 출력하고  1학기와 2학기를 비교하여 결과를 출력한다.
//				// if문 성적비교 1학기가 더 높습니다 2학기가 더 높습니다
//
//
//				각 학생별로 같은 과정을 반복.
//
//
//
//
//
//				[간단한 성적비교]
//
//
//
//				각각 입력받은 학생들의 성적을 비교해 우세를 판단한다.


	}

}
