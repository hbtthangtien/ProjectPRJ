/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hbtth
 */
public class Product {
    private int idProduct;
    private String nameProduct;
    private int primePrice, salePrice;
    private String desPromotion;
    private int quantity;
    private Type type;
    private List<Image> listImage;
    public Product() {
        listImage = new ArrayList();
    }

    public Product(int idProduct, String nameProduct, int primePrice, int salePrice, String desPromotion, int quantity, Type type) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.primePrice = primePrice;
        this.salePrice = salePrice;
        this.desPromotion = desPromotion;
        this.quantity = quantity;
        this.type = type;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrimePrice() {
        return primePrice;
    }

    public void setPrimePrice(int primePrice) {
        this.primePrice = primePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public String getDesPromotion() {
        return desPromotion;
    }

    public void setDesPromotion(String desPromotion) {
        this.desPromotion = desPromotion;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Image> getListImage() {
        return listImage;
    }

    public void setListImage(List<Image> listImage) {
        this.listImage = listImage;
    }
    
}
