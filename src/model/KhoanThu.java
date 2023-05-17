/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TT
 */
public class KhoanThu {
    private int MaKhoanThu;
    private String TenKhoanThu;
    private String LoaiKhoanThu;
    private int Sotien;

    public KhoanThu(int MaKhoanThu, String TenKhoanThu, String LoaiKhoanThu, int Sotien) {
        this.MaKhoanThu = MaKhoanThu;
        this.TenKhoanThu = TenKhoanThu;
        this.LoaiKhoanThu = LoaiKhoanThu;
        this.Sotien = Sotien;
    }

    public int getMaKhoanThu() {
        return MaKhoanThu;
    }

    public void setMaKhoanThu(int MaKhoanThu) {
        this.MaKhoanThu = MaKhoanThu;
    }

    public String getTenKhoanThu() {
        return TenKhoanThu;
    }

    public void setTenKhoanThu(String TenKhoanThu) {
        this.TenKhoanThu = TenKhoanThu;
    }

    public String getLoaiKhoanThu() {
        return LoaiKhoanThu;
    }

    public void setLoaiKhoanThu(String LoaiKhoanThu) {
        this.LoaiKhoanThu = LoaiKhoanThu;
    }

    public int getSotien() {
        return Sotien;
    }

    public void setSotien(int Sotien) {
        this.Sotien = Sotien;
    }
    
}
