package 조건문;

import javax.swing.JOptionPane;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		---------------
//		은행입출금시스템
//		---------------
//		
//		1)입금 2)출금 3)잔고 4)종료
//		선택>>1
//		입금액 입력 >> 10000
//	

		while (true) {

			String vote = JOptionPane.showInputDialog("1)입금 , 2)출금 , 3)잔고 , 4)종료");

			if (vote.equals("1")) {
				System.out.println("10000원이 입금되었습니다");
			} else if (vote.equals("2")) {
				System.out.println("출금하시겠습니까?");
			} else if (vote.equals("3")) {
				System.out.println("잔고확인하시겠습니까?");
			} else {
				System.out.println("종료하겠습니다");
				break;
			}

		}

//		1)입금 2)출금 3)잔고 4)종료
//		선택>>3
//		잔고는 >> 10000원
//		
		
		while (true) {

			String vote = JOptionPane.showInputDialog("1)입금 , 2)출금 , 3)잔고 , 4)종료");

			if (vote.equals("1")) {
				System.out.println("입금하시겠습니까");
			} else if (vote.equals("2")) {
				System.out.println("출금하시겠습니까?");
			} else if (vote.equals("3")) {
				System.out.println("잔고는 10000원입니다");
			} else {
				System.out.println("종료하겠습니다");
				break;
			}

		}
		

//		1)입금 2)출금 3)잔고 4)종료
//		선택>>2
//		출금액 입력 >> 2000
//		
		
		
		while (true) {

			String vote = JOptionPane.showInputDialog("1)입금 , 2)출금 , 3)잔고 , 4)종료");

			if (vote.equals("1")) {
				System.out.println("입금하시겠습니까");
			} else if (vote.equals("2")) {
				System.out.println("2000원출금되었습니다");
			} else if (vote.equals("3")) {
				System.out.println("잔고확인하시겠습니까?");
			} else {
				System.out.println("종료하겠습니다");
				break;
			}

		}

		
//		1)입금 2)출금 3)잔고 4)종료
//		선택>>3
//		잔고는 >> 8000
//		

		
		while (true) {

			String vote = JOptionPane.showInputDialog("1)입금 , 2)출금 , 3)잔고 , 4)종료");

			if (vote.equals("1")) {
				System.out.println("입금하시겠습니까");
			} else if (vote.equals("2")) {
				System.out.println("출금하시겠습니까?");
			} else if (vote.equals("3")) {
				System.out.println("잔고는8000원입니다");
			} else {
				System.out.println("종료하겠습니다");
				break;
			}

		}
		
		
//		1)입금 2)출금 3)잔고 4)종료
//		선택>>4
//		시스템을 종료합니다
//		
//
//		------------
		
		while (true) {

			String vote = JOptionPane.showInputDialog("1)입금 , 2)출금 , 3)잔고 , 4)종료");

			if (vote.equals("1")) {
				System.out.println("입금하시겠습니까");
			} else if (vote.equals("2")) {
				System.out.println("출금하시겠습니까?");
			} else if (vote.equals("3")) {
				System.out.println("잔고확인하시겠습니까?");
			} else {
				System.out.println("종료하겠습니다");
				break;
			}

		}

	}

}
