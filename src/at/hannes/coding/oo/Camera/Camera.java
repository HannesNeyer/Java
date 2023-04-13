package at.hannes.coding.oo.Camera;

import at.hannes.coding.oo.Phone.SDFiles;
import java.time.LocalDate;

public class Camera {
    public enum Resolution {Klein, Mittel, Groß};

    private Resolution resolution;
    private double weight;
    private String color;
    private Lens lens;
    private SdFiles SdFiles;
    private SdCard SdCard;
    private int fileNumber;


    public Camera(double weight, String color,Resolution resolution ) {
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
    }

    public SdFiles takePicture() {
        if (SdCard.getCapacity()-this.SdFiles.getFileSize() > 0) {
            System.out.println("processing image");
            SdFiles sdFiles = new SdFiles("jpg", 2, "768zvzu7rtzt7iugz" + fileNumber, "13.04.2023");
            fileNumber++;
            SdCard.setCapacity(SdCard.getCapacity()-this.SdFiles.getFileSize());
        } else {
            System.out.println("Not enough space");
        }
        return SdFiles;
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