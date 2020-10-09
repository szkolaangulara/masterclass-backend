package szkolaangulara.com.data;

public class CarTop {
    private String topMarka;
    private String topModel;
    private Integer topCena;
    private String topZdjecie;

    CarTop(String topMarka, String topModel, Integer topCena, String topZdjecie) {
        this.topMarka = topMarka;
        this.topModel = topModel;
        this.topCena = topCena;
        this.topZdjecie = topZdjecie;
    }

    public String getTopMarka() {
        return topMarka;
    }

    public void setTopMarka(String topMarka) {
        this.topMarka = topMarka;
    }

    public String getTopModel() {
        return topModel;
    }

    public void setTopModel(String topModel) {
        this.topModel = topModel;
    }

    public Integer getTopCena() {
        return topCena;
    }

    public void setTopCena(Integer topCena) {
        this.topCena = topCena;
    }

    public String getTopZdjecie() {
        return topZdjecie;
    }

    public void setTopZdjecie(String topZdjecie) {
        this.topZdjecie = topZdjecie;
    }
}