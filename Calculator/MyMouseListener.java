/**
 * Created by Winnah Gwen Acal on 10/31/2016.
 */
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.util.*;

public class MyMouseListener implements MouseListener {
    private JTextField text;
    private JButton buttons;
    BigInteger[] val = new BigInteger[10];
    char operator = 'b';
    private int i = 0;
    BigInteger sum = BigInteger.valueOf(0);
    BigInteger ten = BigInteger.valueOf(1);
    int count = 0;
    public MyMouseListener(JTextField text, JButton buttons) {
        this.text = text;
        this.buttons = buttons;
    }



    @Override
    public void mouseClicked(MouseEvent e) {

        char thing = buttons.getText().charAt(0);
        if (thing >= '0' && thing <= '9'){
                sum = sum.multiply(ten);
                sum = sum.add(new BigInteger(buttons.getText()));
                ten = ten.multiply(new BigInteger (String.valueOf(10)));


            val[i] = sum;
            /*
            if (val[i].equals(new BigInteger(String.valueOf(null)))){
                val[i] = sum;
            }else {
                i++;
                val[i] = sum;
            }
            */
            System.out.println(i++);
            System.out.println(count);
            text.setText(sum.toString());


        }else if (thing == '+' || thing == '-' || thing == '/' || thing == 'x'){
            operator = thing;
            count++;
            //sum = BigInteger.valueOf(0);
        }else if (thing == '='){
            BigInteger ans = val[0];
            for (int j = 1; j < val.length; j++){
                if (operator == '+'){
                    ans.add(new BigInteger(String.valueOf(val[j])));
                }else if (operator == '-'){
                    ans.subtract(new BigInteger(String.valueOf(val[j])));
                }else if (operator == '/'){
                    ans.divide(new BigInteger(String.valueOf(val[j])));
                }else{
                     ans.multiply(new BigInteger(String.valueOf(val[j])));
                }
            }
            //System.out.println(ans);
            text.setText(String.valueOf(ans));
        }else{
            if(buttons.getText().equals("CE")){
                text.setText("0");
                sum = new BigInteger(String.valueOf(0));
            }else if (buttons.getText().equals("AC")){
                text.setText("0");
                sum = new BigInteger(String.valueOf(0));
            }

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //not needed
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //not needed
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //not needed
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //not needed
    }
}