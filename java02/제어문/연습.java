package 제어문;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1 = "아이스크림"; //db
		String y2 = "아이스커피";
		
		String xx1= JOptionPane.showInputDialog("먹고싶은것"); //직접입력
		//String yy2 = JOptionPane.showInputDialog("아이스커피");;//String은 부품(class)
		
		if (x1.equals(xx1)) { //and연산자 : &% : 여러 조건이 모두 true일때
												  //전체 논리적인 판단을 true라고 판단하는 경우
			System.out.println("뚜레주르로가요");
		}else if(y2.equals(xx1)) {
			System.out.println("이디야로가요");
			}else {
				System.out.println("물마셔요");
			}
				
		}
	}


