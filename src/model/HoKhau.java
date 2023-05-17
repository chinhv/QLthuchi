/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TT
 */
public class HoKhau {
    private int MaHo;
    private int SoNhanKhau;
    private String Diachi;

    public HoKhau(int MaHo, int SoNhanKhau, String Diachi) {
        this.MaHo = MaHo;
        this.SoNhanKhau = SoNhanKhau;
        this.Diachi = Diachi;
    }

    public int getMaHo() {
        return MaHo;
    }

    public void setMaHo(int MaHo) {
        this.MaHo = MaHo;
    }

    public int getSoNhanKhau() {
        return SoNhanKhau;
    }

    public void setSoNhanKhau(int SoNhanKhau) {
        this.SoNhanKhau = SoNhanKhau;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Override
    public String toString() {
        return "HoKhau{" + "MaHo=" + MaHo + ", SoNhanKhau=" + SoNhanKhau + ", Diachi=" + Diachi + '}';
    }
    
}
