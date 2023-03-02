package adail1;

import javax.swing.JFrame;

    
}
public class Adail1 extends JFrame{

private JTextField textField1;
private JTextField textField2;
private JTextField textField3;
private JPassword passwordField;

public TextFieldFrame()
{
super( "Testing JTextField and JPassword" );
        textField = new JTextField(10);
        add( TextField1 );
        
        textField2 = new JTextField( "Enter text here" );
        add(textfield2);
        
        textField3 = new JTextField("Uneditable text field",21 );
        textFiled3.setEditable(false);
        add(textField3);
        
        passwordFiled = new JPasswordFiled( "hidden text" );
        add(passwordField);
        
        TextFieldHandlear handlear = new TerxtFieldHandler();
        TextField1.addActionListener( handler );
        TextField2.addActionListener( handlear );
        TextField3.addActionListener( handlear );
        passwordField.addActionListener( handler );

}
private cl.ass TextFieldHandler implement ActionListener
        {
           public void action 
        }
        
        
        
}