
public class Product {

    public Product(String smis, String brandCode, String description, String productNumber, String price, String country, String listPriceUSA, String listPriceCAN) {
        this.smis = smis;
        this.brandCode = brandCode;
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.country = country;
        this.listPriceUSA = listPriceUSA;
        ListPriceCAN = listPriceCAN;
    }

    public  Product() {

    }

    public Product(String smis, String brandCode, String description, String productNumber, String price, String country) {
        this.smis = smis;
        this.brandCode = brandCode;
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.country = country;
    }

    public Product(String smis, String brandCode, String description, String productNumber) {
        this.smis = smis;
        this.brandCode = brandCode;
        this.description = description;
        this.productNumber = productNumber;
    }

    public String getSmis() {
        return smis;
    }

    public void setSmis(String smis) {
        this.smis = smis;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    private String smis;
    private String brandCode;
    private  String description;
    private String productNumber;
    private  String price;
    private  String country;
    private  String listPriceUSA;
    private String ListPriceCAN;

    public String getListPriceUSA() {
        return listPriceUSA;
    }

    public void setListPriceUSA(String listPriceUSA) {
        this.listPriceUSA = listPriceUSA;
    }

    public String getListPriceCAN() {
        return ListPriceCAN;
    }

    public void setListPriceCAN(String listPriceCAN) {
        ListPriceCAN = listPriceCAN;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Product{" +
                "smis='" + smis + '\'' +
                ", brandCode='" + brandCode + '\'' +
                ", description='" + description + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", price='" + price + '\'' +
                ", country='" + country + '\'' +
                ", listPriceUSA='" + listPriceUSA + '\'' +
                ", ListPriceCAN='" + ListPriceCAN + '\'' +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
