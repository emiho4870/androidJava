package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름, 나이, 성별, 아침식사여부, 몸무게 배열 만들어서 프린트
		
//		String[] name = new String[4];
//		int[] age = new int[4];
//		char[] gender = new char[4];
//		boolean[] food = new boolean[4];
//		double[] weight = new double[4];
		
		String[] name = {"홍길동","김길동", "박길동", "안길동"};
		for (String x : name) {//인덱스설정은 안됨
			System.out.println(x);
		}
		int[] age = {10,20,30,40};
		for (int x : age) {
			System.out.println(x);
		}
		char[] gender = {'남','여','남','여'};
		for (char c : gender) {
			System.out.println(c);
		}
		boolean[] food = {true,false,true,false};
		for (boolean b : food) {
			System.out.println(b);
		}
		double[] weight = {50.2,51.3,52.6,55.3};
		for (double d : weight) {
			System.out.println(d);
		}
		
		for (int i = 0; i < name.length ; i++) { //length는 하나만 지정
			System.out.println(i +"번째는 " +name[i]+"이고"+"나이는"+age[i]+"이고"+"성별은" +gender[i]+"이고 아침식사 는"+food[i]+"이고 몸무게는"+weight[i]+"이다");
			
		}
		
	}

}
