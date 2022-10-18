/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienPhong;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author LinhNguyenDuc
 */
public class KH implements Comparable<KH>{
    private String id;
    private String name ;
    private String idRoom ;
    private Date date1;
    private Date date2;
    private int services;
    private long date;
    private long money;

    public KH() {
    }

    public String ch_name(String name) {
        name = name.toLowerCase();
        name = name.trim();
        String[] x = name.split("\\s+");
        name = "";
        for(int i=0;i<x.length;i++){
            char[] a = x[i].toCharArray();
            a[0] = Character.toUpperCase(a[0]);
            x[i] = String.valueOf(a);
            name+=x[i];
            name+=" ";
        }
        name = name.trim();
        return name;
    }
    public KH(String id, String name, String idRoom, String date1, String date2, int services) throws ParseException {
        this.id = id;
        this.name = ch_name(name);
        this.idRoom = idRoom.trim();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        this.date1 = f.parse(date1);
        this.date2 = f.parse(date2);
        this.date = (this.date2.getTime()-this.date1.getTime());
        this.date = TimeUnit.DAYS.convert(this.date, TimeUnit.MILLISECONDS);
        this.date+=1;
        this.services = services;
        if(this.idRoom.charAt(0)=='1') this.money=this.date*25+(long)this.services;
        else if(this.idRoom.charAt(0)=='2') this.money=this.date*34+(long)this.services;
        else if(this.idRoom.charAt(0)=='3') this.money=this.date*50+(long)this.services;
        else this.money=this.date*80+(long)this.services;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + idRoom + " " + date + " " + money;
    }

    @Override
    public int compareTo(KH o1) {
        return (int) (o1.money-this.money);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
