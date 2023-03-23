package at.hannes.coding.oo.Camera;

import at.hannes.coding.oo.Phone.LensProducer;

public class Lens
{
    private String focalLength;
    private LensProducer lensProducer;

    public Lens(String focalLength, LensProducer lensProducer) {
        this.focalLength = focalLength;
        this.lensProducer = lensProducer;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public LensProducer getLensProducer() {
        return lensProducer;
    }
}
