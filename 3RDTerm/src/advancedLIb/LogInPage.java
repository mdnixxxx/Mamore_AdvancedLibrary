package advancedLIb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 70, 1122, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(new Color(176, 196, 222));
		MainPanel.setBounds(0, 0, 1122, 518);
		contentPane.add(MainPanel);
		MainPanel.setLayout(null);
		
		JLabel lbMLibrary = new JLabel("LIBRARY MANAGEMENT");
		lbMLibrary.setVerticalAlignment(SwingConstants.BOTTOM);
		lbMLibrary.setFont(new Font("Perpetua Titling MT", Font.BOLD, 65));
		lbMLibrary.setForeground(new Color(0, 0, 128));
		lbMLibrary.setBounds(126, 133, 860, 96);
		MainPanel.add(lbMLibrary);
		
		JLabel lbMiniDescription = new JLabel("Rent the book of your fantasy... You are?");
		lbMiniDescription.setForeground(new Color(240, 255, 255));
		lbMiniDescription.setFont(new Font("Sylfaen", Font.PLAIN, 19));
		lbMiniDescription.setBounds(384, 219, 339, 33);
		MainPanel.add(lbMiniDescription);
		
		JButton btnAdminLogIn = new JButton("Admin Login");
		btnAdminLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogInPage adminPage = new AdminLogInPage();
				adminPage.setVisible(true);
				dispose();
			}
		});
		btnAdminLogIn.setForeground(new Color(255, 255, 255));
		btnAdminLogIn.setBackground(new Color(25, 25, 112));
		btnAdminLogIn.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnAdminLogIn.setBounds(448, 263, 200, 45);
		MainPanel.add(btnAdminLogIn);
		
		JButton btnLibrarianLogIn = new JButton("Librarian Login");
		btnLibrarianLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogInPage LibrarianPage = new LibrarianLogInPage();
				LibrarianPage.setVisible(true);
				dispose();
			}
		});
		btnLibrarianLogIn.setForeground(Color.WHITE);
		btnLibrarianLogIn.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnLibrarianLogIn.setBackground(new Color(25, 25, 112));
		btnLibrarianLogIn.setBounds(448, 329, 200, 45);
		MainPanel.add(btnLibrarianLogIn);
	}
}
