import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public JButton b1,b2,b3,b4;
    public JTextField t1,t2;
    public JLabel lobj;

    Integer no1,no2;

    public Calculator (int Width, int Height, String Title)
    {
        mainframe = new JFrame(Title);
        mainframe.setSize(Width,Height);

        mainframe.addWindowListener(this);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mult");
        b4 = new JButton("Div");

        t1 = new JTextField();
        t2 = new JTextField();

        b1.setBounds(1,280,80,40);  // X, y , w, h
        b2.setBounds(90,280,80,40);
        b3.setBounds(180,280,80,40);
        b4.setBounds(270,280,80,40);

        t1.setBounds(70,100,70,30);
        t2.setBounds(220,100,70,30);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

        mainframe.add(t1);
        mainframe.add(t2);

        lobj = new JLabel();
        lobj.setBounds(150,25,200,100);

        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

   public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        try
        {
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());

            if(obj.getSource() == b1)
            {
                lobj.setText("Addition is :"+(no1+no2));
            }
            else if(obj.getSource() == b2)
            {
                lobj.setText("Substraction is :"+(no1-no2));
            }
            else if(obj.getSource() == b3)
            {
                lobj.setText("Multiplacation is :"+(no1*no2));
            }
            else if(obj.getSource() == b4)
            {
                lobj.setText("Division is : " +( no1 / no2));
            }
        }
        catch(Exception eobj)
        {

        }
    }
}

class MCalculator
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(400,400,"MCalculator");
    }
}