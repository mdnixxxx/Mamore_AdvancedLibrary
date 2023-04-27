package advancedLIb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BookRental extends JFrame {

	private JPanel contentPane;
	private JTextField txtChoice;
	static int book0Copy = 3;
	static int book1Copy = 2;
	static int book2Copy = 3;
	static JLabel lblBook0Copies = new JLabel();
	static JLabel lblBook1Copies = new JLabel();
	static JLabel lblBook2Copies = new JLabel();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookRental frame = new BookRental();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookRental() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 70, 1122, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(25, 25, 112));
		pnlHeader.setBounds(0, 0, 1108, 141);
		contentPane.add(pnlHeader);
		pnlHeader.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKS AVAILABLE");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 70));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(232, 41, 607, 73);
		pnlHeader.add(lblNewLabel);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInPage LogPage = new LogInPage();
				LogPage.setVisible(true);
				dispose();
			}
		});
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(25, 25, 112));
		btnHome.setBounds(10, 11, 89, 23);
		pnlHeader.add(btnHome);
		
		JButton btnClose = new JButton("Home");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookRental BookFlow = new BookRental();
				dispose();
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(new Color(25, 25, 112));
		btnClose.setBounds(1009, 11, 89, 23);
		pnlHeader.add(btnClose);
		
		JPanel pnlInside = new JPanel();
		pnlInside.setBackground(new Color(255, 255, 224));
		pnlInside.setBounds(0, 141, 1108, 377);
		contentPane.add(pnlInside);
		pnlInside.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 327, 1029, 2);
		pnlInside.add(separator);
		
		JLabel imgBook0 = new JLabel("");
		imgBook0.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\the alchemist real.jpg"));
		imgBook0.setBounds(147, 26, 175, 181);
		pnlInside.add(imgBook0);
		
		JLabel imgBook1 = new JLabel("");
		imgBook1.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\the-great-adventures-of-sherlock-holmes-1 real.jpg"));
		imgBook1.setBounds(454, 26, 175, 181);
		pnlInside.add(imgBook1);
		
		JLabel imgBook2 = new JLabel("");
		imgBook2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\lib images\\you-ve-reached-sam real.jpg"));
		imgBook2.setBounds(764, 26, 175, 181);
		pnlInside.add(imgBook2);
		
		JLabel lblBook0Title = new JLabel("The Alchemist");
		lblBook0Title.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblBook0Title.setBounds(147, 218, 175, 14);
		pnlInside.add(lblBook0Title);
		
		JLabel lblBook1Titlep1 = new JLabel("The Great Adventures of");
		lblBook1Titlep1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblBook1Titlep1.setBounds(454, 218, 175, 14);
		pnlInside.add(lblBook1Titlep1);
		
		JLabel lblBook1Titlep2 = new JLabel("Sherlock Holmes");
		lblBook1Titlep2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblBook1Titlep2.setBounds(454, 232, 175, 14);
		pnlInside.add(lblBook1Titlep2);
		
		JLabel lblBook2Title = new JLabel("You've Reached Sam");
		lblBook2Title.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblBook2Title.setBounds(764, 220, 175, 14);
		pnlInside.add(lblBook2Title);
		
		JLabel lblBook0key = new JLabel("[0]");
		lblBook0key.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBook0key.setBounds(117, 27, 25, 23);
		pnlInside.add(lblBook0key);
		
		JLabel lblBook1key = new JLabel("[1]");
		lblBook1key.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBook1key.setBounds(427, 27, 25, 23);
		pnlInside.add(lblBook1key);
		
		JLabel lblBook2key = new JLabel("[2]");
		lblBook2key.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBook2key.setBounds(739, 26, 25, 23);
		pnlInside.add(lblBook2key);
		
		JLabel lblBook0Author = new JLabel("By: Paulo Coelho");
		lblBook0Author.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook0Author.setBounds(147, 243, 175, 14);
		pnlInside.add(lblBook0Author);
		lblBook0Copies.setVerticalAlignment(SwingConstants.TOP);
		
		lblBook0Copies.setText("3");
		lblBook0Copies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook0Copies.setBounds(258, 293, 30, 14);
		pnlInside.add(lblBook0Copies);
		
		JLabel lblBook1Author = new JLabel("By: Sir Arthur Conan Doyle");
		lblBook1Author.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook1Author.setBounds(454, 257, 175, 14);
		pnlInside.add(lblBook1Author);
		lblBook1Copies.setVerticalAlignment(SwingConstants.TOP);
		
		lblBook1Copies.setText("2");
		lblBook1Copies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook1Copies.setBounds(564, 302, 30, 14);
		pnlInside.add(lblBook1Copies);
		
		JLabel lblBook2Author = new JLabel("By: Dustin Thao");
		lblBook2Author.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook2Author.setBounds(764, 245, 175, 14);
		pnlInside.add(lblBook2Author);
		lblBook2Copies.setVerticalAlignment(SwingConstants.TOP);
		
		lblBook2Copies.setText("3");
		lblBook2Copies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBook2Copies.setBounds(875, 294, 30, 14);
		pnlInside.add(lblBook2Copies);
		
		JLabel lblGenre0 = new JLabel("Genre: Novel, Quest, Adventure");
		lblGenre0.setForeground(new Color(105, 105, 105));
		lblGenre0.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenre0.setBounds(147, 268, 213, 14);
		pnlInside.add(lblGenre0);
		
		JLabel lblGenre1 = new JLabel("Genre: Fiction, Mystery");
		lblGenre1.setForeground(SystemColor.controlDkShadow);
		lblGenre1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenre1.setBounds(452, 277, 213, 14);
		pnlInside.add(lblGenre1);
		
		JLabel lblGenre2 = new JLabel("Genre: Fiction");
		lblGenre2.setForeground(SystemColor.controlDkShadow);
		lblGenre2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenre2.setBounds(764, 270, 213, 14);
		pnlInside.add(lblGenre2);
		
		JLabel lblAvailableBooks = new JLabel("Available Copies: ");
		lblAvailableBooks.setVerticalAlignment(SwingConstants.TOP);
		lblAvailableBooks.setForeground(new Color(169, 169, 169));
		lblAvailableBooks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableBooks.setBounds(147, 293, 115, 23);
		pnlInside.add(lblAvailableBooks);
		
		JLabel lblAvailableCopies = new JLabel("Available Copies: ");
		lblAvailableCopies.setForeground(new Color(169, 169, 169));
		lblAvailableCopies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableCopies.setBounds(454, 302, 127, 14);
		pnlInside.add(lblAvailableCopies);
		
		JLabel lblAvailableBooks_1_1 = new JLabel("Available Copies: ");
		lblAvailableBooks_1_1.setForeground(new Color(169, 169, 169));
		lblAvailableBooks_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailableBooks_1_1.setBounds(764, 295, 127, 14);
		pnlInside.add(lblAvailableBooks_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the key of the book you want to rent.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(219, 340, 287, 14);
		pnlInside.add(lblNewLabel_1);
		
		txtChoice = new JTextField();
		txtChoice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if (txtChoice.getText().equals(0) ||
				txtChoice.getText().equals(1) ||
				txtChoice.getText().equals(2)) {
				txtChoice.setText("");
			}
			else {
				txtChoice.selectAll();
			}
		}			@Override
			public void focusLost(FocusEvent e) {
			if(txtChoice.getText().equals("")) {
				txtChoice.setText("Enter a number");
			}
			}
});
		txtChoice.setBounds(516, 339, 96, 20);
		pnlInside.add(txtChoice);
		txtChoice.setColumns(10);
		
		JButton btnNewButton = new JButton("Rent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<OtherBooks> book = new ArrayList<>();

				OtherBooks bookNum0 = new OtherBooks();
				bookNum0.title = "The Alchemist";
				bookNum0.author = "Paulo Cuelho";

				OtherBooks bookNum1 = new OtherBooks();
				bookNum1.title = "The Great Adventures of Sherlock Holmes";
				bookNum1.author = "Sir Arthur Conan Doyle";

				OtherBooks bookNum2 = new OtherBooks();
				bookNum2.title = "You've Reached Sam";
				bookNum2.author = "Dustin Thao";

				book.add(bookNum0);
				book.add(bookNum1);
				book.add(bookNum2);
				
				try {
					int Bookchoice = Integer.parseInt(txtChoice.getText());
					OtherBooks Book = book.get(Bookchoice);
					if (Bookchoice == 0 && book0Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					} else if (Bookchoice == 1 && book1Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					} else if (Bookchoice == 2 && book2Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					}

					if (Bookchoice == 0 && book0Copy >= 1) {
						int choose = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(Bookchoice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book0Copy -= 1;
						lblBook0Copies.setText(Integer.toString(book0Copy));
						if (choose == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Ask",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogInPage libPage = new LibrarianLogInPage();
								libPage.setVisible(true);
							}
						}
					} else if (Bookchoice == 1 && book1Copy >= 1) {

						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(Bookchoice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book1Copy -= 1;
						lblBook1Copies.setText(Integer.toString(book1Copy));
						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Rent Again",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogInPage libPage = new LibrarianLogInPage();
								libPage.setVisible(true);
							}
						}
					} else if (Bookchoice == 2 && book2Copy >= 1) {
						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(Bookchoice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book2Copy -= 1;
						lblBook2Copies.setText(Integer.toString(book2Copy));
						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Rent Again",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogInPage lib = new LibrarianLogInPage();
								lib.setVisible(true);
							}
						}
					}

				} catch (NumberFormatException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INPUT MUST BE IN THE CHOICES, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookRental book1 = new BookRental();
						book1.setVisible(true);
					}
				} catch (IndexOutOfBoundsException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INDEX DOES NOT EXIST, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookRental book1 = new BookRental();
						book1.setVisible(true);
					}
				}
			}

		});
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(652, 338, 89, 23);
		pnlInside.add(btnNewButton);
	}
}
