package UserSide;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Color;

public class login_Form {
	static Image emailImg = new ImageIcon(login_Form.class.getResource("../assets/email.png")).getImage().getScaledInstance(42,38,Image.SCALE_SMOOTH);
	static Image passwordImg = new ImageIcon(login_Form.class.getResource("../assets/password.png")).getImage().getScaledInstance(42,38,Image.SCALE_SMOOTH);
	static Image signInImg = new ImageIcon(login_Form.class.getResource("../assets/signIn.png")).getImage().getScaledInstance(496,461,Image.SCALE_SMOOTH);
	static Image logoImg = new ImageIcon(login_Form.class.getResource("../assets/logo.png")).getImage().getScaledInstance(48,40,Image.SCALE_SMOOTH);
	

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_Form window = new login_Form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 997, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel emaillbl = new JLabel("");
		emaillbl.setHorizontalAlignment(SwingConstants.CENTER);
		emaillbl.setBounds(533, 195, 46, 38);
		emaillbl.setIcon(new ImageIcon(emailImg));
		frame.getContentPane().add(emaillbl);
		
		textField = new JTextField();
		textField.setText("Email");
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(589, 195, 311, 38);
		frame.getContentPane().add(textField);
		
		JLabel passwordlbl = new JLabel("");
		passwordlbl.setHorizontalAlignment(SwingConstants.CENTER);
		passwordlbl.setBounds(533, 244, 46, 38);
		passwordlbl.setIcon(new ImageIcon(passwordImg));
		frame.getContentPane().add(passwordlbl);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordField.setBounds(589, 244, 311, 38);
		frame.getContentPane().add(passwordField);
		
		JPanel signUpBtn = new JPanel();
		signUpBtn.setLayout(null);
		signUpBtn.setBackground(new Color(51, 204, 153));
		signUpBtn.setBounds(589, 309, 133, 38);
		frame.getContentPane().add(signUpBtn);
		
		JLabel lblNewLabel_1 = new JLabel("SIGN UP");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(0, 0, 133, 38);
		signUpBtn.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome Back");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(51, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setBounds(589, 66, 408, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblToKeepConnected = new JLabel("To keep connected with us please login with your personal");
		lblToKeepConnected.setHorizontalAlignment(SwingConstants.LEFT);
		lblToKeepConnected.setForeground(new Color(51, 204, 153));
		lblToKeepConnected.setFont(new Font("Arial", Font.BOLD, 12));
		lblToKeepConnected.setBounds(589, 107, 408, 50);
		frame.getContentPane().add(lblToKeepConnected);
		
		JLabel lblInformationByEmail = new JLabel("information by email address and password.");
		lblInformationByEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformationByEmail.setForeground(new Color(51, 204, 153));
		lblInformationByEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblInformationByEmail.setBounds(589, 127, 408, 50);
		frame.getContentPane().add(lblInformationByEmail);
		
		JPanel createAccountbtn = new JPanel();
		createAccountbtn.setLayout(null);
		createAccountbtn.setBackground(Color.LIGHT_GRAY);
		createAccountbtn.setBounds(767, 309, 133, 38);
		frame.getContentPane().add(createAccountbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Create Account");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(0, 0, 133, 38);
		createAccountbtn.add(lblNewLabel_1_1);
		
		JLabel signInlbl = new JLabel("");
		signInlbl.setHorizontalAlignment(SwingConstants.CENTER);
		signInlbl.setBounds(10, 23, 496, 461);
		signInlbl.setIcon(new ImageIcon(signInImg));
		frame.getContentPane().add(signInlbl);
		
		JLabel logolbl = new JLabel("");
		logolbl.setHorizontalAlignment(SwingConstants.CENTER);
		logolbl.setBounds(10, 11, 48, 40);
		logolbl.setIcon(new ImageIcon(logoImg));
		frame.getContentPane().add(logolbl);
		
		JLabel lblNewLabel_2 = new JLabel("DressDreamer");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(68, 11, 330, 40);
		frame.getContentPane().add(lblNewLabel_2);
	}

	

}
