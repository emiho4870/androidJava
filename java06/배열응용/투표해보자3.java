package 배열응용;

import javax.swing.JOptionPane;

public class 투표해보자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] info = {"아버지","어머니","형","나","동생"};
		
		int[] info2 = {100 , 88 , 33 , 24 , 10 };
		double[] info3 = { 177.5 , 152.2 , 190.3 , 167.7 , 155.3 };
		
		System.out.println("우리집식구정리"); // "\t"
		System.out.println("----------");
		for (int i = 0; i < info3.length; i++) {
			System.out.println(info[i] +"\t"+ info2[i] +"\t"+ info3[i] );//같은 문장형식 FOR //한줄[i] : 순번
		}//for문 안 system 5번 반복문
//		System.out.println(info[1] +"\t"+ info2[1] +"\t"+ info3[1] );
//		System.out.println(info[2] +"\t"+ info2[2] +"\t"+ info3[2] );
//		System.out.println(info[3] +"\t"+ info2[3] +"\t"+ info3[3] );
//		System.out.println(info[4] +"\t"+ info2[4] +"\t"+ info3[4] );
//		
	}
}
