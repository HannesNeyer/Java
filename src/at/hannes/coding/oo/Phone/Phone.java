package at.hannes.coding.oo.Phone;

public class Phone
{
    private String phoneColor;
    private Camera camera;


    public void takePicture(){
        SDFiles file = this.camera.makePicture();
        this.SDCard.saveFile(file);
    }

}
