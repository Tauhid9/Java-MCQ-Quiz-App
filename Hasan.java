import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Hasan extends JFrame implements ActionListener //inheritance & interface
{
		 JLabel q1;
		 JButton nextb;
		 ButtonGroup bg;
		 int running =0;
		 int count=0;
		 JRadioButton rb[]=new JRadioButton[5];
		
		 
	public  Hasan()
	{
		try
		{
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("sw.jpg")))));
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }
	
			setSize(1000,550);
			setTitle("OOPL Lab II (B)");
			setLayout(null);
			setVisible(true);
			setLocation(200,50);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			JLabel qu =new JLabel("WELCOME TO OOPL LAB || QUIZ");
			qu.setFont(new Font("Verdana", Font.PLAIN, 20));
			qu.setForeground(Color.GREEN);
			qu.setBounds(300,100,400,30);
			add(qu);
			
			
			q1=new JLabel();
			q1.setFont(new Font("Verdana", Font.PLAIN, 15));
			q1.setForeground(Color.WHITE);
			add(q1);
			bg= new ButtonGroup();
			for(int i=0;i<5;i++)
			{
				rb[i]=new JRadioButton();
				add(rb[i]);
				bg.add(rb[i]);
			}
			rb[0].setBounds(280,240,400,30);
			rb[1].setBounds(280,280,400,30);
			rb[2].setBounds(280,320,400,30);
			rb[3].setBounds(280,360,400,30);
		
			
			nextb =new JButton("Next");
			nextb.setForeground(Color.WHITE);
			nextb.setBackground(Color.BLACK);
			nextb.setBounds(500,430,80,30);
			add(nextb);
			
			nextb.addActionListener(this);
			
			
			set();
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== nextb)
		{
			if(check())
			{
				count++;
			}
			running++;
			set();
			
			if(running==9)
			{
				nextb.setText("Result");
				
			}
		}
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
			{
				count++;
			}
			running++;
			JOptionPane.showMessageDialog(this," Correct Answer is : "+ count);
			System.exit(0);
		}
	}
	
	void set()
	{
	rb[4].setSelected(true);
		if(running == 0)
		{
			q1.setText("Q1:Which of these packages contains abstract keyword?");
			rb[0].setText("java.lang");
			rb[1].setText("java.io");
			rb[2].setText("java.util");
			rb[3].setText("java.system");
		}
		
		if(running == 1)
		{
			q1.setText("Q2:How many types of variables are used in java?");
			rb[0].setText("5");
			rb[1].setText("2");
			rb[2].setText("3");
			rb[3].setText("4");
		}
		if(running == 2)
		{
			q1.setText("Q3:What does an interface contain?");
			rb[0].setText("Method name");
			rb[1].setText("Method declaration");
			rb[2].setText("Method declaration and definition");
			rb[3].setText("Method definition");
		}
		if(running == 3)
		{
			q1.setText("Q4:AWT stands for ?");
			rb[0].setText("All Window Toolkit");
			rb[1].setText("Abstract Work Toolkit");
			rb[2].setText("Abstract Window Text");
			rb[3].setText("Abstract Window Toolkit");
		}
		if(running == 4)
		{
			q1.setText("Q5:Which is runtime polymorphism in java oops?");
			rb[0].setText("Method overloading");
			rb[1].setText("Constructor overloading");
			rb[2].setText("Method overriding");
			rb[3].setText("None");
		}
		if(running == 5)
		{
			q1.setText("Q6:Which feature can be implemented using encapsulation?");
			rb[0].setText("Abstraction");
			rb[1].setText("Polymorphism");
			rb[2].setText("Overloading");
			rb[3].setText("Inheritance");
		}
		if(running == 6)
		{
			q1.setText("Q7:Which method can set or change the text in a Label?");
			rb[0].setText("getText()");
			rb[1].setText("setText()");
			rb[2].setText("All the above");
			rb[3].setText("None of the above");
		}
		if(running == 7)
		{
			q1.setText("Q8:Which of these keywords must be used to inherit a class?");
			rb[0].setText("super");
			rb[1].setText("this");
			rb[2].setText("extent");
			rb[3].setText("extends");
		}
		if(running == 8)
		{
			q1.setText("Q9:Which of the following is not a Java features?");
			rb[0].setText("Dynamic");
			rb[1].setText("Architecture Neutral");
			rb[2].setText("Use of pointers");
			rb[3].setText("WORA");
		}
		if(running == 9)
		{
			q1.setText("Q10:When does Exceptions in Java arises in code sequence?");
			rb[0].setText("Run Time");
			rb[1].setText("Can Occur Any Time");
			rb[2].setText("Compilation Time");
			rb[3].setText("Checked exceptions");
		}
		
		q1.setBounds(280,200,500,30);
	
	}
	
	boolean check()
	{
		if(running == 0)
		{
			return (rb[0].isSelected());
		}
		if(running == 1)
		{
			return (rb[2].isSelected());
		}
		if(running == 2)
		{
			return (rb[1].isSelected());
		}
		if(running == 3)
		{
			return (rb[3].isSelected());
		}
		if(running == 4)
		{
			return (rb[2].isSelected());
		}
		if(running == 5)
		{
			return (rb[0].isSelected());
		}
		if(running == 6)
		{
			return (rb[1].isSelected());
		}
		if(running == 7)
		{
			return (rb[3].isSelected());
		}
		if(running == 8)
		{
			return (rb[2].isSelected());
		}
		if(running == 9)
		{
			return (rb[0].isSelected());
		}
		
		
		return false;
	}
	
	public static void main(String [] ja)
	{
		Hasan a = new Hasan();
		
	}
}