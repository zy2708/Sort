import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class sort extends JFrame{

    private JTextField[] textfield=new JTextField[10];
    private JLabel label;
    private JButton[] button=new JButton[1];


    public sort(){
        label=new JLabel("0.0");
        textfield[0]=new JTextField("10");
        textfield[1]=new JTextField("10");
        textfield[2]=new JTextField("10");
        textfield[3]=new JTextField("10");
        textfield[4]=new JTextField("10");
        textfield[5]=new JTextField("10");
        textfield[6]=new JTextField("10");
        textfield[7]=new JTextField("10");
        textfield[8]=new JTextField("10");
        textfield[9]=new JTextField("10");
        button[0]=new JButton("SORT");


        button[0].addActionListener(new sortHandle());

        GridLayout layout=new GridLayout(6,2);
        JPanel panel=new JPanel(layout);
        panel.add(textfield[0]);
        panel.add(textfield[1]);
        panel.add(textfield[2]);
        panel.add(textfield[3]);
        panel.add(textfield[4]);
        panel.add(textfield[5]);
        panel.add(textfield[6]);
        panel.add(textfield[7]);
        panel.add(textfield[8]);
        panel.add(textfield[9]);
        panel.add(label);
        panel.add(button[0]);
        setContentPane(panel);
    }
    public static void main(String[] args){
        sort a=new sort();
        a.setSize(2000,2000);
        a.setTitle("Sort Numbers");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.pack();
        a.setVisible(true);
        System.out.println(a.getInsets());
    }
    private class sortHandle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] input=new double[10];

            for(int n=0;n<10;n++){
                input[n] = Double.parseDouble(textfield[n].getText());
            }
            
            double result = (input[0]+input[1] + input[2] + input[3] + input[4]+input[5]+input[6]+input[7]+input[8]+input[9])/10;
            DecimalFormat format = new DecimalFormat("####.00");

            label.setText(String.valueOf(format.format(result)));

            for(int i=0; i<10; i++){
                for(int l=0; l<10; l++){
                    double smallest=input[i];
                    double temp=0;
                    if(input[l]>smallest){
                        temp=input[i];
                        input[i] = input[l];
                        smallest = input[l];
                        input[l]=temp;
                    }
                }
            }

            for(int m=0;m<10;m++){
                textfield[m].setText(Double.toString(input[m]));
            }


            System.out.println("You just clicked SORT button.");
            System.out.println("The average number is "  + result + ".");
            System.out.println("The 10 numbers are ");
            System.out.println(input[0]);
            System.out.println(input[1]);
            System.out.println(input[2]);
            System.out.println(input[3]);
            System.out.println(input[4]);
            System.out.println(input[5]);
            System.out.println(input[6]);
            System.out.println(input[7]);
            System.out.println(input[8]);
            System.out.println(input[9]+".");

        }

    }
}

