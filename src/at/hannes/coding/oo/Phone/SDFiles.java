package at.hannes.coding.oo.Phone;

public class SDFiles {
    private String dataTyp;
    private int fileSize;
    private String fileName;

    public SDFiles (String dataTyp, int fileSize, String fileName) {
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

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void add(SDFiles phoneFiles) {
    }
}
