/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author hbtth
 */
public class FormatMoney {

    public static String format(String m) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList();
        int n = m.length()%3;
        if(n!=0){
            list.add(m.substring(0,n)+'.');
        }
        
        for(int i = n;i<m.length()-3;i+=3){
            list.add(m.substring(i,i+3)+'.');
        }
        if(m.length()>=3){
            list.add(m.substring(m.length()-3,m.length()));
        }
        
        for (String string : list) {
            sb.append(string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(format("1000000"));
    }
}
