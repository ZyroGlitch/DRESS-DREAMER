package UserSide;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class dashboard {
	static Image dress1 = new ImageIcon(dashboard.class.getResource("../assets/dress1.png")).getImage().getScaledInstance(220,316,Image.SCALE_SMOOTH);

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
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
	public dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 1600, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 1600, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DressDreamer");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(10, 0, 294, 61);
		panel.add(lblNewLabel);
		
		JLabel logoutlbl = new JLabel("LOGOUT");
		logoutlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				logoutlbl.setForeground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				logoutlbl.setForeground(Color.WHITE);
			}
		});
		logoutlbl.setForeground(Color.WHITE);
		logoutlbl.setFont(new Font("Arial Black", Font.BOLD, 18));
		logoutlbl.setHorizontalAlignment(SwingConstants.CENTER);
		logoutlbl.setBounds(1462, 11, 128, 39);
		panel.add(logoutlbl);
		
		JLabel profilelbl = new JLabel("PROFILE");
		profilelbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				profilelbl.setForeground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				profilelbl.setForeground(Color.WHITE);
			}
		});
		profilelbl.setHorizontalAlignment(SwingConstants.CENTER);
		profilelbl.setForeground(Color.WHITE);
		profilelbl.setFont(new Font("Arial Black", Font.BOLD, 18));
		profilelbl.setBounds(1324, 11, 128, 39);
		panel.add(profilelbl);
		
		JLabel productlbl = new JLabel("PRODUCT");
		productlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				productlbl.setForeground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				productlbl.setForeground(Color.WHITE);
			}
		});
		productlbl.setHorizontalAlignment(SwingConstants.CENTER);
		productlbl.setForeground(Color.WHITE);
		productlbl.setFont(new Font("Arial Black", Font.BOLD, 18));
		productlbl.setBounds(1186, 11, 128, 39);
		panel.add(productlbl);
		
		JLabel productlbl_1 = new JLabel("PRODUCT");
		productlbl_1.setHorizontalAlignment(SwingConstants.LEFT);
		productlbl_1.setForeground(Color.PINK);
		productlbl_1.setFont(new Font("Arial Black", Font.BOLD, 26));
		productlbl_1.setBounds(21, 85, 365, 45);
		frame.getContentPane().add(productlbl_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(21, 141, 317, 407);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel dress1lbl = new JLabel("");
		dress1lbl.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl.setBounds(10, 11, 297, 305);
		dress1lbl.setIcon(new ImageIcon(dress1));
		panel_1.add(dress1lbl);
		
		JLabel lblNewLabel_1 = new JLabel("$150");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 316, 297, 39);
		panel_1.add(lblNewLabel_1);
		
		JPanel signUpBtn = new JPanel();
		signUpBtn.setLayout(null);
		signUpBtn.setBackground(Color.CYAN);
		signUpBtn.setBounds(20, 358, 138, 38);
		panel_1.add(signUpBtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("PURCHASE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(0, 0, 138, 38);
		signUpBtn.add(lblNewLabel_1_1);
		
		JPanel signUpBtn_1 = new JPanel();
		signUpBtn_1.setLayout(null);
		signUpBtn_1.setBackground(new Color(255, 153, 255));
		signUpBtn_1.setBounds(169, 358, 138, 38);
		panel_1.add(signUpBtn_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CART");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(0, 0, 138, 38);
		signUpBtn_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(21, 582, 317, 407);
		frame.getContentPane().add(panel_1_2);
		
		JLabel dress1lbl_2 = new JLabel("");
		dress1lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_2.setBounds(10, 11, 297, 305);
		panel_1_2.add(dress1lbl_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("$150");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 316, 297, 39);
		panel_1_2.add(lblNewLabel_1_3);
		
		JPanel signUpBtn_3 = new JPanel();
		signUpBtn_3.setLayout(null);
		signUpBtn_3.setBackground(Color.CYAN);
		signUpBtn_3.setBounds(20, 358, 138, 38);
		panel_1_2.add(signUpBtn_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("PURCHASE");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_3.setBounds(0, 0, 138, 38);
		signUpBtn_3.add(lblNewLabel_1_1_3);
		
		JPanel signUpBtn_1_2 = new JPanel();
		signUpBtn_1_2.setLayout(null);
		signUpBtn_1_2.setBackground(new Color(255, 153, 255));
		signUpBtn_1_2.setBounds(169, 358, 138, 38);
		panel_1_2.add(signUpBtn_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("CART");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(0, 0, 138, 38);
		signUpBtn_1_2.add(lblNewLabel_1_1_1_2);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_6.setBackground(Color.WHITE);
		panel_1_6.setBounds(1273, 141, 317, 407);
		frame.getContentPane().add(panel_1_6);
		
		JLabel dress1lbl_6 = new JLabel("");
		dress1lbl_6.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_6.setBounds(10, 11, 297, 305);
		panel_1_6.add(dress1lbl_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("$150");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_7.setBounds(10, 316, 297, 39);
		panel_1_6.add(lblNewLabel_1_7);
		
		JPanel signUpBtn_7 = new JPanel();
		signUpBtn_7.setLayout(null);
		signUpBtn_7.setBackground(Color.CYAN);
		signUpBtn_7.setBounds(20, 358, 138, 38);
		panel_1_6.add(signUpBtn_7);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("PURCHASE");
		lblNewLabel_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_1_7.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_7.setBounds(0, 0, 138, 38);
		signUpBtn_7.add(lblNewLabel_1_1_7);
		
		JPanel signUpBtn_1_6 = new JPanel();
		signUpBtn_1_6.setLayout(null);
		signUpBtn_1_6.setBackground(new Color(255, 153, 255));
		signUpBtn_1_6.setBounds(169, 358, 138, 38);
		panel_1_6.add(signUpBtn_1_6);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("CART");
		lblNewLabel_1_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_6.setBounds(0, 0, 138, 38);
		signUpBtn_1_6.add(lblNewLabel_1_1_1_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setLayout(null);
		panel_1_7.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_7.setBackground(Color.WHITE);
		panel_1_7.setBounds(1273, 582, 317, 407);
		frame.getContentPane().add(panel_1_7);
		
		JLabel dress1lbl_7 = new JLabel("");
		dress1lbl_7.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_7.setBounds(10, 11, 297, 305);
		panel_1_7.add(dress1lbl_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("$150");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setForeground(Color.BLACK);
		lblNewLabel_1_8.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_8.setBounds(10, 316, 297, 39);
		panel_1_7.add(lblNewLabel_1_8);
		
		JPanel signUpBtn_8 = new JPanel();
		signUpBtn_8.setLayout(null);
		signUpBtn_8.setBackground(Color.CYAN);
		signUpBtn_8.setBounds(20, 358, 138, 38);
		panel_1_7.add(signUpBtn_8);
		
		JLabel lblNewLabel_1_1_8 = new JLabel("PURCHASE");
		lblNewLabel_1_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_8.setForeground(Color.BLACK);
		lblNewLabel_1_1_8.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_8.setBounds(0, 0, 138, 38);
		signUpBtn_8.add(lblNewLabel_1_1_8);
		
		JPanel signUpBtn_1_7 = new JPanel();
		signUpBtn_1_7.setLayout(null);
		signUpBtn_1_7.setBackground(new Color(255, 153, 255));
		signUpBtn_1_7.setBounds(169, 358, 138, 38);
		panel_1_7.add(signUpBtn_1_7);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("CART");
		lblNewLabel_1_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_7.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_7.setBounds(0, 0, 138, 38);
		signUpBtn_1_7.add(lblNewLabel_1_1_1_7);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBounds(861, 141, 317, 407);
		frame.getContentPane().add(panel_1_4);
		
		JLabel dress1lbl_4 = new JLabel("");
		dress1lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_4.setBounds(10, 11, 297, 305);
		panel_1_4.add(dress1lbl_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("$150");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(10, 316, 297, 39);
		panel_1_4.add(lblNewLabel_1_5);
		
		JPanel signUpBtn_5 = new JPanel();
		signUpBtn_5.setLayout(null);
		signUpBtn_5.setBackground(Color.CYAN);
		signUpBtn_5.setBounds(20, 358, 138, 38);
		panel_1_4.add(signUpBtn_5);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("PURCHASE");
		lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_1_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_5.setBounds(0, 0, 138, 38);
		signUpBtn_5.add(lblNewLabel_1_1_5);
		
		JPanel signUpBtn_1_4 = new JPanel();
		signUpBtn_1_4.setLayout(null);
		signUpBtn_1_4.setBackground(new Color(255, 153, 255));
		signUpBtn_1_4.setBounds(169, 358, 138, 38);
		panel_1_4.add(signUpBtn_1_4);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("CART");
		lblNewLabel_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_4.setBounds(0, 0, 138, 38);
		signUpBtn_1_4.add(lblNewLabel_1_1_1_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(861, 582, 317, 407);
		frame.getContentPane().add(panel_1_1);
		
		JLabel dress1lbl_1 = new JLabel("");
		dress1lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_1.setBounds(10, 11, 297, 305);
		panel_1_1.add(dress1lbl_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("$150");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 316, 297, 39);
		panel_1_1.add(lblNewLabel_1_2);
		
		JPanel signUpBtn_2 = new JPanel();
		signUpBtn_2.setLayout(null);
		signUpBtn_2.setBackground(Color.CYAN);
		signUpBtn_2.setBounds(20, 358, 138, 38);
		panel_1_1.add(signUpBtn_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("PURCHASE");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(0, 0, 138, 38);
		signUpBtn_2.add(lblNewLabel_1_1_2);
		
		JPanel signUpBtn_1_1 = new JPanel();
		signUpBtn_1_1.setLayout(null);
		signUpBtn_1_1.setBackground(new Color(255, 153, 255));
		signUpBtn_1_1.setBounds(169, 358, 138, 38);
		panel_1_1.add(signUpBtn_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("CART");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(0, 0, 138, 38);
		signUpBtn_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(441, 141, 317, 407);
		frame.getContentPane().add(panel_1_3);
		
		JLabel dress1lbl_3 = new JLabel("");
		dress1lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_3.setBounds(10, 11, 297, 305);
		panel_1_3.add(dress1lbl_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("$150");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(10, 316, 297, 39);
		panel_1_3.add(lblNewLabel_1_4);
		
		JPanel signUpBtn_4 = new JPanel();
		signUpBtn_4.setLayout(null);
		signUpBtn_4.setBackground(Color.CYAN);
		signUpBtn_4.setBounds(20, 358, 138, 38);
		panel_1_3.add(signUpBtn_4);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("PURCHASE");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_4.setBounds(0, 0, 138, 38);
		signUpBtn_4.add(lblNewLabel_1_1_4);
		
		JPanel signUpBtn_1_3 = new JPanel();
		signUpBtn_1_3.setLayout(null);
		signUpBtn_1_3.setBackground(new Color(255, 153, 255));
		signUpBtn_1_3.setBounds(169, 358, 138, 38);
		panel_1_3.add(signUpBtn_1_3);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("CART");
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_3.setBounds(0, 0, 138, 38);
		signUpBtn_1_3.add(lblNewLabel_1_1_1_3);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1_5.setBackground(Color.WHITE);
		panel_1_5.setBounds(441, 582, 317, 407);
		frame.getContentPane().add(panel_1_5);
		
		JLabel dress1lbl_5 = new JLabel("");
		dress1lbl_5.setHorizontalAlignment(SwingConstants.CENTER);
		dress1lbl_5.setBounds(10, 11, 297, 305);
		panel_1_5.add(dress1lbl_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("$150");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(10, 316, 297, 39);
		panel_1_5.add(lblNewLabel_1_6);
		
		JPanel signUpBtn_6 = new JPanel();
		signUpBtn_6.setLayout(null);
		signUpBtn_6.setBackground(Color.CYAN);
		signUpBtn_6.setBounds(20, 358, 138, 38);
		panel_1_5.add(signUpBtn_6);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("PURCHASE");
		lblNewLabel_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_1_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_6.setBounds(0, 0, 138, 38);
		signUpBtn_6.add(lblNewLabel_1_1_6);
		
		JPanel signUpBtn_1_5 = new JPanel();
		signUpBtn_1_5.setLayout(null);
		signUpBtn_1_5.setBackground(new Color(255, 153, 255));
		signUpBtn_1_5.setBounds(169, 358, 138, 38);
		panel_1_5.add(signUpBtn_1_5);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("CART");
		lblNewLabel_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_5.setBounds(0, 0, 138, 38);
		signUpBtn_1_5.add(lblNewLabel_1_1_1_5);
	}

}
