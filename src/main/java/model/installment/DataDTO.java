package model.installment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDTO {

    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("products")
    private Object products;
    @JsonProperty("response")
    private ResponseDTO response;
    @JsonProperty("filter")
    private long filter;
    @JsonProperty("banners")
    private long banners;
    @JsonProperty("branch")
    private long branch;
    @JsonProperty("message")
    private long message;
    @JsonProperty("productCount")
    private long productCount;
    @JsonProperty("title")
    private String title;
    @JsonProperty("isAlternate")
    private long isAlternate;
    @JsonProperty("storeId")
    private int storeId;


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Object getProducts() {
        return products;
    }

    public void setProducts(Object products) {
        this.products = products;
    }

    public ResponseDTO getResponse() {
        return response;
    }

    public void setResponse(ResponseDTO response) {
        this.response = response;
    }

    public long getFilter() {
        return filter;
    }

    public void setFilter(long filter) {
        this.filter = filter;
    }

    public long getBanners() {
        return banners;
    }

    public void setBanners(long banners) {
        this.banners = banners;
    }

    public long getBranch() {
        return branch;
    }

    public void setBranch(long branch) {
        this.branch = branch;
    }

    public long getMessage() {
        return message;
    }

    public void setMessage(long message) {
        this.message = message;
    }

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(long productCount) {
        this.productCount = productCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIsAlternate() {
        return isAlternate;
    }

    public void setIsAlternate(long isAlternate) {
        this.isAlternate = isAlternate;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
