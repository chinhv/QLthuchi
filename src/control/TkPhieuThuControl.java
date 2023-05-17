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
import model.HoKhau;
import model.TkPhieuThu;

/**
 *
 * @author TT
 */
public class TkPhieuThuControl {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<TkPhieuThu> getAllTkPhieuThu(){
        List<TkPhieuThu> list = new ArrayList<>();
        String query = "select * from tkphieuthu";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TkPhieuThu(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public List<TkPhieuThu> sortTkPhieuThuByTongTien(String sort){
        List<TkPhieuThu> list = new ArrayList<>();
        String query1 = "SELECT * FROM tkphieuthu ORDER BY TongTien DESC";
        String query2 = "SELECT * FROM tkphieuthu ORDER BY TongTien ASC";
        try{
            conn = new ConnectDb().getConnection();
            if(sort.equals("Giảm dần")){
                ps = conn.prepareStatement(query1);
                rs = ps.executeQuery();
                while(rs.next()){
                    list.add(new TkPhieuThu(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
                }
            }else if(sort.equals("Tăng dần")){
                ps = conn.prepareStatement(query2);
                rs = ps.executeQuery();
                while(rs.next()){
                    list.add(new TkPhieuThu(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
                }
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public HoKhau getHoKhauById(int id){
        String query = "select * from hokhau where MaHo = ?";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                return new HoKhau(rs.getInt(1), rs.getInt(2), rs.getString(3));
            }
        }catch(Exception e){
            
        }
        return null;
    }
}
