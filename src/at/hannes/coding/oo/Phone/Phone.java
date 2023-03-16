package at.hannes.coding.oo.Phone;

public class Phone
{
    private String phoneColor;
    private Camera camera;
    private Sim sim;
    private SDCard sdCard;


    public Phone(String phoneColor, Camera camera, Sim sim, SDCard sdCard) {
        this.phoneColor = phoneColor;
        this.camera = camera;
        this.sim = sim;
        this.sdCard = sdCard;
    }

    public void takePicture(){
        System.out.println("processing image");
        SDFiles file = this.camera.makePicture();
        this.sdCard.SavePhoneFiles(file);
        System.out.println(file.getFileName());
    }

    public void makeCall(){
        this.sim.MakeCall(this.sim.getPhoneNumber());
    }

    public void getFreeSpace(){
        System.out.println("You don´t have enough free space");
        this.sdCard.getFreeSpace();
    }
    public void printAllFiles(){
        System.out.println("Your Files: ");
        this.sdCard.getAllFiles();
    }

}
