package advancedLIb;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LibrarianLogInPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pswPassword;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogInPage frame = new LibrarianLogInPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LibrarianLogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 70, 1122, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel AdminMainPanel = new JPanel();
		AdminMainPanel.setBackground(new Color(239, 222, 222));
		AdminMainPanel.setBounds(0, 0, 1122, 518);
		contentPane.add(AdminMainPanel);
		AdminMainPanel.setLayout(null);
		
		JLabel lbLibrarianTitle = new JLabel("LIBRARIAN LOGIN PAGE");
		lbLibrarianTitle.setForeground(new Color(0, 0, 128));
		lbLibrarianTitle.setVerticalAlignment(SwingConstants.TOP);
		lbLibrarianTitle.setFont(new Font("Stencil", Font.BOLD, 65));
		lbLibrarianTitle.setBounds(194, 132, 766, 53);
		AdminMainPanel.add(lbLibrarianTitle);
		
		JLabel lblNewLabel = new JLabel("Please enter username and password.");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(419, 196, 286, 20);
		AdminMainPanel.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(507, 252, 214, 34);
		AdminMainPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(399, 255, 95, 24);
		AdminMainPanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(399, 307, 95, 24);
		AdminMainPanel.add(lblPassword);
		
		pswPassword = new JPasswordField();
		pswPassword.setBounds(507, 304, 214, 34);
		AdminMainPanel.add(pswPassword);
		
		JCheckBox chckShowPass = new JCheckBox("Show password");
		chckShowPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckShowPass.isSelected()) {
					pswPassword.setEchoChar((char)0);
				} else {
					pswPassword.setEchoChar('*');
				}
			}
		});
		chckShowPass.setBounds(590, 343, 132, 23);
		AdminMainPanel.add(chckShowPass);
		
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setBackground(new Color(25, 25, 112));
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("Librarian_01") && pswPassword.getText().equals("LibOne") ||
					txtUsername.getText().equals("Librarian_02") && pswPassword.getText().equals("LibTwo") ||
					txtUsername.getText().equals("Librarian_03") && pswPassword.getText().equals("LibThree")) {
						JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN", "Librarian Login", JOptionPane.PLAIN_MESSAGE);
						BookRental book = new BookRental();
						book.setVisible(true);
						LibrarianLogInPage LibPage = new LibrarianLogInPage();
						dispose();
						
				}
						else if(!(txtUsername.getText().equals("Librarian_01")) && pswPassword.getText().equals("LibOne") ||
							    !(txtUsername.getText().equals("Librarian_02")) && pswPassword.getText().equals("LibTwo") ||
							    !(txtUsername.getText().equals("Librarian_03")) && pswPassword.getText().equals("LibThree")) 
						{
							    
									int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
									if(Incorrect == JOptionPane.OK_OPTION) {
										LibrarianLogInPage LibAgain = new LibrarianLogInPage();
										LibAgain.setVisible(true);
										dispose();
									}
						}
						else if(txtUsername.getText().equals("Librarian_01") && !(pswPassword.getText().equals("LibOne")) ||
								txtUsername.getText().equals("Librarian_02") && !(pswPassword.getText().equals("LibTwo")) ||
								txtUsername.getText().equals("Librarian_03") && !(pswPassword.getText().equals("LibThree"))) 
						{	
							
									int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
										if(Incorrect == JOptionPane.OK_OPTION) {
											LibrarianLogInPage LibAgain = new LibrarianLogInPage();
											LibAgain.setVisible(true);
											dispose();
								}
							
						}
						else if(!(txtUsername.getText().equals("Librarian_01")) && !(pswPassword.getText().equals("LibOne")) ||
								!(txtUsername.getText().equals("Librarian_02")) && !(pswPassword.getText().equals("LibTwo")) ||
							    !(txtUsername.getText().equals("Librarian_03")) && !(pswPassword.getText().equals("LibThree"))) 
						{
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LibrarianLogInPage LibAgain = new LibrarianLogInPage();
								LibAgain.setVisible(true);
								dispose();
							}
						}
					
					}		
		});
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogIn.setBounds(507, 391, 132, 34);
		AdminMainPanel.add(btnLogIn);
		
		JButton btnBackHome = new JButton("Back to LandingPage");
		btnBackHome.setForeground(new Color(255, 255, 255));
		btnBackHome.setBackground(new Color(25, 25, 112));
		btnBackHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInPage logIn = new LogInPage();
				logIn.setVisible(true);
				dispose();
			}
		});
		btnBackHome.setBounds(10, 11, 164, 23);
		AdminMainPanel.add(btnBackHome);
		
		JLabel imgMainBG = new JLabel("");
		imgMainBG.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\adminrealbg1500.jpg"));
		imgMainBG.setBounds(0, 0, 1122, 518);
		AdminMainPanel.add(imgMainBG);
		
	}

}
