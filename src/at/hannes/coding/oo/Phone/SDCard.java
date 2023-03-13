package at.hannes.coding.oo.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<SDFiles> phoneFiles;

    public SDCard(int capacity, List<SDFiles> phoneFiles) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void SavePhoneFiles(SDFiles phoneFiles){
        phoneFiles.add(phoneFiles);
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
