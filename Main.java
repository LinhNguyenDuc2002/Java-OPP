/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPS;

import java.util.Scanner;

/**
 *
 * @author LinhNguyenDuc
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t>0){
            PS a = new PS(sc.nextBigInteger(),sc.nextBigInteger());
            PS b = new PS(sc.nextBigInteger(),sc.nextBigInteger());
            PS c = new PS();
            
            a.rutGon(); b.rutGon();
            c = a.phepTinhC(b);
            c.rutGon();
            System.out.printf(c.toString()+" ");
            a.phepTinhD(b, c);
            a.rutGon();
            System.out.println(a.toString());
            t--;
        }
    } 
}
