package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import login.Dashboard;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MakeupAndCosmatics extends MakeupAndCosmaticsDetails {

    private JFrame frame;
    private JTextField textFieldLipstick;
    private JTextField textFieldMascara;
    private JTextField textFieldKajal;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MakeupAndCosmatics window = new MakeupAndCosmatics();
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
    public MakeupAndCosmatics() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 474);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblTitle = new JLabel("Makeup and Cosmetics");
        lblTitle.setBackground(new Color(255, 128, 0));
        lblTitle.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
        lblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(10, 11, 414, 66);
        frame.getContentPane().add(lblTitle);
        
        JPanel panelLipstick = new JPanel();
        panelLipstick.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panelLipstick.setBackground(new Color(192, 192, 192));
        panelLipstick.setBounds(10, 88, 414, 89);
        frame.getContentPane().add(panelLipstick);
        panelLipstick.setLayout(null);
        
        JLabel lblLipstick = new JLabel("");
        lblLipstick.setBounds(10, 11, 67, 67);
        panelLipstick.add(lblLipstick);
        
        JTextPane txtpnLipstick = new JTextPane();
        txtpnLipstick.setText("Lipstick");
        txtpnLipstick.setBounds(101, 11, 150, 45);
        panelLipstick.add(txtpnLipstick);
        
        JLabel lblLipstickPrice = new JLabel("300 BDT");
        lblLipstickPrice.setBounds(101, 67, 78, 14);
        panelLipstick.add(lblLipstickPrice);
        
        textFieldLipstick = new JTextField();
        textFieldLipstick.setBounds(318, 25, 86, 20);
        panelLipstick.add(textFieldLipstick);
        textFieldLipstick.setColumns(10);
        
        JLabel lblAddQtyLipstick = new JLabel("Add Qty");
        lblAddQtyLipstick.setBounds(343, 11, 46, 14);
        panelLipstick.add(lblAddQtyLipstick);
        
        JButton btnLipstickOk = new JButton("Ok");
        btnLipstickOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lipstickQuantityText = textFieldLipstick.getText();
                try {
                    int lipstickQuantity = Integer.parseInt(lipstickQuantityText);
                    setLipstick(lipstickQuantity);
                    JOptionPane.showMessageDialog(frame, "Lipstick quantity updated to: " + lipstickQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the lipstick quantity.");
                }
            }

			
        });
        btnLipstickOk.setBounds(343, 55, 61, 23);
        panelLipstick.add(btnLipstickOk);
        
        JPanel panelMascara = new JPanel();
        panelMascara.setBackground(new Color(192, 192, 192));
        panelMascara.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panelMascara.setBounds(10, 187, 414, 89);
        frame.getContentPane().add(panelMascara);
        panelMascara.setLayout(null);
        
        JLabel lblMascara = new JLabel("");
        lblMascara.setBounds(10, 11, 67, 67);
        panelMascara.add(lblMascara);
        
        JTextPane txtpnMascara = new JTextPane();
        txtpnMascara.setText("Mascara");
        txtpnMascara.setBounds(101, 11, 150, 45);
        panelMascara.add(txtpnMascara);
        
        JLabel lblMascaraPrice = new JLabel("250 BDT");
        lblMascaraPrice.setBounds(101, 64, 80, 14);
        panelMascara.add(lblMascaraPrice);
        
        JLabel lblAddQtyMascara = new JLabel("Add Qty");
        lblAddQtyMascara.setBounds(346, 11, 46, 14);
        panelMascara.add(lblAddQtyMascara);
        
        textFieldMascara = new JTextField();
        textFieldMascara.setColumns(10);
        textFieldMascara.setBounds(318, 24, 86, 20);
        panelMascara.add(textFieldMascara);
        
        JButton btnMascaraOk = new JButton("Ok");
        btnMascaraOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mascaraQuantityText = textFieldMascara.getText();
                try {
                    int mascaraQuantity = Integer.parseInt(mascaraQuantityText);
                    setMascara(mascaraQuantity);
                    JOptionPane.showMessageDialog(frame, "Mascara quantity updated to: " + mascaraQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the mascara quantity.");
                }
            }

			
        });
        btnMascaraOk.setBounds(346, 55, 58, 23);
        panelMascara.add(btnMascaraOk);
        
        JPanel panelKajal = new JPanel();
        panelKajal.setBackground(new Color(192, 192, 192));
        panelKajal.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panelKajal.setBounds(10, 288, 414, 89);
        frame.getContentPane().add(panelKajal);
        panelKajal.setLayout(null);
        
        JLabel lblKajal = new JLabel("");
        lblKajal.setBounds(10, 11, 67, 67);
        panelKajal.add(lblKajal);
        
        JTextPane txtpnKajal = new JTextPane();
        txtpnKajal.setText("Kajal");
        txtpnKajal.setBounds(100, 11, 150, 45);
        panelKajal.add(txtpnKajal);
        
        JLabel lblKajalPrice = new JLabel("150 BDT");
        lblKajalPrice.setBounds(100, 64, 75, 14);
        panelKajal.add(lblKajalPrice);
        
        JLabel lblAddQtyKajal = new JLabel("Add Qty");
        lblAddQtyKajal.setBounds(347, 11, 46, 14);
        panelKajal.add(lblAddQtyKajal);
        
        textFieldKajal = new JTextField();
        textFieldKajal.setColumns(10);
        textFieldKajal.setBounds(318, 25, 86, 20);
        panelKajal.add(textFieldKajal);
        
        JButton btnKajalOk = new JButton("Ok");
        btnKajalOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kajalQuantityText = textFieldKajal.getText();
                try {
                    int kajalQuantity = Integer.parseInt(kajalQuantityText);
                    setKajal(kajalQuantity);
                    JOptionPane.showMessageDialog(frame, "Kajal quantity updated to: " + kajalQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the kajal quantity.");
                }
            }
        });
        btnKajalOk.setBounds(343, 55, 61, 23);
        panelKajal.add(btnKajalOk);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Dashboard.main(null);
                frame.dispose();
            }
        });
        btnBack.setBounds(253, 401, 89, 23);
        frame.getContentPane().add(btnBack);
        
        JButton btnPay = new JButton("Pay");
        btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Total price for makeup and cosmetics: " + price() + " BDT");
                createOrderTextFile();
            }

			
        });
        btnPay.setBounds(98, 401, 89, 23);
        frame.getContentPane().add(btnPay);
    }
    private void createOrderTextFile() {
        try {
            FileWriter fw = new FileWriter("Order.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Order Details:");
            bw.newLine();
            bw.write("Lipstick: " + getLipstick());
            bw.newLine();
            bw.write("Mascara: " + getMascara());
            bw.newLine();
            bw.write("Kajal: " + getKajal());
            bw.newLine();
            bw.write("Total Price: " + price() + " BDT");
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Order details saved to order.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
        }
    }
}