package DB연결;

public class 반환값연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "나는 자바 프로그래머 정말"; 
		String[] dataset = data.split(" "); //공백을 기준으로 잘라서 배열로 반환하라
		//String[] dataset = {"나는" , "자바", "프로그래머", "정말"}; //공백을 기준으로 잘라서 배열로 반환하라
		
		System.out.println(dataset.length);
		for (String s : dataset) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		String data2 = "02-844-1234";
		String[] dataset2 = data2.split("-");
		System.out.println(dataset2.length);
		for (String s : dataset2) {
			System.out.println(s);
		}

	}

}
