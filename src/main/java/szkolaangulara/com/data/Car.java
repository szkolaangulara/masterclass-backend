package szkolaangulara.com.data;

public class Car {
    private String brand;
    private String model;
    private Integer price;
    private String photoSource;

    Car(String brand, String model, Integer price, String photoSource) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.photoSource = photoSource;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhotoSource() {
        return photoSource;
    }

    public void setPhotoSource(String photoSource) {
        this.photoSource = photoSource;
    }
}