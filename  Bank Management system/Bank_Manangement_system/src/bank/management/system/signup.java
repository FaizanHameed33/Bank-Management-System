package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class signup extends JFrame implements ActionListener {
    
    JTextField nameTextField, FnameTextField, emailTextField, CNTextField;
    JPasswordField PasTextField, CPasTextField; // Changed to JPasswordField
    JLabel nameError, FnameError, emailError, CNError, PasError, CPasError;
    JButton signup;
    
    signup() {
        setLayout(null);
        setTitle("EZ BANK");
        getContentPane().setBackground(new Color(51-204-255));
        
        JLabel register = new JLabel("REGISTRATION FORM");
        register.setFont(new Font("Raleway", Font.BOLD, 38));
        register.setBounds(200, 10, 600, 40);
        add(register);
        
        JLabel name = new JLabel("First Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        name.setBounds(200, 130, 400, 30); 
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(400, 130, 250, 30); 
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);
        
        nameError = new JLabel("Name must contain only letters");
        nameError.setBounds(200, 160, 300, 20);
        nameError.setForeground(Color.RED);
        nameError.setVisible(false);
        add(nameError);
        
        JLabel Fname = new JLabel("Last Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 25));
        Fname.setBounds(200, 200, 400, 30); 
        add(Fname);
        
        FnameTextField = new JTextField();
        FnameTextField.setBounds(400, 205, 250, 30);  
        FnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(FnameTextField);
        
        FnameError = new JLabel("Father's Name must contain only letters");
        FnameError.setBounds(200, 235, 300, 20);
        FnameError.setForeground(Color.RED);
        FnameError.setVisible(false);
        add(FnameError);
        
        JLabel emailid = new JLabel("Email:");
        emailid.setFont(new Font("Raleway", Font.BOLD, 25));
        emailid.setBounds(200, 280, 400, 30); 
        add(emailid);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(400, 275, 250, 30); 
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);
        
        emailError = new JLabel("Invalid email format");
        emailError.setBounds(200, 305, 300, 20);
        emailError.setForeground(Color.RED);
        emailError.setVisible(false);
        add(emailError);
        
        JLabel contactinfo = new JLabel("Contact No:");
        contactinfo.setFont(new Font("Raleway", Font.BOLD, 25));
        contactinfo.setBounds(200, 350, 400, 30); 
        add(contactinfo);
        
        CNTextField = new JTextField();
        CNTextField.setBounds(400, 350, 250, 30);
        CNTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(CNTextField);
        
        CNError = new JLabel("Contact must be 10-15 digits");
        CNError.setBounds(200, 380, 300, 20);
        CNError.setForeground(Color.RED);
        CNError.setVisible(false);
        add(CNError);
        
        JLabel password = new JLabel("Password:");
        password.setFont(new Font("Raleway", Font.BOLD, 25));
        password.setBounds(200, 430, 400, 30);  
        add(password);
        
        PasTextField = new JPasswordField(); // Changed to JPasswordField
        PasTextField.setBounds(400, 430, 250, 30); 
        PasTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(PasTextField);
        
        PasError = new JLabel("Password must be at least 8 characters, with upper/lower case, numbers, and symbols");
        PasError.setBounds(200, 460, 500, 20);
        PasError.setForeground(Color.RED);
        PasError.setVisible(false);
        add(PasError);
        
        JLabel Cpassword = new JLabel("Confirm Password:");
        Cpassword.setFont(new Font("Raleway", Font.BOLD, 25));
        Cpassword.setBounds(160, 510, 350, 30); 
        add(Cpassword);
        
        CPasTextField = new JPasswordField(); // Changed to JPasswordField
        CPasTextField.setBounds(400, 510, 250, 30); 
        CPasTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(CPasTextField);
        
        CPasError = new JLabel("Passwords do not match");
        CPasError.setBounds(200, 540, 300, 20);
        CPasError.setForeground(Color.RED);
        CPasError.setVisible(false);
        add(CPasError);
        
        signup = new JButton("SIGNup");
        signup.setBounds(350, 590, 100, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String name = nameTextField.getText();
        String Fname = FnameTextField.getText();
        String email = emailTextField.getText();
        String CN = CNTextField.getText();
        String Pas = new String(PasTextField.getPassword()); 
        String CPas = new String(CPasTextField.getPassword()); 
        
        String nameRegex = "^[a-zA-Z\\s]+$"; 
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";   
        String contactRegex = "^[0-9]{10,15}$";  
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; 
        boolean valid = true;

        if (!name.matches(nameRegex)) {
            nameError.setVisible(true);
            nameTextField.setBorder(new LineBorder(Color.RED, 3));
            valid = false;
        } else {
            nameError.setVisible(false);
            nameTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        }

        if (!Fname.matches(nameRegex)) {
            FnameError.setVisible(true);
            FnameTextField.setBorder(new LineBorder(Color.RED, 3));
            valid = false;
        } else {
            FnameError.setVisible(false);
            FnameTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        }

        if (!email.matches(emailRegex)) {
            emailError.setVisible(true);
            emailTextField.setBorder(new LineBorder(Color.RED, 3));
            valid = false;
        } else {
            emailError.setVisible(false);
            emailTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        }

        if (!CN.matches(contactRegex)) {
            CNError.setVisible(true);
            CNTextField.setBorder(new LineBorder(Color.RED, 3));
            valid = false;
        } else {
            CNError.setVisible(false);
            CNTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // 
        }

        if (!Pas.matches(passRegex)) {
            PasError.setVisible(true);
            PasTextField.setText(""); 
            PasTextField.requestFocus(); 
            valid = false;
        } else {
            PasError.setVisible(false);
        }

        if (!Pas.equals(CPas)) {
            CPasError.setVisible(true);
            valid = false;
        } else {
            CPasError.setVisible(false);
        }

        if (valid) {
            try {
                conn c = new conn();
                String query = "insert into signup values('" + name + "', '" + Fname + "', '" + email + "', '" + CN + "', '" + Pas + "', '" + CPas + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Signup Successful");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new signup();
    }
}

