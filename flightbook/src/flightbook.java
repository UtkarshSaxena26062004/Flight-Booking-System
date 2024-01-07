import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class flightbook {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Flight Booking System System");

        JLabel namelb = new JLabel("PERSON NAME");
        namelb.setBounds(20,30,120,40);
        JTextField nametf = new JTextField();
        nametf.setBounds(140,30,180,40);

        JLabel passlb = new JLabel("PASSPORT NO.");
        passlb.setBounds(350,30,120,40);
        JTextField passtf = new JTextField();
        passtf.setBounds(470,30,180,40);


        JLabel startlb = new JLabel("DEPARTING");
        startlb.setBounds(20,100,120,40);
        JTextField starttf = new JTextField();
        starttf.setBounds(140,100,180,40);

        JLabel endlb = new JLabel(" RETURNING");
        endlb.setBounds(350,100,120,40);
        JTextField endtf = new JTextField();
        endtf.setBounds(470,100,180,40);

        JLabel fromlb = new JLabel(" FLYING FROM ");
        fromlb.setBounds(17,180,120,40);
        JTextField fromtf = new JTextField();
        fromtf.setBounds(140,180,180,40);

        JLabel tolb = new JLabel("FLYING TO");
        tolb.setBounds(355,180,120,40);
        JTextField totf = new JTextField();
        totf.setBounds(470,180,180,40);

        JLabel amountlb = new JLabel("AMOUNT");
        amountlb.setBounds(22,270,120,40);
        JTextField amounttf = new JTextField();
        amounttf.setBounds(140,270,180,40);


        JLabel bookingIdlb = new JLabel(" BOOKING ID");
        bookingIdlb.setBounds(352,270,120,40);
        JTextField bookingIdtf = new JTextField();
        bookingIdtf.setBounds(470,270,180,40);

        JLabel adultlb = new JLabel("ADULTS(18+)");
        adultlb.setBounds(355,350,120,20);
        JTextField adulttf = new JTextField();
        adulttf.setBounds(470,350,180,20);

        JLabel childlb = new JLabel("CHILDREN(0-17)");
        childlb.setBounds(20,350,120,20);
        JTextField childtf = new JTextField();
        childtf.setBounds(140,350,180,20);



        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(30, 400, 120, 50);

        JButton bookNowBtn = new JButton("Book Flight");
        bookNowBtn.setBounds(250, 400, 120, 50);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(470, 400, 120, 50);


        frame.add(namelb);
        frame.add(nametf);
        frame.add(startlb);
        frame.add(starttf);
        frame.add(endlb);
        frame.add(endtf);
        frame.add(fromlb);
        frame.add(fromtf);
        frame.add(tolb);
        frame.add(totf);
        frame.add(clearBtn);
        frame.add(bookNowBtn);
        frame.add(exitBtn);
        frame.add(amountlb);
        frame.add(amounttf);
        frame.add(bookingIdlb);
        frame.add(bookingIdtf);
        frame.add(passlb);
        frame.add(passtf);
        frame.add(adultlb);
        frame.add(adulttf);
        frame.add(childlb);
        frame.add(childtf);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(700, 600);
        frame.setVisible(true);
        bookNowBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nametf.getText().toString().isEmpty()||starttf.getText().toString().isEmpty()||
                        endtf.getText().toString().isEmpty()||amounttf.getText().toString().isEmpty()||
                        fromtf.getText().toString().isEmpty()|| totf.getText().toString().isEmpty())
                {
                    bookingIdlb.setText("Please fill the complete details");
                }
                else {

                    Random random = new Random();
                    int id = random.nextInt(99999);
                    bookingIdlb.setText("Your booking is confirmed and booking ID " + id);
                }
            }
        });
    }
}