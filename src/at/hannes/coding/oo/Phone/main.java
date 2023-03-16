package at.hannes.coding.oo.Phone;

public class main
{
    public static void main(String[] args){

        Sim sm1 = new Sim(1,"0650 4420 8899");
        SDCard sd1 = new SDCard(256);
        SDFiles sdf1 = new SDFiles("png",2.5,"djfh43ksjn93");
        Camera c1 = new Camera(1080);
        Phone p1 = new Phone("rose red",c1,sm1,sd1);

        p1.makeCall();
        p1.takePicture();
        p1.printAllFiles();
        p1.getFreeSpace();
        p1.printAllFiles();

    }
}
