package 조건문;

public class ifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "ok"; // 답
		
		if (data.equals("ok")) {
			System.out.println("긍정");
		}else if (data.equals("no")) {
			System.out.println("부정");		
		} else {
			System.out.println("잘모르겠음");
		}
	}

}
