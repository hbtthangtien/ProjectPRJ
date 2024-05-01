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
public class Type {
    private int idType;
    private String nameType;
    private List<Product> listproduct;
    private String nameCategory;
    public Type() {
        listproduct = new ArrayList();
    }

    public Type(int idType, String nameType, List<Product> listproduct) {
        this.idType = idType;
        this.nameType = nameType;
        this.listproduct = listproduct;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Product> getListproduct() {
        return listproduct;
    }

    public void setListproduct(List<Product> listproduct) {
        this.listproduct = listproduct;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    
    
}
