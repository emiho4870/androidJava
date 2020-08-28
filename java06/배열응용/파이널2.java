package 배열응용;

import javax.swing.JOptionPane;

public class 파이널2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10,20,30,40,50을 배열에 넣어 첫번째 값과 두번재 값을 더해서 print
		
		
		int[] num = {10 , 20 , 30 , 40 , 50};
		System.out.println("첫번째 값"+ num[0]+ "과 두번째 값" + num[1] + "의 합은" +( num[0] + num [1]) +"입니다");
		
		//JAVA, SPRING, JSP를 입력받아 배열에 넣어보세요
		//출력은  **JAVA보다는 SPRING**
		
	
//		for (int i = 0; i < 3; i++) {
//			String data = JOptionPane.showInputDialog("문자입력");
//		}
		//System.out.println( data[0] + data[1]+ data[2] );
		
		//11,22,33,44를 배열에 넣어서
		//이 중 33은 몇 번째 위치에 있는지 프린트!
		
		int[] num_2 = { 11 , 22 , 33 , 44 };
		int target = 3; //3번째위치설정
		
		if (target == num_2.length) {
			System.out.println(num_2 + "는" + target + "번째 위치에 있습니다");
		}
		
		
		
		
		
		//5개의 정수 배열을 만들어서 1~5까지 입력하여 프린트
		
		// 66,77,88,99 중 최대값을 찾아보세요
	}

}
