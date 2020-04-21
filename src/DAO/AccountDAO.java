/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Account;
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
public class AccountDAO {

    /**
     *  Lấy tất cả thông tin Account
     * @return
     */
    public List<Account> getAll() {
        String sql = "SELECT * FROM Account where exist = 1";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) //excure query trong data base
        {
            ResultSet rs = ps.executeQuery();

            List<Account> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBoolean(6))
                );
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    /**
     *  Thêm Vào 1 Account 
     * @param account
     * @return
     */
    public boolean add(Account account) {
        int check = 0;
        String sql = "INSERT INTO Account(user_Name, password, type, question, exist)"
                + " VALUES(?, ?, ?, ?, ? )";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, account.getUserName());
            ps.setObject(2, account.getPassword());
            ps.setObject(3, account.getType());
            ps.setObject(4, account.getQuestion());
            ps.setObject(5, 1);
            
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    /**
     *  Thay đổi thông tin 1 Account
     * @param account
     * @return
     */
    public boolean update(Account account) {
        int check = 0;
        String sql = "UPDATE account set password =?,question = ?, type =? "
                + "WHERE  user_Name =?";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
           
            ps.setObject(1, account.getPassword());
            ps.setObject(2, account.getQuestion());
            ps.setObject(3, account.getType());
            
            ps.setObject(4, account.getUserName());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    /**
     *  Xóa Quyền Truy Cập của 1 Account
     * @param userName
     * @return
     */
    public boolean delete(String userName) {
        int check = 0;
        String sql = "UPDATE Account set exist =? "
                + "WHERE user_Name = ?";

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

    /**
     *  Check 1 Account có tồn tại không
     * @param username
     * @param pass
     * @return
     */
    public Account login(String username, String pass) {
        String sql = "SELECT * FROM Account "
                + "WHERE user_Name = ? and password =? and exist = 1";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, username);
            ps.setObject(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBoolean(6)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    /**
     *  Kiểm tra user_Name đã tồn tại hay chưa
     * @param username
     * @return
     */
    public boolean isDuplicate(String username) {
        String sql = "SELECT * FROM Account "
                + "WHERE user_Name = ?";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, username);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    /**
     *  Lấy Lại Mật Khẩu
     * @param username
     * @param PIN(Question)
     * @return
     */
    public Account forgotPass(String username, String PIN) {
        String sql = "SELECT * FROM Account "
                + "WHERE user_Name = ? and question =? and exist = 1";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);)//try with resourse 
        {
            ps.setObject(1, username);
            ps.setObject(2, PIN);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBoolean(6));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
