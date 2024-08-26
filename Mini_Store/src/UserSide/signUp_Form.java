package UserSide;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class signUp_Form {
	
	static Image nameImg = new ImageIcon(signUp_Form.class.getResource("../assets/name.png")).getImage().getScaledInstance(42,38,Image.SCALE_SMOOTH);
	static Image emailImg = new ImageIcon(signUp_Form.class.getResource("../assets/email.png")).getImage().getScaledInstance(42,38,Image.SCALE_SMOOTH);
	static Image passwordImg = new ImageIcon(signUp_Form.class.getResource("../assets/password.png")).getImage().getScaledInstance(42,38,Image.SCALE_SMOOTH);
	static Image logoImg = new ImageIcon(signUp_Form.class.getResource("../assets/logo.png")).getImage().getScaledInstance(90,81,Image.SCALE_SMOOTH);
	static Image loginImg = new ImageIcon(signUp_Form.class.getResource("../assets/loginIcon.png")).getImage().getScaledInstance(280,260,Image.SCALE_SMOOTH);

	private JFrame frame;
	private JTextField nametxt;
	private JTextField emailtxt;
	private JPasswordField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp_Form window = new signUp_Form();
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
	public signUp_Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 997, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setForeground(new Color(51, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(500, 156, 487, 50);
		frame.getContentPane().add(lblNewLabel);
		
		nametxt = new JTextField();
		nametxt.setText("Name");
		nametxt.setFont(new Font("Arial", Font.PLAIN, 18));
		nametxt.setBounds(588, 217, 311, 38);
		frame.getContentPane().add(nametxt);
		nametxt.setColumns(10);
		
		JLabel namelbl = new JLabel("");
		namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		namelbl.setBounds(532, 217, 46, 38);
		namelbl.setIcon(new ImageIcon(nameImg));
		frame.getContentPane().add(namelbl);
		
		JLabel emaillbl = new JLabel("");
		emaillbl.setHorizontalAlignment(SwingConstants.CENTER);
		emaillbl.setBounds(532, 266, 46, 38);
		emaillbl.setIcon(new ImageIcon(emailImg));
		frame.getContentPane().add(emaillbl);
		
		emailtxt = new JTextField();
		emailtxt.setText("Email");
		emailtxt.setFont(new Font("Arial", Font.PLAIN, 18));
		emailtxt.setColumns(10);
		emailtxt.setBounds(588, 266, 311, 38);
		frame.getContentPane().add(emailtxt);
		
		JLabel passwordlbl = new JLabel("");
		passwordlbl.setHorizontalAlignment(SwingConstants.CENTER);
		passwordlbl.setBounds(532, 315, 46, 38);
		passwordlbl.setIcon(new ImageIcon(passwordImg));
		frame.getContentPane().add(passwordlbl);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordtxt.setBounds(588, 315, 311, 38);
		frame.getContentPane().add(passwordtxt);
		
		JPanel signUpBtn = new JPanel();
		signUpBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				signUpBtn.setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				signUpBtn.setBackground(new Color(51, 204, 153));
			}
		});
		signUpBtn.setBackground(new Color(51, 204, 153));
		signUpBtn.setBounds(588, 380, 311, 38);
		frame.getContentPane().add(signUpBtn);
		signUpBtn.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SIGN UP");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 311, 38);
		signUpBtn.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 204, 153));
		panel_1.setBounds(0, 0, 490, 532);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel loginlbl = new JLabel("");
		loginlbl.setHorizontalAlignment(SwingConstants.CENTER);
		loginlbl.setBounds(114, 32, 263, 240);
		loginlbl.setIcon(new ImageIcon(loginImg));
		panel_1.add(loginlbl);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Back!");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 246, 470, 57);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To keep connected with us please");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 298, 470, 40);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("login with your personal info.");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(10, 332, 470, 40);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel signInbtn = new JPanel();
		signInbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				signInbtn.setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				signInbtn.setBackground(new Color(51, 204, 153));
			}
		});
		signInbtn.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		signInbtn.setLayout(null);
		signInbtn.setBackground(new Color(51, 204, 153));
		signInbtn.setBounds(146, 383, 198, 38);
		panel_1.add(signInbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("SIGN IN");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(0, 0, 198, 38);
		signInbtn.add(lblNewLabel_1_1);
		
		JLabel logolbl = new JLabel("");
		logolbl.setHorizontalAlignment(SwingConstants.CENTER);
		logolbl.setBounds(698, 64, 90, 81);
		logolbl.setIcon(new ImageIcon(logoImg));
		frame.getContentPane().add(logolbl);
	}
}
