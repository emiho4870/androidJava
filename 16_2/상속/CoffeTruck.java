package 상속;

public class CoffeTruck extends Truck {

	boolean coffe;
	
	public void drink() {
		System.out.println("커피를 마시다");
		
		
	}

	@Override
	public String toString() {
		return "coffeTruck [coffe=" + coffe + ", color=" + color + ", name=" + name + ", age=" + age + "]";
	}

	
}
