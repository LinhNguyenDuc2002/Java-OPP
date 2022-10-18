/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPS;

import java.math.BigInteger;

/**
 *
 * @author LinhNguyenDuc
 */
public class PS {
    private BigInteger tu;
    private BigInteger mau;

    public PS() {
    }

    public PS(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public BigInteger getTu() {
        return tu;
    }

    public void setTu(BigInteger tu) {
        this.tu = tu;
    }

    public BigInteger getMau() {
        return mau;
    }

    public void setMau(BigInteger mau) {
        this.mau = mau;
    }

    public void rutGon(){
        BigInteger a = this.tu.gcd(this.mau);
        this.tu = this.tu.divide(a);
        this.mau = this.mau.divide(a);
    }
    public PS phepTinhC(PS p){
        PS c = new PS();
        BigInteger a = this.mau.multiply(p.mau).divide(this.mau.gcd(p.mau));
        BigInteger a1 = a.divide(this.mau);
        BigInteger a2 = a.divide(p.mau);
        c.tu = this.tu.multiply(a1);
        BigInteger b = p.tu.multiply(a2);
        c.tu = c.tu.add(b);
        c.mau = a;
        c.tu = c.tu.multiply(c.tu);
        c.mau = c.mau.multiply(c.mau);
        return c;
    }

    public void phepTinhD(PS p1,PS p2){
        BigInteger a = p1.tu.multiply(p2.tu);
       // System.out.println(p1.tu+" "+p2.tu+" "+this.tu);
        this.tu = this.tu.multiply(a);
        //System.out.println(this.tu);
        BigInteger b = p1.mau.multiply(p2.mau);
        this.mau = this.mau.multiply(b);
    }  

    @Override
    public String toString() {
        return tu +"/"+ mau;
    }
}
