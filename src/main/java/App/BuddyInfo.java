package App;

import javax.persistence.Entity;

import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BuddyInfo implements Serializable {

    private String name;
    private String address;
    private int age;

    @Id

    private Integer number;
    private static final long serialVersionUID = 1L;

    public BuddyInfo(String name) {
        this.name=name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BuddyInfo()
    {
        this.name = "";
        this.address = "";
        this.number = 0;
        this.age = 18;
    }

    public BuddyInfo(String name,String address,Integer number, int age) {


        this.name=name;
        this.address=address;
        this.number=number;
        this.age=age;

    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOver18() {

        return this.age >= 18;
    }


    @Override
    public String toString(){
        return this.name + ":" + this.address + ":" + this.number + ":"	+ this.age;
    }



}