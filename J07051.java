/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienPhong;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.text.ParseException;
/**
 *
 * @author LinhNguyenDuc
 */
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<KH> ds = new ArrayList<>();
        for(int i=0;i<t;i++){
            ds.add(new KH("KH"+String.format("%02d",i+1),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(KH it:ds){
            System.out.println(it);
        }
    }
}
