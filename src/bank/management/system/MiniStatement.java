package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        add(mini);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 400, 20);
        add(balanceLabel);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.white);
        setVisible(true);

        double bal = 0;

        try {
            Conn conn = new Conn();

            // Card number fetch
            ResultSet rs = conn.s.executeQuery("SELECT * FROM login WHERE pin = '" + pinnumber + "'");
            if (rs.next()) {
                String cardNum = rs.getString("cardnumber");
                card.setText("Card Number: " + cardNum.substring(0, 4) + "xxxxxxxx" + cardNum.substring(12));
            }

            // Mini statement and balance calculation
            rs = conn.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "' ORDER BY date");
            String statement = "<html>";
            while (rs.next()) {
                String type = rs.getString("type");
                double amount = Double.parseDouble(rs.getString("amount"));
                if (type.equalsIgnoreCase("Deposit")) {
                    bal += amount;
                } else {
                    bal -= amount;
                }
                statement += rs.getString("date") + "&nbsp;&nbsp;&nbsp;" + type + "&nbsp;&nbsp;&nbsp;Rs " + amount + "<br><br>";
            }
            statement += "</html>";
            mini.setText(statement);

            balanceLabel.setText("YOUR CURRENT ACCOUNT BALANCE IS RS " + bal);

        } catch (Exception e) {
            e.printStackTrace();
        }

        mini.setBounds(20, 140, 350, 250);
    }

    public static void main(String args[]) {
        new MiniStatement("");
    }
}
