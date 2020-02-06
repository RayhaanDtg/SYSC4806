package App;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.* ;

// must annotate the class with persistence annotations to achieve ORM into database
// this uses the java persistence library to map the ORM and spring configures these
// annotations to store into its own database.
@Entity // indicates that this class is a table in database
public class AddressBook implements Serializable {

// indicates that this should be a field of one to many relationship in the table
    @OneToMany
    private List<BuddyInfo> addressBook;

    // shows that this field will be used as the ID field for each row in the table
    @Id
    private Long id = null;

// the constructors, enable creation of an object to be pu in the database
// each object maps into a row
// getters and setters are implemented to manipulate the field of this class

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






