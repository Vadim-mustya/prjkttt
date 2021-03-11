import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyWindow extends JFrame {


    static JLabel label = new JLabel("Введите границы случайного числа");
    static JLabel randomNumber = new JLabel("");

    static JPanel panel = new JPanel();

    static JTextField from  = new JTextField(15);
    static JTextField to = new JTextField(15);

    static JButton button = new JButton("Сгенерировать");

    Font font = new Font("",Font.BOLD,30);
    Font font2 = new Font("SansSerif",Font.BOLD,20);
    Font font3 = new Font("",Font.BOLD,17);


    void print()
    {
        setTitle("Рандомайзер");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,180);
        setLocation(500,500);
        setResizable(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(new FlowLayout());

        label.setFont(font2);
        label.setForeground(Color.ORANGE);
        randomNumber.setFont(font);
        randomNumber.setForeground(Color.ORANGE);

        from.setFont(font3);
        from.setBackground(Color.DARK_GRAY);
        from.setForeground(Color.WHITE);

        to.setFont(font3);
        to.setBackground(Color.DARK_GRAY);
        to.setForeground(Color.WHITE);

        panel.setBackground(Color.DARK_GRAY);
        panel.add(from);
        panel.add(to);

        button.addActionListener(new ButtonListener());

        add(BorderLayout.NORTH,label);
        add(panel);
        add(button);
        add(randomNumber);

    }



    int getRandom()
    {
        int x = Integer.parseInt(from.getText());
        int y = Integer.parseInt(to.getText());
        if(x < y && x >= 0 )
        {

            return  (int) (Math.random() * (y - x) + x) ;
        }else
        {
            return  0;
        }


    }



    public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e)

        {
            randomNumber.setText(getRandom() + "");

        }

    }




}
