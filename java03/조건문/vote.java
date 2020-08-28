package 조건문;

import javax.swing.JOptionPane;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ---------------
		// 투표시스템(무한루프)

		// 인기투표 선택해주세요(1:아이유 2:유재석 3:방탄 4:종료)
		// 1)종료가되는지확인
		// 2)투표진행
		// 3)종료가되면, 각 몇표를 얻었는지 출력
		// ---------------

		int count = 0; // 총 투표횟수 : 변수설정
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		while (true) {
			String vote = JOptionPane.showInputDialog("1)아이유 , 2)유재석 , 3)방탄 , 4)종료 ");
			count++; //if문 밖에
			if (vote.equals("1")) {
				System.out.println("아이유가 투표되었습니다");
				num1++;
			}else if (vote.equals("2")) {
				System.out.println("유재석이 투표되었습니다");
				num2++;
			}else if (vote.equals("3")) {
				System.out.println("방탄이투표되었습니다");
				num3++;
			}else {
				System.out.println("투표가 종료되었습니다");
				num4++;
				break;
			}//if문
		}//while문
		System.out.println("전체 투표횟수 " + count);
		System.out.println("아이유가 투표받은 수 " + num1 + "회");
		System.out.println("유재석이 투표받은 수 " + num2 + "회");
		System.out.println("방탄이 투표받은 수 " + num3 + "");
	}

}
