package 클래스만들기;

public class 가족 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		가족 f1 = new 가족();
		f1.nm = "아빠";
		f1.bk = "튼튼적금";
		f1.money = 1000;
		
		
		가족 f2 = new 가족();
		f2.nm = "엄마";
		f2.bk = "튼튼예금";
		f2.money = 2000;
		
		
		가족 f3 = new 가족();
		f3.nm = "딸";
		f3.bk = "다음적금";
		f3.money = 3000;
		
		System.out.println("우리 가족 계좌정보");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("이름" +"\t"+ "계좌이름" +"\t"+ "금액" +"\t"+  );
		System.out.println(f1.nm +"\t"+ f1.bk +"\t"+f1.money);
		System.out.println(f2.nm +"\t"+ f2.bk +"\t"+ f2.money);
		System.out.println(f3.nm +"\t"+ f3.bk +"\t"+ f3.money);
		
		f1.입금();
		f3.출금();
	
	}

}
