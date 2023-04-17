package at.hannes.coding.oo.Camera;

import at.hannes.coding.oo.Phone.SDFiles;

import java.util.ArrayList;
import java.util.List;

public class SdCard
{
    private int capacity = 16;
    private List<SdFiles> cameraFiles;
    private SdFiles SdFiles;

    public SdCard(List<SdFiles> cameraFiles) {
        this.cameraFiles = new ArrayList<>();
    }

    public List<SdFiles> getCameraFiles() {
        return cameraFiles;
    }

    public void setCameraFiles(List<SdFiles> cameraFiles) {
        this.cameraFiles = cameraFiles;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
