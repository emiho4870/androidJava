package 조건문;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class ifTest4 { // String변수 답)88 : while(true) : jop입력 : 누적 : if == 비교 :

	public static void main(String[] args) { // ctrl : shift : F : 코드정렬
		// TODO Auto-generated method stub
		int target = 88; // 정답
		
		int no = 0; // false : 예약어 // 틀린횟수
		int count = 0; // 전체횟수
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자입력");// JOptionPane.showInputDialog("String") : String !
																// //입력되는값String을 //jop:string
			int data2 = Integer.parseInt(data); // int로 변환@
		
			count++; //전체횟수 count는 if문 밖에둔다
			
			// 비교연산자 기본형 데이터만 사용할 수 있다.
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다");
				break;
				// System.exit(0);
			} else {
				no++; //틀린경우 count
				System.out.println("정답이 아닙니다");
				// 큰지, 작은지 힌트를 주세요,!
				if (data2 > target) {  //else if문 으로 2번 나누지않고 else문(정답이아닌경우)에서 if문과 else문으로 나눈다 
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요");
				}//else
			}//if
		}//while
	System.out.println("전체 시도 횟수: " + count + "회");
	System.out.println("틀린 시도 횟수: " + no + "회");
	}
}

//		int target = 88;
//		
//		while (true) {
//			String data2 = JOptionPane.showInputDialog("정답이라고 생각한값을 넣으세요"); //"77"
//			int target2 = Integer.parseInt(target);
//			if (data.equals("target")) {
//				System.out.println("축하합니다");
//				System.exit(0);
//			}else {
//				System.out.println("정답이 아닙니다");
//			}
//		
//		}

//// 2.무한루프
//   1)int target = 88; //정답
//    입력을 받아서, 정답이면 축하합니다! 하고 종료
//     정답이 아니면, 계속 입력을 받아서 확인
//     
//   2)입력받은 값이 정답보다 크면, 너무 커요! //정수int // String비교불가
//					    작으면, 너무 작아요!	
//	 3)틀린 횟수, 몇 번만에 맞추었는지 프린트
