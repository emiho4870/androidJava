package 그래픽Swing;

import java.awt.FlowLayout;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		//프레임1
		JFrame f = new JFrame(); //typing 시 에러 : 자동완성
		
		f.getContentPane().setBackground(Color.CYAN); //f.getContentPane // 배경색
		
		ImageIcon img = new ImageIcon("cal.png"); // 이미지
		
		//라벨3 //이미지 : 숫자1 : 숫자2
		JLabel l1 = new JLabel(); // 계산기이미지 // 라벨 l1
		JLabel l2 = new JLabel(); //숫자1
		l2.setFont(new Font("굴림", Font.PLAIN, 10));
		JLabel l3 = new JLabel(); //숫자2
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		JLabel result = new JLabel();//결과값라벨
		
		//텍스트 입력1
		JTextField t1 = new JTextField(10); //숫자1입력창
		t1.setBackground(Color.GRAY); //text
		JTextField t2 = new JTextField(10); //숫자2입력창
		t2.setBackground(Color.GRAY); //text
		
		
		//버튼1 : 계산설정
		JButton plus = new JButton(); //계산버튼 : +
		plus.addActionListener(new ActionListener() { //계산함수설정
			public void actionPerformed(ActionEvent e) { //계산함수설정 : 버튼더블클릭
				//t1, t2에 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터타입은 무조건 String!
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				
				//String 끼리 결합은 사칙연산불가
				//사칙연산시 숫자로변환
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
			
			
			//숫자로 변환한 값들을 더하자
			int sum = i1 + i2;
			
			//처리한 결과를 사용자에게 보여줌.
			//result.setText(sum + "");
			String sum2 = String.valueOf(sum);
			result.setText(sum2);
		}
			
		});//함수설정끝
		
		
		plus.setBackground(Color.ORANGE); //버튼색설정
		plus.setForeground(Color.RED); //버튼색설정
		plus.setText("*"); //버튼text설정
		
		
		//레이아웃
		FlowLayout flow = new FlowLayout(); //new자동완성
		f.setSize(500,700);//사이즈
		f.getContentPane().setLayout(flow);
		//레이아웃
		
		l1.setIcon(img); // img	
		l2.setText("숫자1");
		l3.setText("숫자2");
		
		//적용
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		
		
		//버튼--------------------------
		JButton plus_1 = new JButton();
		plus_1.setText("+");
		plus_1.setForeground(Color.RED);
		plus_1.setBackground(Color.ORANGE);
		f.getContentPane().add(plus_1);
		
		JButton minus1 = new JButton();
		minus1.setText("-");
		minus1.setForeground(Color.RED);
		minus1.setBackground(Color.ORANGE);
		f.getContentPane().add(minus1);
		f.getContentPane().add(plus);
		
		JButton plus_2 = new JButton();
		plus_2.setText("/");
		plus_2.setForeground(Color.RED);
		plus_2.setBackground(Color.ORANGE);
		f.getContentPane().add(plus_2);
		f.getContentPane().add(result);
		//버튼---------------------------
		
		f.setVisible(true);
		//셋팅
		
	}	

}
