package exercise0;

//设计一个窗口，内含一个文本框、三个复选框、两个单选框、一个标签和一个按钮。

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class exercise0 {
 public static void main(String[] args) {
     JFrame window = new JFrame("A Windows");
     window.setLayout(new FlowLayout());

     JTextField textField = new JTextField(20);
     window.add(textField);

     JCheckBox checkBox1 = new JCheckBox("CheckBox1");
     JCheckBox checkBox2 = new JCheckBox("checkBox2");
     JCheckBox checkBox3 = new JCheckBox("checkBox3");
     window.add(checkBox1);
     window.add(checkBox2);
     window.add(checkBox3);

     JRadioButton radioButton1 = new JRadioButton("radioButton1");
     JRadioButton radioButton2 = new JRadioButton("radioButton2");
    ButtonGroup bg = new ButtonGroup();
    bg.add(radioButton1);
    bg.add(radioButton2);

    window.add(radioButton1);
    window.add(radioButton2);

    JLabel label = new JLabel("THis is a label");
    window.add(label);

    JButton button = new JButton("Button");
    window.add(button);

    window.pack();
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}