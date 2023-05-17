/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TT
 */
public class TkPhieuThu {
    private int ID;
    private int MaHo;
    private int TongTien;

    public TkPhieuThu(int ID, int MaHo, int TongTien) {
        this.ID = ID;
        this.MaHo = MaHo;
        this.TongTien = TongTien;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaHo() {
        return MaHo;
    }

    public void setMaHo(int MaHo) {
        this.MaHo = MaHo;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    @Override
    public String toString() {
        return "TkPhieuThu{" + "ID=" + ID + ", MaHo=" + MaHo + ", TongTien=" + TongTien + '}';
    }
    
}
