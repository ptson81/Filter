package dal;

import java.sql.*;
import Models.*;
import java.util.*;

public class DAO {

    private Connection con;
    private List<UserInfo> us;
    private String status = "ok";

    public List<UserInfo> getUs() {
        return us;
    }

    public void setUs(List<UserInfo> us) {
        this.us = us;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DAO() {
        con = new DBContext().connection;
    }

    public UserInfo LoadLogin(String user, String pass) {
        String query = "select * from UserInfo where id = ? and pass =?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new UserInfo(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
        } catch (Exception e) {
        }
        return null;
    }

}
