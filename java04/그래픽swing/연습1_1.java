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

public class 연습1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		//프레임1
		JFrame f = new JFrame(); //typing 시 에러 : 자동완성
		f.getContentPane().setBackground(Color.CYAN);
		//이미지1
		//ImageIcon img = new ImageIcon("cal.png");
		//라벨3 //이미지 : 숫자1 : 숫자2
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		JLabel result = new JLabel();
		
		//텍스트 입력1
		JTextField t1 = new JTextField(20);
		t1.setBackground(Color.GRAY); //text
		//레이아웃1\
		FlowLayout flow = new FlowLayout(); //new자동완성
		f.setSize(500,700);
		
		
		f.getContentPane().setLayout(flow);
		//l1.setIcon(img);
		l2.setText("숫자1입력"); //라벨에 글자를 넣기
		
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		l3.setText("숫자2입력");
		f.getContentPane().add(l3);
		JTextField t2 = new JTextField(20);
		t2.setBackground(Color.GRAY);
		f.getContentPane().add(t2);
		f.getContentPane().add(result);
		
		f.setVisible(true);
		
		//design 에서 이미지변경
	}	

}
