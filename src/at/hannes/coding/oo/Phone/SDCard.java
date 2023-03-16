package at.hannes.coding.oo.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<SDFiles> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void SavePhoneFiles(SDFiles file){
        this.phoneFiles.add(file);
        System.out.println("Saved succussefully");
    }

    public void getAllFiles(){
        for(int i = 0; i < phoneFiles.size(); i++){
            System.out.println(this.phoneFiles.get(i));
        }
    }

    public void getFreeSpace(){
        this.phoneFiles.clear();
        System.out.println("Space cleared");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<SDFiles> getPhoneFiles() {
        return phoneFiles;
    }

    public void setPhoneFiles(List<SDFiles> phoneFiles) {
        this.phoneFiles = phoneFiles;
    }
}
