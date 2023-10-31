import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;

 public class Bmicalculator extends javax.swing.JFrame 
{
 
    Bmicalculator() 
    {
        JFrame frm = new JFrame();
 
        JLabel label1 = new JLabel("Height in Inches");
        label1.setBounds(20, 20, 100, 40);
        frm.add(label1); 
 
        JLabel label2 = new JLabel("Weight in Pounds");
        label2.setBounds(20, 60, 100, 40);
        frm.add(label2); 
        
        JLabel labelResult = new JLabel("BMI Calculator result is");
        labelResult.setBounds(20, 90, 400, 40);
        frm.add(labelResult);
        
        JTextField textHeight = new JTextField("");
        textHeight.setBounds(120, 20, 200, 40);
        frm.add(textHeight);
 
        JTextField textWeight = new JTextField("");
        textWeight.setBounds(120, 60, 200, 40);
        frm.add(textWeight); 
 
        JButton button = new JButton("BMI value"); 
        button.setBounds(20, 130, 300, 40);
 	
	button.addActionListener(new ActionListener()
	{
           
            public void actionPerformed(ActionEvent e) 
	    {
                
                double weight=Double.parseDouble(textWeight.getText());
                double height=Double.parseDouble(textHeight.getText());
                
                double bmi = weight / Math.pow(height, 2) * 703;
 
                 if (bmi < 18.5)
		 {
                     labelResult.setText("Interpretation(or)Health category-->underweight - BMI : "+bmi);
                 } 
		else if (bmi < 25) 
		{
                     labelResult.setText("Interpretation(or)Health category-->normal - BMI : "+bmi);
                }
		 else if (bmi < 30) 
		{
                     labelResult.setText("Interpretation(or)Health category-->overweight - BMI : "+bmi);
                } 
		else 
		{
                     labelResult.setText("Interpretation(or)Health category-->obese - BMI : "+bmi);
                }
            }
        });

 	frm.add(button); 
        frm.setSize(500, 500);
        frm.setLayout(null);
        frm.setVisible(true);
 
    }
 
    public static void main(String[] args) {
        new Bmicalculator();
    }
}
 



















