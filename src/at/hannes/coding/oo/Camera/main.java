package at.hannes.coding.oo.Camera;

import at.hannes.coding.oo.Phone.LensProducer;

public class main
{
    public static void main(String[] args){
        Producer pro = new Producer("Canon","Japan");
        LensProducer lenPro = new LensProducer("Zeis","Germany");
        Lens len = new Lens(25);
        SdCard sdc = new SdCard();
        Camera cam  = new Camera(0.5,"black", Camera.Resolution.Mittel);


    }
}
