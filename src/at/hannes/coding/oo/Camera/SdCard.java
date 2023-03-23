package at.hannes.coding.oo.Camera;

import java.util.ArrayList;
import java.util.List;

public class SdCard
{
    private int capacity = 64;
    private List<SdFiles> cameraFiles;

    public SdCard(List<SdFiles> cameraFiles) {
        this.cameraFiles = new ArrayList<>();
    }

    public List<SdFiles> getCameraFiles() {
        return cameraFiles;
    }

    public void setCameraFiles(List<SdFiles> cameraFiles) {
        this.cameraFiles = cameraFiles;
    }

}
