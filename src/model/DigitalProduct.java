package model;

public class DigitalProduct extends Product{

    private double fileSize;
    private String fileFormat;

    public DigitalProduct(String productID, String name, String description,
                          double price, double fileSize,String fileFormat) {
        super(productID, name, description, price);
        setFileSize(fileSize);
        setFileFormat(fileFormat);
    }
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return super.toString() + "DigitalProduct{" +
                "fileSize=" + fileSize +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
