package 조건문;

import javax.swing.JOptionPane;

public class SwitchCase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String no = "A100";
		char dep = no.charAt(0);
		switch(dep) {
		case 'A' :
			System.out.println("기획부");
			break;
			
		case 'B' :
			System.out.println("총무부");
			break;
		
		case 'C' :
			System.out.println("총무부");
			break;
			
		default :
			System.out.println("소속부서가 없습니다");
			break;
		}
		String sub = no.substring(1,4);
		//인덱스 1~3범위 추출이면 substring(1,4)써줌
		System.out.println("사원고유 번호는 " + sub);
		
	
	}

}
