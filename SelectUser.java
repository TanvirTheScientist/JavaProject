package login;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectUser {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SelectUser window = new SelectUser();
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
    public SelectUser() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 255, 255));
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnAdmin = new JButton("ADMIN");
        btnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin.main(null); // Ensure AdminLogin class is defined
                frame.dispose();
            }
        });
        btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAdmin.setBounds(149, 111, 116, 42);
        frame.getContentPane().add(btnAdmin);

        // Add customer button to login as a customer
        JButton btnCustomer = new JButton("CUSTOMER");
        btnCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User_Login.main(null); // Ensure User_Login class is defined
                frame.dispose();
            }
        });
        btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCustomer.setBounds(149, 164, 116, 42);
        frame.getContentPane().add(btnCustomer);
        
        JLabel lblNewLabel = new JLabel(">>>  WELCOME  <<<");
        lblNewLabel.setForeground(new Color(0, 0, 160));
        lblNewLabel.setFont(new Font("Sugarpunch DEMO", Font.BOLD, 22));
        lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 414, 32);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("ONLINE ORDER SYSTEM");
        lblNewLabel_1.setBackground(new Color(255, 128, 128));
        lblNewLabel_1.setForeground(new Color(255, 255, 0));
        lblNewLabel_1.setFont(new Font("Star Black Inline", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(10, 46, 414, 54);
        frame.getContentPane().add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Exit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Online Order System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnNewButton.setBounds(341, 232, 85, 21);
        frame.getContentPane().add(btnNewButton);
    }
}