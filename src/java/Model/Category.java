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
public class Category {
    private int idCategory;
    private String nameCategory;
    private List<Type> listtype;
    private List<ImageBanner> listImageBanner;
    public Category() {
        listtype = new ArrayList();
        listImageBanner = new ArrayList();
    }

    public Category(int idCategory, String nameCategory, List<Type> listtype) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.listtype = listtype;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Type> getListtype() {
        return listtype;
    }

    public void setListtype(List<Type> listtype) {
        this.listtype = listtype;
    }

    public List<ImageBanner> getListImageBanner() {
        return listImageBanner;
    }

    public void setListImageBanner(List<ImageBanner> listImageBanner) {
        this.listImageBanner = listImageBanner;
    }
    public Type getTypeByID(String idType){
        if(idType != null){
            int id = Integer.parseInt(idType);
            for(Type i :getListtype()){
                if(i.getIdType() == id){
                    return i;
                }
            }
        }
        return null;
    }
}
