package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바는 부품조립식 코드 => 객체지향형프로그래밍(OOP)
		//ctrl shift o : 자동import
		
		//JFrame f = new JFrame(); // new는 복사의 의미s
		JFrame f = new JFrame();
		
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "눌렀다");
			}
		});
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f,"눌렀다"); // JOptionPane.showInputDialog(f,"눌렀다"); // 메세지입력창
			}
		});
		
		//String img = "sky.png";
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "하늘이미지눌렀다");
			}
		});
		
		
		ImageIcon img = new ImageIcon("sky.png");
		b3.setIcon(img);//이미지set
		
		b1.setText("눌러btn");
	    b2.setText("눌러btn");
	    
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		f.setSize(1000,500);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		//맨 아래에 두어야 한다.
		f.setVisible(true);
		
	}

}
