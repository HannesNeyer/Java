package at.hannes.coding.oo.Phone;

import java.util.List;

public class SDCard {
    private int capacity;
    private List<SDFiles> phoneFiles;

    public SDCard(int capacity, List<SDFiles> phoneFiles) {
        this.capacity = capacity;
        this.phoneFiles = phoneFiles;
    }
}
