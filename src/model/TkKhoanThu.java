/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TT
 */
public class TkKhoanThu {
    private int MaHo;
    private int MaKhoanThu;
    private String TrangThai;

    public TkKhoanThu(int MaHo, int MaKhoanThu, String TrangThai) {
        this.MaHo = MaHo;
        this.MaKhoanThu = MaKhoanThu;
        this.TrangThai = TrangThai;
    }

    public int getMaHo() {
        return MaHo;
    }

    public void setMaHo(int MaHo) {
        this.MaHo = MaHo;
    }

    public int getMaKhoanThu() {
        return MaKhoanThu;
    }

    public void setMaKhoanThu(int MaKhoanThu) {
        this.MaKhoanThu = MaKhoanThu;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
