package at.hannes.coding.oo.Phone;

public class Camera {
    private int resolution;
    private int fileNumber = 0;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public SDFiles makePicture(){
        SDFiles phoneFiles = new SDFiles("png",1000,"scjishkfklsjoghiso "+fileNumber);
        fileNumber ++;
        return phoneFiles;
    }
}
