package at.hannes.coding.oo.Phone;

public class Phone
{
    private String phoneColor;
    private Camera camera;
    private Sim = sim;
    private SDCard = sdCard;

    public Phone(String phoneColor, Camera camera) {
        this.phoneColor = phoneColor;
        this.camera = camera;
    }

    public void takePicture(){
        SDFiles file = this.camera.makePicture();
        this.SDCard.saveFile(file);
        System.out.println(file.getFileName());
    }

    public void makeCall(){
        this.simd.makeCall(phoneNumber);
    }

    public void printAllFiles(){

    }

}
