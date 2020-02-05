package App;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;


public abstract class ListTableActionListener
        implements ActionListener {
    protected JTable table;
    protected List list;

    public void setAddressBook(AddressBook book) {
        this.list =book.getAddressBook();
    }

    public void setTable(JTable itemTable) {
        this.table = itemTable;
    }
}