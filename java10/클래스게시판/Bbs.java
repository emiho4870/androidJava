package 클래스게시판;

public class Bbs {
	
	
	/*
	 * 멤버변수
	 */
	int id;
	String title;
	String content;
	String writer;
	
	/*
	 * 멤버메서드
	 */
	
	public void 쓰다() {
		System.out.println("글을쓰다");
	}
	public void 삭제() {
		System.out.println("글을삭제하다");
	}
	public void 읽다() {
		System.out.println("글을읽다");
	}
	public void 수정() {
		System.out.println("글을수정하다");
	}

}
