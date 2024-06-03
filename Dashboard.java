package login;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import main.Accessories;
import main.Electronics;
import main.Food;
import main.MakeupAndCosmatics;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Dashboard {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Dashboard window = new Dashboard(null);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     * @param customerInfo 
     */
    public Dashboard(String customerInfo) {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("SHOP NOW !!");
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(32, 11, 373, 70);
        frame.getContentPane().add(lblNewLabel);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 79, 414, 2);
        frame.getContentPane().add(separator);

        JButton btnFood = new JButton("Food");
        btnFood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Food.main(null);
                frame.dispose();
            }
        });
        btnFood.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnFood.setBounds(50, 100, 150, 39);
        frame.getContentPane().add(btnFood);

        JButton btnElectronics = new JButton("Electronics");
        btnElectronics.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Electronics.main(null);
                frame.dispose();
            }
        });
        btnElectronics.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnElectronics.setBounds(250, 100, 150, 39);
        frame.getContentPane().add(btnElectronics);

        JButton btnAccessories = new JButton("Accessories");
        btnAccessories.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Accessories.main(null);
                frame.dispose();
            }
        });
        btnAccessories.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAccessories.setBounds(50, 170, 150, 39);
        frame.getContentPane().add(btnAccessories);

        JButton btnMakeupAndCosmetics = new JButton("Makeup & Cosmetics");
        btnMakeupAndCosmetics.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	MakeupAndCosmatics.main(null);
                frame.dispose();
            }
        });
        btnMakeupAndCosmetics.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnMakeupAndCosmetics.setBounds(250, 170, 150, 39);
        frame.getContentPane().add(btnMakeupAndCosmetics);

        JButton btnDBack = new JButton("Back");
        btnDBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User_Login.main(null);
                frame.dispose();
            }
        });
        btnDBack.setBounds(358, 233, 66, 17);
        frame.getContentPane().add(btnDBack);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 213, 414, 3);
        frame.getContentPane().add(separator_1);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}


