package advancedLIb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeToNUAdmin extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeToNUAdmin frame = new WelcomeToNUAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomeToNUAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 70, 1122, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel WelcomePanel = new JPanel();
		WelcomePanel.setBounds(0, 0, 1112, 518);
		contentPane.add(WelcomePanel);
		WelcomePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO NU LIBRARY!!");
		lblNewLabel.setBackground(new Color(255, 255, 240));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 60));
		lblNewLabel.setBounds(145, 359, 810, 82);
		WelcomePanel.add(lblNewLabel);
		
		JButton btnHome = new JButton("Back Home");
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(25, 25, 112));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInPage logIn = new LogInPage();
				logIn.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(21, 11, 110, 23);
		WelcomePanel.add(btnHome);
		
		JButton btnExit = new JButton("Close Library");
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeToNUAdmin AdminWelcome = new WelcomeToNUAdmin();
				dispose();
			}
		});
		btnExit.setBackground(new Color(25, 25, 112));
		btnExit.setBounds(930, 11, 159, 23);
		WelcomePanel.add(btnExit);
		
		JLabel imgNULogo = new JLabel("");
		imgNULogo.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\dezr5hr-d3e6b399-4221-45f4-8527-5e0e70bfb019-removebg-preview.png"));
		imgNULogo.setBounds(191, 69, 707, 264);
		WelcomePanel.add(imgNULogo);
		
		JLabel imgBG = new JLabel("");
		imgBG.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\NU-CHED.jpg"));
		imgBG.setBounds(0, 0, 1112, 518);
		WelcomePanel.add(imgBG);
		
	}
}
