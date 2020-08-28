package 배열기본;

import java.util.Random;

public class 문제채점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] correct = new int[1000];
		int[] me = new int[1000];
		
		Random r =new Random();
		
		//
		for (int i = 0; i < correct.length; i++) {
			correct[i] = r.nextInt(4);
			me[i] = r.nextInt(4);
		}
		//
		
		System.out.println("문항\t정답\t내답\t처리"); //역슬래시 
		
		int count = 0;
		//
		for (int i = 0; i < me.length; i++) {
			String result = "오답";
			if(correct[i] == me[i]) {
				result = "정답";
				count++;
			}else {
		}
		System.out.println(i + "\t" + correct[i] + "\t" + me[i] + "\t"  + result    );
		}
		//

	}
	}
