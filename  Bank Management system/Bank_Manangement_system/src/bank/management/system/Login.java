    
package bank.management.system;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;




 public  class Login extends JFrame implements ActionListener {

       JButton login,signup,clear;
       JTextField usernameTextField;
       
        JPasswordField  passwordTextField;
     Login(){
         setTitle("EZ BANK ");
         setLayout(null);
         
          ImageIcon li = new ImageIcon(getClass().getClassLoader().getResource("icon/images3.png"));
          Image i2 = li.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel label= new JLabel(i3);
          label.setBounds(70, 10, 100, 100);
          add(label);
          
           JLabel text =new  JLabel("Welcome to EZ Bank");
          text.setFont(new Font("Osward",Font.BOLD,38));
           text.setBounds(200,40,400,40);
           add(text);
            
            JLabel username =new  JLabel(" Username");
          username.setFont(new Font("Raleway",Font.BOLD,28));
           username.setBounds(120,150,150,30);
           add(username);
           
            usernameTextField = new JTextField();
            usernameTextField.setBounds(300, 150, 250, 30);
            usernameTextField.setFont(new Font("Arial",Font.BOLD,14));
            add( usernameTextField);
           
            JLabel password =new  JLabel(" Password");
          password.setFont(new Font("Raleway",Font.BOLD,28));
         password.setBounds(120,220,250,30);
           add(password);
           
                  passwordTextField  = new  JPasswordField();
           passwordTextField.setBounds(300, 220, 250, 30);
           passwordTextField.setFont(new Font("Arial",Font.BOLD,14));
            add( passwordTextField);
            
              login = new  JButton("SIGN IN");
            login.setBounds(300, 300, 100, 30);
            login.setBackground(Color.black);
           login.setForeground(Color.white);
           login.addActionListener(this);
            add(login);
            
              clear = new  JButton("clear");
            clear .setBounds(430, 300, 100, 30);
            clear .setBackground(Color.black);
            clear .setForeground(Color.white);
               clear.addActionListener(this);
            add(clear );
            
                  signup = new  JButton("DON'T have account? SIGN UP");
            signup .setBounds(300, 350, 230, 30);
            signup .setBackground(Color.black);
            signup .setForeground(Color.white);
               signup.addActionListener(this);
            add(signup);
            
            
       getContentPane().setBackground(new Color(51-204-255));   

          
         setSize(800,480);
         setVisible(true);
         setLocation(350,200);
         
     }
   public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==clear){
           usernameTextField.setText("");
            passwordTextField.setText("");
       }else if(ae.getSource()==login){
           
       }else if(ae.getSource()==signup){
           setVisible(false);
           new signup().setVisible(true);
           
       }
       String username=  usernameTextField.getText();
       String password=   passwordTextField.getText();
       
       try{
           conn c =new conn();
             String query= "insert into Login values( '"+username+"', '"+password+"')";
             c.s.executeUpdate(query);
       }
       catch(Exception e){
           System.out.println(e);
       }
   }
    public static void main(String[] args) {
     new Login();
    }

   
    }
    


