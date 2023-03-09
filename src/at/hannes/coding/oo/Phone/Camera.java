package at.hannes.coding.oo.Phone;

public class Camera {

    private int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int makePicture(){
        return resolution;
    }
}
