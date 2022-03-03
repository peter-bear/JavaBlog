package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.MyButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


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
		setBounds(100, 100, 1209, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MyButton myBtn = new MyButton(131, 89, 200, 100, 40, 40);
		myBtn.setFontColor(Color.YELLOW);
		myBtn.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		myBtn.setLocation(138, 217);
		myBtn.setBackgroundColor(Color.PINK);
		myBtn.setBtnText("This");
		
		
		myBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				myBtn.setBackgroundColor(Color.CYAN);
				myBtn.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				myBtn.setBackgroundColor(Color.PINK);
				myBtn.repaint();
			}
			
			
		});
		
	
		contentPane.add(myBtn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(242, 117, 222, 66);
		contentPane.add(lblNewLabel);
		
		
		
		MyButton myBtn2 = new MyButton(795, 429, 200, 100, 40, 40);
		myBtn2.setLocation(821, 407);
		myBtn2.setBackgroundColor(Color.PINK);
		myBtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				myBtn2.setBackgroundColor(Color.CYAN);
				myBtn2.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				myBtn2.setBackgroundColor(Color.PINK);
				myBtn2.repaint();
			}
			
			
		});
		
	
		contentPane.add(myBtn2);

		
		
		
	}
}
