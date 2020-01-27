package model.installment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDTO {

    private DataDTO products;


    public DataDTO getProducts() {
        return products;
    }

    public void setProducts(DataDTO products) {
        this.products = products;
    }

}
