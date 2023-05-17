/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import context.ConnectDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import model.KhoanThu;
import model.TkKhoanThu;

/**
 *
 * @author TT
 */
public class TkKhoanThuControl {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<TkKhoanThu> getListKhoanThuByMaHo(int MaHo){
        List<TkKhoanThu> list = new ArrayList<>();
        String query = "select * from tkkhoanthu where MaHo = ?";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, MaHo);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TkKhoanThu(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public List<TkKhoanThu> sortKhoanThuByTrangThai(String sort, int MaHo){
        List<TkKhoanThu> list = new ArrayList<>();
        String query = "SELECT * FROM tkkhoanthu WHERE MaHo = ? AND TrangThai = ? ";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, MaHo);
            ps.setString(2, sort);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TkKhoanThu(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
     public KhoanThu getKhoanThuById(int MaKhoanThu){
        String query = "select * from khoanthu where MaKhoanThu = ?";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, MaKhoanThu);
            rs = ps.executeQuery();
            while(rs.next()){
                return new KhoanThu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        }catch(Exception e){
            
        }
        return null;
    }
}
