package 조건문;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food = "냉면";
		switch (food) {
		case "국수":
			System.out.println("분식집으로 가요");
			break;
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "냉면":
			System.out.println("냉면집으로 가요");
			break;
		case "알밥" :
			System.out.println("일식집으로 가요");
			break;
		default : // if문의 else와 동일
			System.out.println("그냥 안먹어요");
		}
	}

}
