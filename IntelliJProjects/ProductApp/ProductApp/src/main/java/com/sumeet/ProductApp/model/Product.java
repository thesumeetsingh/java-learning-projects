package com.sumeet.ProductApp.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    private String prodType;
    @Id
    private String prodId;
    private String prodName;
    private int prodPrice;

    public Product(){

    }
    public Product(String prodType, String prodId, String prodName, int prodPrice) {
        this.prodType = prodType;
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }
}
