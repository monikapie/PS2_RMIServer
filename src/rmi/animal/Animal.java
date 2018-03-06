package rmi.animal;

import java.io.Serializable;

/**
 * Created by pietyszukm on 06.03.2018.
 */
public class Animal implements Serializable{
    public static final long serialVersionUID = 1L;

    public Animal(){ }

    public Animal(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    private String name;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
