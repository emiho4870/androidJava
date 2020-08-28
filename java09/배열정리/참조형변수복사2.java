package 배열정리;

public class 참조형변수복사2 { //주소복사

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1 , 2 , 3 , 4 , 5 };
		int[] y = x; //주소복사(얖은복사)
		
		System.out.print("x: "); //x출력
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		System.out.print("y : ");//y출력
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println("");
		System.out.println("+++++++++++++++++++");
		
		x[0] = 9; //주소값만복사 : 얕은복사
		
		System.out.print("x :");
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println(" ");
		
		System.out.print("x :");
		for (int i : y) {
			System.out.print(i +" ");
		}
			
		
	}

}
