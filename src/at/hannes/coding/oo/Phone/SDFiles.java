package at.hannes.coding.oo.Phone;

public class SDFiles {
    private String dataTyp;
    private double fileSize;
    private String fileName;

    public SDFiles (String dataTyp, double fileSize, String fileName) {
        this.dataTyp = dataTyp;
        this.fileSize = fileSize;
        this.fileName = fileName;
    }

    public void getInfo(){
        System.out.println(this.dataTyp);
        System.out.println(this.fileName);
        System.out.println(this.fileSize);
    }

    public String getDataTyp() {
        return dataTyp;
    }

    public void setDataTyp(String dataTyp) {
        this.dataTyp = dataTyp;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
