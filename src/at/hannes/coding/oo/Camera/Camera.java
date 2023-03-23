package at.hannes.coding.oo.Camera;

import at.hannes.coding.oo.Phone.SDFiles;

public class Camera {
    public enum Resolution {Klein, Mittel, Groß};

    private Resolution resolution;
    private double weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private SdCard sdCard;

    public Camera(double weight, String color, Producer producer, Lens lens, SdCard sdCard,Resolution resolution ) {
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.sdCard = sdCard;
        this.resolution = resolution;
    }

    public SdFiles takePicture(){
        System.out.println("processing image");
        SdCard CameraFile = new
        filenumber ++;
        return CameraFile;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}