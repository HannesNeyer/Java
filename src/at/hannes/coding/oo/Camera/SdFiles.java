package at.hannes.coding.oo.Camera;

public class SdFiles
{
    private String dataTyp;
    private int fileSize;
    private String fileName;
    private int fileNumber;

    public SdFiles (String dataTyp, int fileSize, String fileName) {
        this.dataTyp = dataTyp;
        this.fileSize = fileSize;
        this.fileName = fileName;
    }

    public String getDataTyp() {
        return dataTyp;
    }

    public void setDataTyp(String dataTyp) {
        this.dataTyp = dataTyp;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
    }
}
