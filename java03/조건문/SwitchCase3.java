package 조건문;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;
		switch(month) { //정수(byte , short , int)
						//실수는 x
						//문자, 문자열(String)
			case 2:
				System.out.println("28일까지");
				break;
			
			case 4: case 6: case 9:
				System.out.println("30일까지");
				break;
				
			default:
				System.out.println("31일까지");
			    break;	
		
	}

}
}
