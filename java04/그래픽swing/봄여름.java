package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

public class 봄여름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바는 부품조립식 코드 => 객체지향형프로그래밍(OOP)
		//ctrl shift o : 자동import
		
		//JFrame f = new JFrame(); // new는 복사의 의미s
		JFrame f = new JFrame();
		ImageIcon img = new ImageIcon("sky.png");
		
		//---------------------------------------------set
		JButton b1 = new JButton();
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setBackground(Color.PINK);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "신선해요");
			}
		});
		//---------------------------------------------set
		JButton b2 = new JButton();
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.MAGENTA);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		

		b1.setText("봄");
		f.getContentPane().add(b1);
		b2.setText("여름");
		f.getContentPane().add(b2);
		
		f.setSize(1000,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		//맨 아래에 두어야 한다.
		f.setVisible(true);
		
	}

}
