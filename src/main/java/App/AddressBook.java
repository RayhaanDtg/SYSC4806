package App;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.* ;

@Entity
public class AddressBook implements Serializable {


    @OneToMany
    private List<BuddyInfo> addressBook;

    @Id
    private Long id = null;



    public AddressBook() {

        addressBook=new ArrayList<BuddyInfo>();


    }


    public List<BuddyInfo> getAddressBook() {
        return addressBook;
    }


    public Long getId(){
        return this.id;
}

public void setId(Long Id){
        this.id=Id;
}


    public void addBuddy(BuddyInfo buddy) {

        addressBook.add(buddy);


    }

    public void removeBuddy(BuddyInfo buddy) {

        addressBook.remove(buddy);

    }

    public int getSize() {

        return addressBook.size();

    }


    public void clearBuddy() {

        addressBook.clear();

    }
    @Override
    public String toString(){
        String s= null;
        for (BuddyInfo bud:addressBook) {
            s+= bud.toString();
            
        }
        return s;
    }


}






