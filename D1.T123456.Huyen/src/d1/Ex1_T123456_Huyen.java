package d1;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex1_T123456_Huyen extends JFrame{
	//Field - Instance Variable
	JLabel lblUsername;
	JTextField txtUserName;
	private JPasswordField txtPassword;
	
	//Hàm dựng - Constructor
	public Ex1_T123456_Huyen(){
		getContentPane().setBackground(SystemColor.activeCaption);
		setResizable(false);
		setSize(221, 300);
		setTitle("Warehouse Management");
		getContentPane().setLayout(null);
		//Label
		lblUsername = new JLabel("Username:");
		lblUsername.setLocation(30, 50);
		lblUsername.setSize(80, 25);
		//TextField
		txtUserName = new JTextField();
		txtUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUserName.setBackground(new Color(204, 255, 204));
			}

			@Override
			public void focusLost(FocusEvent e) {
				txtUserName.setBackground(Color.WHITE);
			}
			
		});
		txtUserName.setLocation(30, 72);
		txtUserName.setSize(150, 20);
		//Add to JFrame
		getContentPane().add(lblUsername);
		getContentPane().add(txtUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 103, 80, 25);
		getContentPane().add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPassword.setBackground(new Color(204, 255, 204));
			}

			@Override
			public void focusLost(FocusEvent e) {
				txtPassword.setBackground(Color.WHITE);
			}
			
			
		});
		txtPassword.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					login();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		txtPassword.setBounds(30, 126, 150, 20);
		getContentPane().add(txtPassword);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember Me");
		chckbxRememberMe.setBackground(SystemColor.activeCaption);
		chckbxRememberMe.setBounds(30, 155, 150, 23);
		getContentPane().add(chckbxRememberMe);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login();
			}
		});
		btnLogin.setBounds(72, 198, 89, 23);
		getContentPane().add(btnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(30, 25, 150, 14);
		getContentPane().add(lblLogin);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args){
		Ex1_T123456_Huyen gui =
			new Ex1_T123456_Huyen();
		gui.setVisible(true);
//		gui.setSize(300, 300);
		gui.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	}

	private void login() {
		String userName = txtUserName.getText();
		char[] passArray = txtPassword.getPassword();
		String password = new String(passArray);
		if(userName.equals("admin") && password.equals("root")){
			//OK
			MainWindow mainGUI = new MainWindow();
			mainGUI.setVisible(true);
			Ex1_T123456_Huyen.this.setVisible(false);
		}else{
			//Fail
			JOptionPane.showMessageDialog(Ex1_T123456_Huyen.this, 
					"Fail :(");
		}
	}
}