/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author TT
 */
public class PhieuThu {
    private int MaPhieuThu;
    private int MaKhoanThu;
    private int MaHo;
    private Date NgayThu;
    private int tkphieuthu_id;

    public PhieuThu(int MaPhieuThu, int MaKhoanThu, int MaHo, Date NgayThu, int tkphieuthu_id) {
        this.MaPhieuThu = MaPhieuThu;
        this.MaKhoanThu = MaKhoanThu;
        this.MaHo = MaHo;
        this.NgayThu = NgayThu;
        this.tkphieuthu_id = tkphieuthu_id;
    }

    public int getMaPhieuThu() {
        return MaPhieuThu;
    }

    public void setMaPhieuThu(int MaPhieuThu) {
        this.MaPhieuThu = MaPhieuThu;
    }

    public int getMaKhoanThu() {
        return MaKhoanThu;
    }

    public void setMaKhoanThu(int MaKhoanThu) {
        this.MaKhoanThu = MaKhoanThu;
    }

    public int getMaHo() {
        return MaHo;
    }

    public void setMaHo(int MaHo) {
        this.MaHo = MaHo;
    }

    public Date getNgayThu() {
        return NgayThu;
    }

    public void setNgayThu(Date NgayThu) {
        this.NgayThu = NgayThu;
    }

    public int getTkphieuthu_id() {
        return tkphieuthu_id;
    }

    public void setTkphieuthu_id(int tkphieuthu_id) {
        this.tkphieuthu_id = tkphieuthu_id;
    }
    
}
