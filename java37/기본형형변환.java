package 형변환Casting;

public class 기본형형변환 {

	public static void main(String[] args) {
		// primitive(원시적인, 가공되지 않은) data
		// 크기에 대한 것을 고려해야함.
		// 정수 byte(1) -> short(2){-30000~30000} -> int(4){-21억~21억} -> long(8)
		byte a = 100; //(-128~127)
		int b = a; // 기본형 복사
		// int(큰) <- byte(작): 자동형변환
		int c = 200;
		byte d = (byte)c;
		//byte(작) <- int(큰) : 강제형변환
		System.out.println(c);
	}

}
