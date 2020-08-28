package 배열정리;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 

public class 중국집주문시스템 {
	
	static int now = 2;//현재 위치를 체크할 수 있는 변수, main 밖에서 뺄 때 static 붙여주기(클릭 연산할 때)

	public static void main(String[] args) {
		// 영화제목목록, 이미지목록, 감독목록, 평정목록
		String[] titles = { "다만 악에서 구하소서", "오케이 마담", "테넷", "극장판 짱구는 못말려", /*"캐리비안 해적과 마법 다이아몬드"*/ };

		String[] images = { "daman.png", "ok.png", "tenet.png", "jjang.png", /*"캐리비안.jpg"*/ };

		String[] directors = { "홍원찬", "이철하", "크리스토퍼 놀란", "하시모토 마사카즈", /*"마리트 모움 온, 라스무스 A.실버르센"*/ };

		double[] rates = { 7.79 , 6.61 , 9.21 , 8.64 , 4.00 };

 

		JFrame f = new JFrame();

		f.setTitle("나의 영화앨범"); 

		f.getContentPane().setBackground(new Color(204, 255, 255));

		f.setSize(600, 500);

		f.getContentPane().setLayout(null);

 

		JLabel img = new JLabel("");//img : ""

		img.setIcon(new ImageIcon("D:\\VSproject\\workspace\\java09\\tenet.png"));

		img.setBounds(110, 130, 200, 273);

		f.getContentPane().add(img);

 

		JLabel lblNewLabel_2 = new JLabel("감독");

		lblNewLabel_2.setFont(new Font("함초롬돋움", Font.BOLD, 25));

		lblNewLabel_2.setBounds(332, 142, 92, 69);

		f.getContentPane().add(lblNewLabel_2);

 

		JLabel director = new JLabel(directors[2]); //label 명 : 배열 now : [2]

		director.setForeground(Color.RED);

		director.setFont(new Font("함초롬돋움", Font.BOLD, 18));

		director.setBounds(342, 207, 156, 25);

		f.getContentPane().add(director);

 

		JLabel rate = new JLabel(rates[2] + "");//String만 가능하기 때문에 String으로 만들어줌 // + "" : String형 들어가면 String 형으로 변환

		rate.setForeground(Color.RED);

		rate.setFont(new Font("함초롬돋움", Font.BOLD, 18));

		rate.setBounds(353, 289, 60, 25);

		f.getContentPane().add(rate);

 

		JLabel lblNewLabel_2_1 = new JLabel("평점");

		lblNewLabel_2_1.setFont(new Font("함초롬돋움", Font.BOLD, 25));

		lblNewLabel_2_1.setBounds(332, 231, 92, 69);

		f.getContentPane().add(lblNewLabel_2_1);

		

		JButton title = new JButton(titles[2]);

		title.setForeground(Color.DARK_GRAY);

		title.setBackground(Color.CYAN);

		title.setFont(new Font("함초롬돋움", Font.BOLD, 35));

		title.setBounds(110, 27, 363, 77);

 

		JButton btnNewButton = new JButton("<");

		btnNewButton.addActionListener(new ActionListener() {//인터페이스(원래 별개 클라스 따라서 int now를 main밖으로 빼줌)

			public void actionPerformed(ActionEvent e) {

				if (now == 0) {
					now = 5; //대입연산자 now 가 5 가 되도록 하라
				}
				now--;//1 [2]

				title.setText(titles[now]);

				ImageIcon icon = new ImageIcon(images[now]);

				img.setIcon(icon); //img icon부품 : text "" String

				director.setText(directors[now]);

				rate.setText(rates[now] + "");//double이어서 string변환

			}

		});

		btnNewButton.setForeground(Color.WHITE);

		btnNewButton.setBackground(new Color(0, 153, 204));

		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));

		btnNewButton.setBounds(0, 161, 60, 136);

		f.getContentPane().add(btnNewButton);

 

		JButton btnNewButton_1 = new JButton(">");

		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (now == 4) {
					now = -1; //대입연산자  now 가 -1 이 되도록 하라
				}
				
				now++;//3 [2]

				title.setText(titles[now]);

				ImageIcon icon = new ImageIcon(images[now]);

				img.setIcon(icon);

				director.setText(directors[now]);

				rate.setText(rates[now] + "");

			}

		});

		btnNewButton_1.setForeground(Color.WHITE);

		btnNewButton_1.setBackground(new Color(0, 153, 204));

		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 24));

		btnNewButton_1.setBounds(526, 161, 60, 136);

		f.getContentPane().add(btnNewButton_1);

 

		f.getContentPane().add(title);

		f.setVisible(true);

	}

}