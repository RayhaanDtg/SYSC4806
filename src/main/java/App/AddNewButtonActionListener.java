package App;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class AddNewButtonActionListener extends
        ListTableActionListener {
    public void actionPerformed(ActionEvent e) {

        String name = JOptionPane.showInputDialog("Please enter name");
        String  address= JOptionPane.showInputDialog("Please enter address");
        int age= Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
        int number= Integer.parseInt(JOptionPane.showInputDialog("Please enter number"));
        list.add(new BuddyInfo(name, address,number,age));
        table.revalidate();
    }
}