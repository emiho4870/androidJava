package DB연결;

public class 반환값연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "A1가";
		char[] dataset = data.toCharArray();//char기본형을 분리하라 : dataset : toCharArray
		for (char c : dataset) {
			System.out.println(c);
		}
		System.out.println("-------------------");
		System.out.println(dataset[0]);
	}

}
