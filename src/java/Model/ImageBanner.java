/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hbtth
 */
public class ImageBanner {
    private int idImageBanner;
    private String nameImageBanner;

    public ImageBanner() {
    }

    public ImageBanner(int idImageBanner, String nameImageBanner) {
        this.idImageBanner = idImageBanner;
        this.nameImageBanner = nameImageBanner;
    }

    public int getIdImageBanner() {
        return idImageBanner;
    }

    public void setIdImageBanner(int idImageBanner) {
        this.idImageBanner = idImageBanner;
    }

    public String getNameImageBanner() {
        return nameImageBanner;
    }

    public void setNameImageBanner(String nameImageBanner) {
        this.nameImageBanner = nameImageBanner;
    }
    
}
