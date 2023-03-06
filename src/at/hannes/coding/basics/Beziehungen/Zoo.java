package at.hannes.coding.basics.Beziehungen;

import at.hannes.coding.basics.Beziehungen.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String street;
    private List<Animal> Animals;

    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.Animals = new ArrayList<>();
    }

    public void makeShow(){
        System.out.println("The show is starting");
    }

    public void addAnimal(Animal Animals){
        this.Animals.add(Animals);
    }

    public void printAnimals(){
        for (Animal Animals: this.Animals){
            System.out.println("Animal weight:" + Animals.getWeight());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
