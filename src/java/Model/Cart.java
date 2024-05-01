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
public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList();
    }

    public List<Item> getAllItemfromCart() {
        return items;
    }

    public int getQuantityProductByID(int idProduct) {
        return getItemByID(idProduct).getTotalProduct();
    }

    private Item getItemByID(int id) {
        for (Item i : items) {
            if (i.getProduct().getIdProduct() == id) {
                return i;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        if(getItemByID(item.getProduct().getIdProduct())!= null){ // kiem tra 1 item co id product la x co ton tai, ton tai != null, nguoc lai  = null
            Item m=getItemByID(item.getProduct().getIdProduct());
            m.setTotalProduct(m.getTotalProduct()+item.getTotalProduct());
        }else
            items.add(item);  
    }

    public void removeItem(int id) {
        if (getItemByID(id) != null) { // nếu như co tồn tại 1 item có id product giống với tham số mình truyền
            Item temp = getItemByID(id);
            items.remove(temp); // gọi list item
        }
    }

    public int getTotalMoney() {
        int money = 0;
        for (Item i : items) {
            money += (i.getPrice() * i.getTotalProduct());
        }
        return money;
    }

    public Product getProductByID(int id, List<Product> listProduct) {
        for (Product i : listProduct) {
            if (i.getIdProduct() == id) {
                return i;
            }
        }
        return null;
    }

    public Cart(String txt, List<Product> listProduct) {
        items = new ArrayList();
        try {
            if (txt != null && txt.length() != 0) {
                String[] listItemFromCookie = txt.split("!");
                for (String i : listItemFromCookie) {
                    String[] formatItem = i.split(":");
                    String idProduct = formatItem[0];
                    int id = Integer.parseInt(idProduct);
                    int quantity = Integer.parseInt(formatItem[1]);
                    String capacity = formatItem[2];// color
                    Product product = getProductByID(id, listProduct);
                    Item item = new Item(product, product.getSalePrice(), quantity);
                    item.setCapacity(capacity); // color
                    addItem(item);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public int getQuantityItem(){
        return items.size();
    }
    public void setQuantityItem(int idProduct, int val){ // 1 || -1 => 3 + val = 4, 
        Item i = getItemByID(idProduct);
        int total = i.getTotalProduct()+val;
        if(total>=1 && total <= i.getProduct().getQuantity()){
            i.setTotalProduct(total);
        }
    }
}
