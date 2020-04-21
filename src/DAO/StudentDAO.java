/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Account;
import entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trần Việt
 */
public class StudentDAO {

    public List<Student> getAll() {
        String sql = "SELECT * FROM Student where exist = 1";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) //excure query trong data base
        {
            ResultSet rs = ps.executeQuery();

            List<Student> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7),
                        rs.getInt(8),
                        rs.getBoolean(10),
                        rs.getString(11)
                )
                );
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Student getOne(String roll) {
        String sql = "SELECT * FROM Student where exist = 1 and roll_Number = ?";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) //excure query trong data base
        {
            ps.setObject(1, roll);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7),
                        rs.getInt(8),
                        rs.getBoolean(10),
                        rs.getString(11)
                );
            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Student student) {
        int check = 0;
        String sql = "INSERT INTO Student(roll_Number, full_Name, gender,date,address,status,sesion,exist,isInDOM,phone_Number)"
                + " VALUES(? , ? , ? , ? , ? , ? , ? , ? , ? ,? )";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, student.getRoll());
            ps.setObject(2, student.getName());
            ps.setObject(4, student.getDate());
            ps.setObject(3, student.isGender());
            ps.setObject(5, student.getAddress());
            ps.setObject(6, student.isStatus());
            ps.setObject(7, student.getSesion());
            ps.setObject(8, 1);
            ps.setObject(9, false);
            ps.setObject(10, student.getPhone());

            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    /**
     * Xóa Quyền Truy Cập của 1 Account
     *
     * @param userName
     * @return
     */
    public boolean delete(String userName) {
        int check = 0;
        String sql = "UPDATE Student set exist = ? "
                + "WHERE roll_Number = ?";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, 0);
            ps.setObject(2, userName);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public int Rollnumber() {
        int check = 0;
        String sql = "SELECT top 1  ID\n"
                + "FROM     Student\n"
                + "order by id desc";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return -1;
    }

    public static void main(String[] args) {
        // System.out.println(new AccountDAO().add(new Account(0, "SE1222", "123456", 2, true, "123456")));
        System.out.println(new StudentDAO().add(new Student(0, "SE1234", "Đỗ Hữu Trường", true, "1999-02-08", "Hưng Yên - Việt Nam", true, 2, false, "1111")));
    }
}
