package 배열정리;

public class 이차원배열 { //일반적배열 //영화관 A관

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] seat = new int[3][5]; // 행마다 열이 같을 경우 입력 // 3열 10행 // 2차원배열 공간선언
		//배열을 선언순간 공간이 할당 : 15개공간 // seat 주소가 들어간 참조형 변수 : int 기본형 변수 
		//seat : 참조형변수(주소)
		//int[3][5] : 기본형 변수(값)
		//배열은 자동 초기화 int -> 0
		//System.out.println(seat);
		//  0 1 2 3 4 //3행 5열 //1열마다 for문1개 // for문에 for문
		//0 0 0 0 0 0
		//1 0 0 0 0 0
		//2 0 0 0 0 0

           //열:행		
//		seat[0][0] = 1 ;
//		seat[0][4] = 1 ;
//		seat[2][4] = 1 ;
//		
//		System.out.println("행의 개수: "+ seat.length);
//		for (int i = 0; i < seat.length; i++) { //0 1 2
//			for (int j = 0; j < seat[i].length; j++) { // i j k l m n // 각줄마다 
//				System.out.print(seat[i][j]+ " "); //1행표시 : 1행5열 // "" : 간격띄우기
//			}
//			System.out.println();//enter : 줄바꿈
//		}
		
		
//		1.3
//		2.1
		
		seat[1][3] = 1; 
		seat[2][1] = 1;

		
		System.out.println("행의 개수: " + seat.length);
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
			System.out.print(seat[i][j] + " ");	
			}
			System.out.println();
		}
		
		
		
		
	}

}
