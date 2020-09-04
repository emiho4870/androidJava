package DB연결;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//UI , View역할
public class 버튼4개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();  //1
		f.setSize(500 , 500);//2
		
		//FlowLayout flow = new FlowLayout(); // new : import // new : 참조형변수
		//f.setLayout(flow); //flow 주소 받아옴 //f.setLayout : manager
		//f.setLayout(new FlowLayout()); // 위의 두줄과 동일
		
		/*
		 * JButton b1 = new JButton();
		 */
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // public void actionPerformed(ActionEvent e)
				//입력한 값 가지고 완서 DB처리 전담 클래스에게 DB에 저장하라고 데이터를 넘김 : control : M:V:C 모델
				DB처리전담 db = new DB처리전담();
				db.create();
			}
		});
		b1.setText("Create");
		
		//setText("String");
		
		
		/*
		 * JButton b2 = new JButton();
		 */
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				db.read();
			}
		});
		b2.setText("Read");
		
		/*
		 * JButton b3 = new JButton();
		 */
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				db.update();
			}
		});
		b3.setText("Update");
		
		/*
		 * JButton b4 = new JButton();
		 */
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db = new DB처리전담();
				db.delete();
			}
		});
		b4.setText("Delete");
		
		
		
		//component
		f.getContentPane().add(b1 , BorderLayout.NORTH); // NORTH : 대문자 : static
		f.getContentPane().add(b2 , BorderLayout.EAST);
		f.getContentPane().add(b3 , BorderLayout.WEST);
		f.getContentPane().add(b4 , BorderLayout.SOUTH);
		
		
		
		
		
		f.setVisible(true); //3 //.set : 자동완성
	}

}
