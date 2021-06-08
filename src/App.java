import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class App implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenBt, eightBt, nineBt, fourBt, fiveBt, sixBt, oneBt, twoBt, threeBt, zeroBt;
    JButton eqlBt, dotBt, addBt, subBt, mulBt, divBt;
    JButton clrBt;
    boolean isOpClicked = false;
    String oldValue,newValue;
    float result;
    int operator=0;
    public App() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(620, 750);
        jf.setLocation(450, 50);
        displayLabel = new JLabel();
        displayLabel.setBounds(40, 20, 520, 80);
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.gray);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(displayLabel);
        jf.setResizable(false);

        /*--------------------789----------------*/

        sevenBt = new JButton("7");
        sevenBt.setBounds(80, 130, 80, 80);
        jf.add(sevenBt);
        sevenBt.addActionListener(this);
        sevenBt.setFont(new Font("Arial", Font.PLAIN, 30));

        eightBt = new JButton("8");
        eightBt.setBounds(200, 130, 80, 80);
        jf.add(eightBt);
        eightBt.addActionListener(this);
        eightBt.setFont(new Font("Arial", Font.PLAIN, 30));

        nineBt = new JButton("9");
        nineBt.setBounds(320, 130, 80, 80);
        jf.add(nineBt);
        nineBt.addActionListener(this);
        nineBt.setFont(new Font("Arial", Font.PLAIN, 30));

        divBt = new JButton("/");
        divBt.setBounds(440, 130, 80, 80);
        jf.add(divBt);
        divBt.addActionListener(this);
        divBt.setFont(new Font("Arial", Font.PLAIN, 30));

        /*--------------------456----------------*/

        fourBt = new JButton("4");
        fourBt.setBounds(80, 250, 80, 80);
        jf.add(fourBt);
        fourBt.addActionListener(this);
        fourBt.setFont(new Font("Arial", Font.PLAIN, 30));

        fiveBt = new JButton("5");
        fiveBt.setBounds(200, 250, 80, 80);
        jf.add(fiveBt);
        fiveBt.addActionListener(this);
        fiveBt.setFont(new Font("Arial", Font.PLAIN, 30));

        sixBt = new JButton("6");
        sixBt.setBounds(320, 250, 80, 80);
        jf.add(sixBt);
        sixBt.addActionListener(this);
        sixBt.setFont(new Font("Arial", Font.PLAIN, 30));

        mulBt = new JButton("X");
        mulBt.setBounds(440, 250, 80, 80);
        jf.add(mulBt);
        mulBt.addActionListener(this);
        mulBt.setFont(new Font("Arial", Font.PLAIN, 30));

        /*--------------------123----------------*/

        oneBt = new JButton("1");
        oneBt.setBounds(80, 370, 80, 80);
        jf.add(oneBt);
        oneBt.addActionListener(this);
        oneBt.setFont(new Font("Arial", Font.PLAIN, 30));

        twoBt = new JButton("2");
        twoBt.setBounds(200, 370, 80, 80);
        jf.add(twoBt);
        twoBt.addActionListener(this);
        twoBt.setFont(new Font("Arial", Font.PLAIN, 30));

        threeBt = new JButton("3");
        threeBt.setBounds(320, 370, 80, 80);
        jf.add(threeBt);
        threeBt.addActionListener(this);
        threeBt.setFont(new Font("Arial", Font.PLAIN, 30));

        subBt = new JButton("-");
        subBt.setBounds(440, 370, 80, 80);
        jf.add(subBt);
        subBt.addActionListener(this);
        subBt.setFont(new Font("Arial", Font.PLAIN, 30));

        /*--------------------123----------------*/

        dotBt = new JButton(".");
        dotBt.setBounds(80, 490, 80, 80);
        jf.add(dotBt);
        dotBt.addActionListener(this);
        dotBt.setFont(new Font("Arial", Font.PLAIN, 30));

        zeroBt = new JButton("0");
        zeroBt.setBounds(200, 490, 80, 80);
        jf.add(zeroBt);
        zeroBt.addActionListener(this);
        zeroBt.setFont(new Font("Arial", Font.PLAIN, 30));

        eqlBt = new JButton("=");
        eqlBt.setBounds(320, 490, 80, 80);
        jf.add(eqlBt);
        eqlBt.addActionListener(this);
        eqlBt.setFont(new Font("Arial", Font.PLAIN, 30));

        addBt = new JButton("+");
        addBt.setBounds(440, 490, 80, 80);
        jf.add(addBt);
        addBt.addActionListener(this);
        addBt.setFont(new Font("Arial", Font.PLAIN, 30));

        /*------------------CLEAR---------------------- */

        clrBt = new JButton("CLEAR");
        clrBt.setBounds(80, 610, 450, 80);
        jf.add(clrBt);
        clrBt.setFont(new Font("Arial", Font.PLAIN, 30));

        clrBt.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sevenBt) {
            if (isOpClicked == true) {
                displayLabel.setText("7");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }

        } else if (e.getSource() == eightBt) {
            if (isOpClicked == true) {
                displayLabel.setText("8");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        }

        else if (e.getSource() == nineBt) {
            if (isOpClicked == true) {
                displayLabel.setText("9");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }

        else if (e.getSource() == fourBt) {
            if (isOpClicked == true) {
                displayLabel.setText("4");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == fiveBt) {
            if (isOpClicked == true) {
                displayLabel.setText("5");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }

        else if (e.getSource() == sixBt) {
            if (isOpClicked == true) {
                displayLabel.setText("6");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }

        else if (e.getSource() == oneBt) {
            if (isOpClicked == true) {
                displayLabel.setText("1");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }

        else if (e.getSource() == twoBt) {
            if (isOpClicked == true) {
                displayLabel.setText("2");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }

        } else if (e.getSource() == threeBt) {
            if (isOpClicked == true) {
                displayLabel.setText("3");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == zeroBt) {
            if (isOpClicked == true) {
                displayLabel.setText("0");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == dotBt) {
            if (isOpClicked == true) {
                displayLabel.setText(".");
                isOpClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + ".");
            }

        } else if (e.getSource() == divBt) {
            isOpClicked = true;
            operator=4;
            oldValue = displayLabel.getText();

        } else if (e.getSource() == mulBt) {
            isOpClicked = true;
            operator=3;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == subBt) {
            isOpClicked = true;
            operator=2;
            oldValue = displayLabel.getText();
        } else if (e.getSource() == addBt) {
            isOpClicked = true;
            operator=1;
            oldValue = displayLabel.getText();
        }

        else if (e.getSource() == eqlBt) {
            newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            if (operator==1) {
                result=oldValueF+newValueF;
            displayLabel.setText(result+"");
            }
            else if(operator==2)
            {
                result=oldValueF-newValueF;
                displayLabel.setText(result+"");
            }
            else if(operator==3)
            {
                result=oldValueF*newValueF;
                displayLabel.setText(result+"");
            }
            else if(operator==4)
            {
                result=oldValueF/newValueF;
                displayLabel.setText(result+"");
            }
            

        } else if (e.getSource() == clrBt) {
            displayLabel.setText("");
        }

    }
}
