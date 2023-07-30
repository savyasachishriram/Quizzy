package quiz.application;

import javax.swing.*;//JFrame is in this package, javax- java extended
import java.awt.*;//Color class is in awt package
import java.awt.event.*;//ActionListener is here

public class Login extends JFrame implements ActionListener{//Swing is in JFrame class, ActionListener for Click Action of buttons
    
    JButton rules,back;//global declaration needed since have to access these in actionPerformed class
    JTextField tfname;
    
    Login(){//constructor to be called as soon as application opened
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//null - creating our own layout
        
        //icons folder with images is pasted into the quiz application folder->quiz->src and can be seen then in the left window
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));//ImageIcon is present in JFrame
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);//location fromleft, location from top, length, height
        add(image);//can add JLabel not 'i1' directly
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));//can use Color.BLUE also, but this object method allows to pass RGB values
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(new Color(30,144,254));//can use Color.BLUE also, but this object method allows to pass RGB values
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);//(length,height)
        setLocation(200,150);//(distance from left, dstance from top)
        setVisible(true);//frame by default is not visible there this needed
        
    }
    
    //this function called when button is clicked
    public void actionPerformed(ActionEvent ae){//ActionListener class, compulsory to define
        if (ae.getSource()==rules){
            String name = tfname.getText();//to get the text in text field
            setVisible(false);//closes current frame
            //passing text to rules frame:
            new Rules(name);//opens rule frame by creating its object
        } else if(ae.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Login();
        
    }
}
