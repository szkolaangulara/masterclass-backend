package szkolaangulara.com.data;

public class CarBest {
    private String carBrand;
    private String carModel;
    private Integer carPrice;
    private String carPhoto;

    CarBest(String carBrand, String carModel, Integer carPrice, String carPhoto) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carPhoto = carPhoto;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto;
    }
}