public class Price {
    private String smis;

    public String getSmis() {
        return smis;
    }

    public void setSmis(String smis) {
        this.smis = smis;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Price(String smis, String listPrice, String country) {
        this.smis = smis;
        this.listPrice = listPrice;
        this.country = country;
    }

    private String listPrice;
    private  String country;
    private String listPriceUSA;

    public Price(String smis, String listPrice, String country, String listPriceUSA, String listPriceCAN) {
        this.smis = smis;
        this.listPrice = listPrice;
        this.country = country;
        this.listPriceUSA = listPriceUSA;
        this.listPriceCAN = listPriceCAN;
    }

    @Override
    public String toString() {
        return "Price{" +
                "smis='" + smis + '\'' +
                ", listPrice='" + listPrice + '\'' +
                ", country='" + country + '\'' +
                ", listPriceUSA='" + listPriceUSA + '\'' +
                ", listPriceCAN='" + listPriceCAN + '\'' +
                '}';
    }

    public String getListPriceUSA() {
        return listPriceUSA;
    }

    public void setListPriceUSA(String listPriceUSA) {
        this.listPriceUSA = listPriceUSA;
    }

    public String getListPriceCAN() {
        return listPriceCAN;
    }

    public void setListPriceCAN(String listPriceCAN) {
        this.listPriceCAN = listPriceCAN;
    }

    private String listPriceCAN;


}
