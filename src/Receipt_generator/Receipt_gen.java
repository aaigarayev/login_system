package Receipt_generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt_gen {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt_gen window = new Receipt_gen();
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
	public Receipt_gen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblNewLabel_1 = new JLabel("Authentication system");
		lblNewLabel_1.setBounds(75, 0, 150, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(14, 85, 74, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(14, 137, 74, 16);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(120, 80, 150, 30);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(120, 130, 150, 30);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Gather info from user's inputs
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				// Check whether the info is matching the existing credentials. If it does, reset all inputs
				
				if (password.contains("qwerty") && username.contains("admin")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					
				} 
				
				// If not, show the error message
				
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login Credentials!", "Login Error!", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLogin.setBounds(6, 203, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset inputs");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Reset all inputs
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBounds(153, 203, 117, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exit button
				
				frame = new JFrame("Exit");
				
				// Getting confirmation from the user by showing a modal window with options
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Authentication Systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(81, 244, 117, 29);
		frame.getContentPane().add(btnExit);
	}
}
