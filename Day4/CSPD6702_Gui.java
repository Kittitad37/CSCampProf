import javax.swing.*;
import java.awt.event.*;

public class CSPD6702_Gui {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton plus1 = new JButton("plus1");
        JLabel header = new JLabel("Counter App");
        JTextField displayNum = new JTextField("Start");

        displayNum.setBounds(0,120,200,100);
        header.setBounds(0, 0, 100, 50);
        plus1.setBounds(0,50,100,50);

        plus1.setText("PlusOne");

        plus1.addActionListener(new ActionListener (){
            int a = 0;
            public void actionPerformed(ActionEvent e){
                displayNum.setText(String.valueOf(a));
                a++;
            }
        });

        f.setSize(1000,800);
        f.add(header);
        f.add(plus1);
        f.add(displayNum);

        f.setLayout(null);
        f.setVisible(true);
    }
}