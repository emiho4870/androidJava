package 조건문;

import javax.swing.JOptionPane;

public class ifTest3 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) { // while : for : 반복문 // if : switch : 조건문 // break : if조건달성 : 탈출
			
			String data = JOptionPane.showInputDialog( "ok)긍정 no)부정 etc)기타 end)종료 중 선택");
			
			if (data.equals("end")) {
				System.out.println("반복문 종료합니다.");
				break;
				
			}if (data.equals("ok")) {
				System.out.println("긍정");
				//ok++;
			}
			else if(data.equals("no")){
				System.out.println("부정");
				//no++;
			}else if (data.equals("etc")) {
				System.out.println("기타");
				//etc++;
	}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		}
	}
	
