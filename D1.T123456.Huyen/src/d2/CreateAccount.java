package d2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class CreateAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount frame = new CreateAccount();
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
	public CreateAccount() {
		setTitle("Regitster New Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//Page 1 chứa thông tin tài khoản và nút Next
		JPanel addAccountPane = new JPanel();
		addAccountPane.setBackground(SystemColor.inactiveCaption);
		contentPane.add(addAccountPane, "name_11097634206304");
		addAccountPane.setLayout(new BorderLayout(0, 0));
		
		//Panel chứa thông tin tài khoản
		JPanel accountInfoPane = new JPanel();
		accountInfoPane.setBackground(SystemColor.inactiveCaption);
		addAccountPane.add(accountInfoPane, BorderLayout.CENTER);
		accountInfoPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Your Account");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(76, 11, 279, 40);
		accountInfoPane.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(39, 77, 93, 14);
		accountInfoPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(39, 91, 176, 20);
		accountInfoPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(225, 77, 93, 14);
		accountInfoPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(225, 91, 176, 20);
		accountInfoPane.add(textField_1);
		
		JLabel lblChoseYourUsername = new JLabel("Chose your username");
		lblChoseYourUsername.setBounds(39, 122, 176, 14);
		accountInfoPane.add(lblChoseYourUsername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 136, 362, 20);
		accountInfoPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(39, 187, 362, 20);
		accountInfoPane.add(passwordField);
		
		JLabel lblCreateAPassword = new JLabel("Create a password");
		lblCreateAPassword.setBounds(39, 167, 176, 14);
		accountInfoPane.add(lblCreateAPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setBounds(39, 218, 176, 14);
		accountInfoPane.add(lblConfirmPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(39, 238, 362, 20);
		accountInfoPane.add(passwordField_1);
		
		JLabel lblBirthdaydmy = new JLabel("Birthday (d/m/y)");
		lblBirthdaydmy.setBounds(39, 269, 93, 14);
		accountInfoPane.add(lblBirthdaydmy);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 283, 103, 20);
		accountInfoPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(152, 283, 119, 20);
		accountInfoPane.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(282, 283, 119, 20);
		accountInfoPane.add(textField_4);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(39, 314, 46, 14);
		accountInfoPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(39, 335, 109, 23);
		rdbtnMale.setOpaque(false);
		accountInfoPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(152, 335, 109, 23);
		rdbtnFemale.setOpaque(false);
		accountInfoPane.add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(263, 335, 109, 23);
		rdbtnOther.setOpaque(false);
		accountInfoPane.add(rdbtnOther);
		
		JLabel lblMobilePhone = new JLabel("Mobile Phone");
		lblMobilePhone.setBounds(39, 373, 176, 14);
		accountInfoPane.add(lblMobilePhone);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(39, 393, 362, 20);
		accountInfoPane.add(passwordField_2);
		
		JCheckBox chckbxIAgreedWith = new JCheckBox("I agreed with The Terms of Service");
		chckbxIAgreedWith.setBounds(35, 428, 246, 23);
		chckbxIAgreedWith.setOpaque(false);
		accountInfoPane.add(chckbxIAgreedWith);
		
		//Panel chứa nút Next
		JPanel buttonPane = new JPanel();
		buttonPane.setPreferredSize(new Dimension(100, 50));
		buttonPane.setBackground(SystemColor.activeCaption);
		addAccountPane.add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(168, 11, 101, 23);
		buttonPane.add(btnNext);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_11106779414440");
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWelcome.setBounds(164, 57, 96, 14);
		panel.add(lblWelcome);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(CreateAccount.class.getResource("/images/user.png")));
		label_1.setBounds(77, 82, 256, 231);
		panel.add(label_1);
		
		JLabel lblThanksForCreating = new JLabel("Thanks for creating an accont!");
		lblThanksForCreating.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanksForCreating.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblThanksForCreating.setBounds(75, 317, 266, 14);
		panel.add(lblThanksForCreating);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cards = (CardLayout)contentPane.getLayout();
				cards.previous(contentPane);
			}
		});
		btnPrevious.setBounds(146, 443, 101, 23);
		panel.add(btnPrevious);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Kiểm tra thông tin hợp lệ
				
				//TODO: Lưu thông tin vào cơ sở dữ liệu
				
				//TODO: Chuyển đến màn hình thông báo thành công
				CardLayout cards = (CardLayout)contentPane.getLayout();
				cards.next(contentPane);
				//cards.previous(contentPane);
			}
		});
		
	}
}
