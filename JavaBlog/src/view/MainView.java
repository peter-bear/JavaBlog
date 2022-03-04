package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.MyButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Label;


public class MainView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 1011);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MyButton myBtn = new MyButton(405, 486, 141, 52, 50, 50);
		myBtn.setSize(200, 80);
		myBtn.setLocation(414, 732);
		myBtn.setFontColor(Color.YELLOW);
		myBtn.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		myBtn.setBackgroundColor(Color.PINK);
		myBtn.setBtnText("Log In");
		
		
		myBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				myBtn.setBackgroundColor(Color.PINK);
				myBtn.setScaleSize(0.8);
				myBtn.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
//				myBtn.setBackgroundColor(Color.PINK);
				myBtn.setScaleSize(1.25);
				myBtn.repaint();
			}
			
			
		});
		
	
		contentPane.add(myBtn);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(201, 520, 141, 71);
		contentPane.add(lblNewLabel);
		
		
		
		MyButton myBtn2 = new MyButton(741, 510, 141, 52, 50, 50);
		myBtn2.setSize(200, 80);
		myBtn2.setLocation(735, 732);
		myBtn2.setFontColor(new Color(169, 169, 169));
		myBtn2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		myBtn2.setBtnText("Log In");
		myBtn2.setBackgroundColor(Color.decode("#c2fbd7"));
		
		myBtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
//				myBtn2.setBackgroundColor(Color.decode("#c2fbd7"));
				myBtn2.setScaleSize(0.8);
				myBtn2.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
//				myBtn2.setBackgroundColor(Color.decode("#c2fbd7"));
				myBtn2.setScaleSize(1.25);
				myBtn2.repaint();
			}
			
			
		});
		
	
		contentPane.add(myBtn2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(382, 68, 576, 381);
		BufferedImage img = null;
		Image rst = null;
		try {
			img = ImageIO.read(MainView.class.getResource("/image/tmp.png"));
			rst = img.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		lblNewLabel_1.setIcon(new ImageIcon(rst));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(216, 618, 141, 52);
		contentPane.add(lblNewLabel_2);

		
		
		
	}
}
