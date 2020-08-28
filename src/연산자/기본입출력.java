package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) { // alt + _ : 실행단축키
		// TODO Auto-generated method stub
		//창을 띄워서 입력을 받아보자
		//창을 띄워서 출력을 해보자
		//자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		//ctrl + / + tab
		//특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할 때
		//부품을 지정함.
		
		String name = JOptionPane.showInputDialog("당신의 이름은"); //JOptionPane
		//name이라는 변수로 ram에 저장
		
		System.out.println("당신의 이름은" + name);
		//println으로 name변수에 저장된 값을 cpu로 출력실행
		
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//age라는 변수에 나이저장
		
		//키보드로 입력한 데이터 타입은 무조건 String!
		//String으로 저장된 데이터를 int/String쓸지는 내가 결정!
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함.
		//숫자로 바꿔보자!!
		
		int age2 = Integer.parseInt(age);
		//문자형으로 ram에 저장된 age를 정수형으로 변환하여 age2로 변수저장
		
		int lastAge = age2 - 1;
		//정수형으로 lastAge를 ram에 저장
		
		System.out.println("당신의 작년 나이는  " + lastAge );
		//ram에 저장된 age2값으로 lastAge로 계산되어 cpu에서 출력명령함
	}

}
