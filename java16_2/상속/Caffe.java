package 상속;

public class Caffe {
	
	

	public static void main(String[] args) {
		
		CoffeTruck s = new CoffeTruck ();
		s.age = 20;
		s.name = "아메리카노";
		s.coffe = true;
		s.color = "blue";
	
		
		System.out.println(s);
		s.runrun();
		s.run();
		s.drink();

	}

}
