import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Winnah Gwen Acal on 11/1/2016.
 */
public class Calculate extends JFrame{
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton ACButton;
    private JButton CEButton;
    private JButton button18;
    private JButton button19;

    public Calculate(){

        setLayout(new FlowLayout());

        add(textField1);
        add(ACButton);
        add(CEButton);
        add(button18);
        add(button19);
        add(a7Button);
        add(a8Button);
        add(a9Button);
        add(button15);
        add(a4Button);
        add(a5Button);
        add(a6Button);
        add(button14);
        add(a1Button);
        add(a2Button);
        add(a3Button);
        add(button13);
        add(a0Button);
        add(button11);
        add(button12);

        a0Button.addMouseListener(new MyMouseListener(textField1, a0Button));
        a1Button.addMouseListener(new MyMouseListener(textField1, a1Button));
        a2Button.addMouseListener(new MyMouseListener(textField1, a2Button));
        a3Button.addMouseListener(new MyMouseListener(textField1, a3Button));
        a4Button.addMouseListener(new MyMouseListener(textField1, a4Button));
        a5Button.addMouseListener(new MyMouseListener(textField1, a5Button));
        a6Button.addMouseListener(new MyMouseListener(textField1, a6Button));
        a7Button.addMouseListener(new MyMouseListener(textField1, a7Button));
        a8Button.addMouseListener(new MyMouseListener(textField1, a8Button));
        a9Button.addMouseListener(new MyMouseListener(textField1, a9Button));
        ACButton.addMouseListener(new MyMouseListener(textField1, ACButton));
        CEButton.addMouseListener(new MyMouseListener(textField1, CEButton));
        button11.addMouseListener(new MyMouseListener(textField1, button11));
        button12.addMouseListener(new MyMouseListener(textField1, button12));
        button13.addMouseListener(new MyMouseListener(textField1, button13));
        button14.addMouseListener(new MyMouseListener(textField1, button14));
        button18.addMouseListener(new MyMouseListener(textField1, button18));
        button19.addMouseListener(new MyMouseListener(textField1, button19));
        textField1.setEditable(false);

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(200, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculate();
    }
}
