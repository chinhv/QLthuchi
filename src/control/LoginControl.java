/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import context.ConnectDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NhanVien;

/**
 *
 * @author TT
 */
public class LoginControl {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public NhanVien login(String email, String MatKhau){
        String query = "select * from nhanvien where Email = ? and MatKhau = ?";
        try{
            conn = new ConnectDb().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, MatKhau);
            rs = ps.executeQuery();
            while(rs.next()){
                return new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        }catch(Exception e){
            
        }
        return null;
    }
}
