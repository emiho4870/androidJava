package 클래스게시판;

public class 게시판작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bbs name1 = new Bbs();
		
		name1.id = 1;
		name1.title = "java";
		name1.content = "fun java";
		name1.writer = "park";
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("id" + "\t" + "title"+ "\t" + "content"+ "\t" + "writer");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(name1.id+ "\t" +name1.title+ "\t" +name1.content+ "\t" +name1.writer);
		
		Bbs name2 = new Bbs();
		
		name2.id = 1;
		name2.title = "jsp";
		name2.content = "fun jsp";
		name2.writer = "kim";
		
		name1.삭제();
		
		
		
		

	}

}
