import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tauhid extends JFrame implements ActionListener  //inheritance & interface
{
	
	
	JButton btn1;
	
    public Tauhid()
	{
		
		try 
		{
          setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("aq.jpg")))));
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		   
		   setSize(1200,800);
		   
		   getContentPane().setBackground(Color.WHITE);
		   setLayout(null);
		   setTitle("OOPL Lab II (B)");		   
		   
		   ImageIcon I1 = new ImageIcon("uits.jpg");
		   JLabel L1 = new JLabel(I1);
		   L1.setBounds(30,0,250,300);
		   add(L1);
		   
		   JLabel dv1 =new JLabel("Developed By:");
		   dv1.setForeground(Color.BLUE);
		   dv1.setBounds(50,310,200,30);
		   add(dv1); 
			
		   JLabel name =new JLabel("Name:Tauhid Hasan Chowdhury");
		   name.setBounds(50,350,300,30);
		   add(name);
		   JLabel id =new JLabel("ID:2014755041");
		   id.setBounds(50,390,300,30);
		   add(id);
			
			JLabel name1 =new JLabel("Name:Taposhe Rabeya Medha");
			name1.setBounds(50,430,300,30);
			add(name1);
			JLabel id1 =new JLabel("ID:2014755038");
			id1.setBounds(50,480,300,30);
			add(id1);
		   
		   
		   JLabel L2=new JLabel("UNIVERSITY OF INFORMATION TECHNOLOGY AND SCIENCE ");
		   L2.setFont(new Font ("Monotype Corsiva",Font.BOLD,20));
		   L2.setForeground(Color.BLUE);
		   L2.setBounds(330,60,600,80);
		   add(L2);
		   
		   JLabel L3=new JLabel("DEPARTMENT OF INFORMATION TECHNOLOGY ");
		   L3.setFont(new Font ("Monotype Corsiva",Font.BOLD,18));
		   L3.setForeground(Color.BLUE);
		   L3.setBounds(380,120,520,80);
		   add(L3);
			   
		   JLabel l1 = new JLabel("Your Name: ");
		   l1.setBounds(380,250,100,30);
		   l1.setFont(new Font("Verdana", Font.PLAIN, 15));
		   add(l1);
			
			
		   JLabel l2= new JLabel("Your SID: ");
           l2.setBounds(380,320,100,30);
		   l2.setFont(new Font("Verdana", Font.PLAIN, 15));
		   add(l2);
			
		   JTextField t1 = new JTextField();
           t1.setBounds(480,250,300,30);
           add(t1);
	    		   
		   JTextField t2 = new JTextField();
           t2.setBounds(480,320,300,30);
           add(t2);
			
			
           btn1 = new JButton("Next");
           btn1.setBounds(650, 420, 80, 30);
           btn1.setBackground(Color.BLACK);
		   btn1.setForeground(Color.WHITE);
		   btn1.addActionListener(this);
		   add(btn1);
		   
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setVisible(true);

		
	}
	      public void actionPerformed(ActionEvent e)

        {
			if(e.getSource()==btn1)
			{
				this.setVisible(false);
				new Hasan().setVisible(true);
			}
			
		}
		public static void main(String [] args)
		{
			
		new Tauhid();

		}	
}