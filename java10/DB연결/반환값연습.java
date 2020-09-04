package DB연결;


import java.util.Date;
import java.util.Random;

public class 반환값연습 {
	
	public int add( int x , int y ) {
		return x  +  y ;
	}
	public double add( double x , int y ) { //하나라도 double 이면 double
		return x  +  y ;
	}
	public double add( int x , double y ) { //하나라도 double 이면 double
		return x  +  y ;
	}
	public int[] add( int x ) { // 기본형 ,int
		int[] num = { 1 , 2 , x };
		return num ;
	}
	public String add( String x , int y ) { // 하나라도 String 이면 String
		return x  +  y ;
	}
	public Date add() { // return Date
		Date date = new Date();
		return date;
	}
	public boolean add(boolean x) { // 기본형 boolean
		Random r = new Random(); //랜덤
		return r.nextBoolean(); //랜덤 : boolean : return
	}
	

}
