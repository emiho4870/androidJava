package 클래스사용하기;

import 클래스만들기.용돈계산기2;

public class 내용돈계산해보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int 기간 = 6;
		int 한달 = 100000;
		
		
		
		용돈계산기2 용돈 = new 용돈계산기2();
		int result = 용돈.mul( 기간 , 한달 );
		if(result > 50) {
			System.out.println("용돈은" + result + "원");
		}else {
			System.out.println("용돈은" + (result + 150000)+ "원");
		}
		
		int pre = 600000;
		int post = 500000;
		용돈.add(pre , post);
	}

}
