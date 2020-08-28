package 조건문;

import javax.swing.JOptionPane;

public class ifTest4_3 { // String변수 답)88 : while(true) : jop입력 : 누적 : if == 비교 :

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 88; //정답
		while (true) {
			String data = JOptionPane.showInputDialog("숫자입력");// JOptionPane.showInputDialog("String") : String ! //입력되는값String을 //jop:string
			int data2 = Integer.parseInt(data); //int로 변환@
			//비교연산자 기본형 데이터만 사용할 수 있다.
			if (data2==target) {
				System.out.println("정답입니다. 축하합니다");
				break;
				//System.exit(0);
			}else {
				System.out.println("정답이 아닙니다");
			}
			
		}
		
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
   
   
   
   
   
   