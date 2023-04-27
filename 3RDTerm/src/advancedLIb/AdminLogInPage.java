package advancedLIb;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;


public class AdminLogInPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pswPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogInPage frame = new AdminLogInPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminLogInPage() {
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
		
		JLabel lbAdminTitle = new JLabel("ADMIN LOGIN PAGE");
		lbAdminTitle.setForeground(new Color(0, 0, 128));
		lbAdminTitle.setVerticalAlignment(SwingConstants.TOP);
		lbAdminTitle.setFont(new Font("Stencil", Font.BOLD, 65));
		lbAdminTitle.setBounds(246, 132, 614, 53);
		AdminMainPanel.add(lbAdminTitle);
		
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
				if(txtUsername.getText().equals("Admin_1") && pswPassword.getText().equals("adminone") ||
					txtUsername.getText().equals("Admin_2") && pswPassword.getText().equals("admintwo") ||
					txtUsername.getText().equals("Admin_3") && pswPassword.getText().equals("adminthree")) 
						{
								int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
								if(success == JOptionPane.OK_OPTION) {
									WelcomeToNUAdmin AdminWelcome = new WelcomeToNUAdmin();
									AdminWelcome.setVisible(true);
									AdminLogInPage AdminPage = new AdminLogInPage();
									AdminPage.dispose();
								}		
								
						}
						else if(!(txtUsername.getText().equals("Admin_1")) && pswPassword.getText().equals("adminone") ||
							    !(txtUsername.getText().equals("Admin_2")) && pswPassword.getText().equals("admintwo") ||
							    !(txtUsername.getText().equals("Admin_3")) && pswPassword.getText().equals("adminthree")) 
						{
							    
									int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
									if(Incorrect == JOptionPane.OK_OPTION) {
										AdminLogInPage AdminAgain = new AdminLogInPage();
										AdminAgain.setVisible(true);
										dispose();
									}
						}
						else if(txtUsername.getText().equals("Admin_1") && !(pswPassword.getText().equals("adminone")) ||
								txtUsername.getText().equals("Admin_2") && !(pswPassword.getText().equals("admintwo")) ||
								txtUsername.getText().equals("Admin_3") && !(pswPassword.getText().equals("adminthree"))) 
						{	
							
									int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
										if(Incorrect == JOptionPane.OK_OPTION) {
											AdminLogInPage AdminAgain = new AdminLogInPage();
											AdminAgain.setVisible(true);
											dispose();
								}
							
						}
						else if(!(txtUsername.getText().equals("Admin_1")) && !(pswPassword.getText().equals("adminone")) ||
								!(txtUsername.getText().equals("Admin_2")) && !(pswPassword.getText().equals("admintwo")) ||
							    !(txtUsername.getText().equals("Admin_3")) && !(pswPassword.getText().equals("adminthree"))) 
						{
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								AdminLogInPage AdminAgain = new AdminLogInPage();
								AdminAgain.setVisible(true);
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
		
		JLabel lblAdminMainBG = new JLabel("");
		lblAdminMainBG.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\adminrealbg1500.jpg"));
		lblAdminMainBG.setBounds(0, 0, 1112, 518);
		AdminMainPanel.add(lblAdminMainBG);
		
		
	}
}
